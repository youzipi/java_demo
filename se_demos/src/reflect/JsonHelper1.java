package reflect;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Properties;

/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2015/1/4 20:25
 */
public class JsonHelper1 {
//    public String firstToupper(String str){
//        return str.substring(0,1).toUpperCase() + str.substring(1);
//
//    }

    static Object Json2Bean(String jsonstr,String cln) throws JSONException, ClassNotFoundException, IllegalAccessException, InstantiationException, IOException, NoSuchMethodException, InvocationTargetException {
        JSONObject jsonObject = new JSONObject(jsonstr);
//        String classname = cln.substring(0,1).toUpperCase() + cln.substring(1);

        Class classtype = Class.forName(cln);
        Object o = classtype.newInstance();
        System.out.println(o);

        Properties prop = new Properties();
            prop.load(new FileInputStream("D:\\Desktop\\java_demo\\se_demos\\src\\user.properties"));

        for (Object o1 : prop.entrySet()) {
            Map.Entry entry = (Map.Entry) o1;
            String key = ((String) entry.getKey());//.toLowerCase();
            String value = ((String) entry.getValue());//.toLowerCase();
            System.out.println(key + "=" + value);
            String setter = "set"+key.substring(0,1).toUpperCase() + key.substring(1);
            System.out.println(setter);

            if (value.equals("String")) {
                //String paramater = jsonObject.getString(key);
                //Method setmethod = classtype.getMethod(setter, String.class);
                //setmethod.invoke(o,paramater);
                o = JsonHelper1.doSet(value, key, jsonObject, o);
            }
            else if(value.equals("int")){
                int paramater = jsonObject.getInt(key);
                Method setmethod = classtype.getMethod(setter, int.class);
                setmethod.invoke(o,paramater);
//                o = JsonHelper.doSet(1,key,jsonObject,setter,o);
            }
            else if(value.equals("boolean")){
                Boolean paramater = jsonObject.getBoolean((String) key);
                Method setmethod = classtype.getMethod(setter,Boolean.class);
                setmethod.invoke(o,paramater);
            }
            else if(value.equals("double")){
                Double paramater = jsonObject.getDouble((String) key);
                Method setmethod = classtype.getMethod(setter,Double.class);
                setmethod.invoke(o,paramater);
            }
        }
        return o;

    }

    static Class<?> getType(String str) throws ClassNotFoundException {
        Class<?> t = Class.forName(str);
        return t;
    }

    static  <T> Object doSet(String value,String key,JSONObject jsonObject,Object o) throws InvocationTargetException, IllegalAccessException, JSONException, NoSuchMethodException, ClassNotFoundException {
        Class<?> t = Class.forName("java.lang."+value);
        T paramater = (T)jsonObject.getString(key);
        String setter = "set"+key.substring(0,1).toUpperCase() + key.substring(1);
        Method setmethod = o.getClass().getMethod(setter, t);
        setmethod.invoke(o,paramater);
        return o;
    }




    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, JSONException, IllegalAccessException, IOException, NoSuchMethodException, InvocationTargetException {
        Object user = JsonHelper1.Json2Bean("{id:1,name:'youzp',info:'tt'}", "User");
        System.out.println(user);

    }
}
