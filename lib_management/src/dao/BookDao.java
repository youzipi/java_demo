package dao;

import bean.Book;
import jdbc.DB;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

/**
 * project_name:java_demo
 * package_name:dao
 * user: youzipi
 * date: 2014/12/27 13:29
 */
public class BookDao {
    public ArrayList<Book> init(){

        ArrayList<Book> list = new ArrayList<Book>();
        String sql = "select book.*,publisher.pub_name from book,publisher where book.pub_id = publisher.pub_id;";
        try{
            DB db = new DB();
            ResultSet rs = db.getrs(sql);
            while(rs.next()){
                Book book = new Book();
                book.setId(rs.getString("id"));
                book.setName(rs.getString("name"));
                book.setAmount(rs.getInt("amount"));
                book.setType(rs.getString("type"));
                book.setAuthor(rs.getString("author"));
                book.setPub_time(rs.getString("pub_time"));
                book.setPublisher(rs.getString("pub_name"));
                book.setLocation(rs.getString("location"));
                list.add(book);
            }
            db.closed();

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }
    public ArrayList<Book> query(String keyword){

        ArrayList<Book> list = new ArrayList<Book>();
        String sql = String.format("select book.*,publisher.pub_name from book,publisher where book.`name` like  '%%%s%%' and book.pub_id = publisher.pub_id;", keyword);
        try{
            DB db = new DB();
            ResultSet rs = db.getrs(sql);
            while(rs.next()){
                Book book = new Book();
                book.setId(rs.getString("id"));
                book.setName(rs.getString("name"));
                book.setAmount(rs.getInt("amount"));
                book.setType(rs.getString("type"));
                book.setAuthor(rs.getString("author"));
                book.setPub_time(rs.getString("pub_time"));
                book.setPublisher(rs.getString("pub_name"));
                book.setLocation(rs.getString("location"));
                list.add(book);
            }
            db.closed();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

    public int insert(Book book){
        try{
            String sql = String.format(
                    "INSERT INTO `lib`.`book` (`id`, `name`, `amount`, `type`, `author`, `pub_time`, `pub_id`, `location`) VALUES ('%s', '%s', '%d', '%s', '%s', '%s', '%s', '%s');\n",
                    book.getId(), book.getName(), book.getAmount(), book.getType(), book.getAuthor(), book.getPub_time(), book.getPub_id(), book.getLocation());

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
    public int update(Book book){
        try{
            String sql = String.format(
                    "UPDATE `lib`.`book` SET `name`='%s', `amount`='%d', `type`='%s', `author`='%s', `pub_time`='%s', `pub_id`='%s', `location`='%s' WHERE (`id`='%s');\n",
                    book.getName(), book.getAmount(), book.getType(), book.getAuthor(), book.getPub_time(), book.getPub_id(), book.getLocation(), book.getId());

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
        Collection list= new BookDao().init();
        for(Object i:list){
            Book book = (Book)i;
            System.out.println(book.getId());
            System.out.println(book.getName());
            System.out.println(book.getType());
            System.out.println(book.getAmount());
            System.out.println(book.getAuthor());
            System.out.println(book.getPub_time());
            System.out.println(book.getPublisher());
            System.out.println(book.getLocation());

        }
    }
}