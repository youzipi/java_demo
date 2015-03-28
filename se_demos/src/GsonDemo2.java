import com.google.gson.Gson;

/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2015/1/4 21:23
 */
public class GsonDemo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Gson gson = new Gson();
        Object user = gson.fromJson("{id:1,name:'youzp'}", Class.forName("User"));
        System.out.println(user);
    }
}
