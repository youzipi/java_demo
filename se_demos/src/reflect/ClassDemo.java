package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * project_name:java_demo
 * package_name:reflect
 * user: youzipi
 * date: 2014/12/30 21:36
 */
class Tee{
    private int id;
    private String name;
    Tee() {
    }

    Tee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ClassDemo {

    public static void printClassMessage(Object obj){
        Class c = obj.getClass();
        Method[] methods = c.getMethods();//所有方法，包括继承来的
        Method[] methods2 = c.getDeclaredMethods();//方法
        Field[] fields = c.getDeclaredFields();//属性
        Constructor[] constructors =  c.getDeclaredConstructors();//构造方法

        System.out.println("c.getName()="+c.getName());

//        System.out.println("c.getMethods()=");
//        for(Method m:ms){
//            System.out.println(m.getName());
//        }

        System.out.println("c.getDeclaredMethods()=");
        for(Method m:methods2){
            System.out.println(m.getName() + ":");
            Class[] paramTypes = m.getParameterTypes();
            Type type = m.getReturnType();
            System.out.println(type);
            for(Class class1:paramTypes){
                System.out.println(class1.getName());
            }
        }

        System.out.println("c.getFields()");
        for(Field field:fields){
            String fieldType = field.getType().getSimpleName();
            String fieldName = field.getName();
            System.out.println(fieldType+":"+fieldName);
        }

        System.out.println("c.getConstractors()");
        for(Constructor constructor:constructors){
            System.out.println(constructor.getName());
            Class[] paraTypes = constructor.getParameterTypes();
            for (Class paraType : paraTypes) {
                System.out.println(paraType.getSimpleName());
            }


        }


    }


    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Tee.class;
        Class c2 = new Tee().getClass();
        System.out.println(c1);
        System.out.println(c2);
        //c1,c2表示了Tee的类类型（class type）
        System.out.println(c1 == c2);//true
        System.out.println(c1.getName());//class reflect.Tee
        System.out.println(c1.getSimpleName());//class Tee
        System.out.println(c1.getClass());//class java.lang.Class
        System.out.println(c1.getClass().getClass());//class java.lang.Class
        System.out.println("-----------");

        Tee t = new Tee();
        t.setName("youzipi");
        t.setId(18);
        ClassDemo.printClassMessage(t);
        int i = 1;
//        System.out.println(c1.getCon);

//        System.out.println(Class.forName("java.lang.Integer").getName());
        System.out.println();
    }
}
