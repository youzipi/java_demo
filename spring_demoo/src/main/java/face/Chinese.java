package main.java.face;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * project_name:java_demo
 * package_name:face
 * user: youzipi
 * date: 2015/3/27 16:13
 */
public class Chinese implements Human {
    @Override
    public void walk() {
        System.out.println("Chinese walk");
    }

    @Override
    public void eat() {
        System.out.println("Chinese eat");

    }

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        Human human;
                human = (Human)ctx.getBean("chinese");
    }
}
