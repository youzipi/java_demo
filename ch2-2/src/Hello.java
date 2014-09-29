/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2014/8/26
 */
public class Hello {

    public Hello(){
    }

    public String sayHello(String user){
        if (user.equals("youzipi"))
            return "Hello!" + user;
        else
            return "error";
    }
}
