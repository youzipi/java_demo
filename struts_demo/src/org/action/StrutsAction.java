package org.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.bean.User;

import java.util.Map;

/**
 * project_name:java_demo
 * package_name:org.action
 * user: youzipi
 * date: 2015/3/27 17:46
 */
public class StrutsAction extends ActionSupport {

    private User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String execute() {
        if (!user.getUsername().equals("test")) {
            Map req = (Map) ActionContext.getContext().get("request");
            req.put("name", user.getUsername());
            return "success";
        } else {
            return "error";
        }
    }



}
