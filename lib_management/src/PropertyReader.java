import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2014/12/30 16:21
 */
public class PropertyReader {
    Properties prop = new Properties();
    private String filePath;
    private String dirpath = "D:\\Desktop\\java_demo\\lib_management\\src\\";

    public PropertyReader(String filePath){
        this.filePath = filePath;
        this.load();
    }
    public void load(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(dirpath+filePath);
            prop.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Properties getValue(){
        Set keys = prop.keySet();
        for(Object key:keys){
            System.out.println(key+"="+prop.get(key));
        }

        Iterator it = prop.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey()+"="+entry.getValue());

        }
        return prop;

    }

    public static void main(String[] args) {
        PropertyReader reader = new PropertyReader("user.properties");
        reader.load();
        Properties pro = reader.getValue();
        System.out.println("--------");

        //或者下面就够了
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("D:\\Desktop\\java_demo\\lib_management\\src\\user.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(p.getProperty("name"));

    }

}
