package bean;

/**
 * project_name:java_demo
 * package_name:bean
 * user: youzipi
 * date: 2014/12/26 20:28
 */
public class User {
    private String id;
    private String name;
    private String group;
    private String department;

    public User() {
    }

    public User(String id, String name, String group, String department) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {

    }
}
