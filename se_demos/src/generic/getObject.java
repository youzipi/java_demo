package generic;

/**
 * project_name:java_demo
 * package_name:generic
 * user: youzipi
 * date: 2015/1/5 11:01
 */
public class getObject<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        getObject<String> strObj = new getObject<String>();
        strObj.setObj("Hee");
        System.out.println(strObj.getObj());
        System.out.println(strObj.getObj().getClass());

        getObject<Double> douObj = new getObject<Double>();
        douObj.setObj(11.0);
        System.out.println(douObj.getObj());
        System.out.println(douObj.getObj().getClass());
//        douObj.setObj("Ss");
        System.out.println(douObj.getObj());
        System.out.println(douObj.getObj().getClass());

        Integer[] ia = new Integer[5];
        Number[] na = ia;//Integer
        System.out.println(na.getClass());
        System.out.println(ia.getClass());
    }
}
