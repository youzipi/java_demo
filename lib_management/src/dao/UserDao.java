package dao;

import bean.User;
import jdbc.DB;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * project_name:java_demo
 * package_name:dao
 * user: youzipi
 * date: 2014/12/26 20:30
 */
public class UserDao {
    public ArrayList<User> query(){

        ArrayList<User> list = new ArrayList<User>();
        String sql = "select * from user";
        try{
            DB db = new DB();
            ResultSet rs = db.getrs(sql);
            while(rs.next()){
                User user = new User();
                user.setId(rs.getString("id"));
                user.setName(rs.getString("Name"));
                user.setGroup(rs.getString("group"));
                user.setDepartment(rs.getString("department"));
                list.add(user);
            }
            db.closed();

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }
    public int insert(User user){
        try{
            String sql = String.format("INSERT INTO `user` (`name`, `group`, `department`) VALUES ('%s', '%s', '%s');", user.getName(), user.getGroup(), user.getDepartment());

            System.out.println(sql);
            DB db = new DB();
            int num =db.update(sql);
            return num;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return -1;

    }
    public int update(User user){
        try{
            String sql = String.format("UPDATE user SET `name`='%s', `group`='%s', `department`='%s' WHERE (`id`='%s');", user.getName(), user.getGroup(), user.getDepartment(),user.getId());

            System.out.println(sql);
            DB db = new DB();
            int num =db.update(sql);
            return num;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<User> list= new UserDao().query();
        for(User i:list){
            System.out.println(i.getId());
            System.out.println(i.getName());
            System.out.println(i.getGroup());
            System.out.println(i.getDepartment());

        }
    }
}
