package face;

/**
 * project_name:java_demo
 * package_name:face
 * user: youzipi
 * date: 2015/3/27 16:15
 */
public class American implements Human{
    @Override
    public void eat() {
        System.out.println("KFC");
    }

    @Override
    public void walk() {
        System.out.println("CAR");

    }
}
