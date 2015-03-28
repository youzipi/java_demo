import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.LinkedList;
import java.util.List;

/**
 * project_name:java_demo
 * package_name:reflect
 * user: youzipi
 * date: 2015/1/1 15:42
 */
public class GsonDemo {


    public static void main(String[] args) {

        Gson gson = new Gson();

        User u = new User(1, "youzipi");
//        User u = new User();
        System.out.println(u.getClass().getName());
        String str = gson.toJson(u);
        System.out.println(str);

        //User u2 = null;
        Object u2 = null;
        try {
            u2 = gson.fromJson("{id:1,name:youzi}", Class.forName("User"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(u2);
        System.out.println(u2.getClass());

        List<User> list = new LinkedList<User>();
        User ut = null;
        for (int i = 0; i < 3; i++) {
           ut = new User(i, "s" + i);
//            ut = new User();
            list.add(ut);
        }
        String s2 = gson.toJson(list);
        System.out.println(s2);

        List<User> user_list = gson.fromJson(s2, new TypeToken<List<User>>() {
        }.getType());
        for (User user : user_list) {
            System.out.println(user);
        }



    }
}
