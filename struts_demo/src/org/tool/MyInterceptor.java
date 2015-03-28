package org.tool;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.action.StrutsAction;

import java.util.Map;

/**
 * project_name:java_demo
 * package_name:org.tool
 * user: youzipi
 * date: 2015/3/28 15:36
 */
public class MyInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        StrutsAction action = (StrutsAction)actionInvocation.getAction();

        if(action.getUser().getUsername().equals("tt")){
            System.out.println("MyInterceptor");
            Map req = (Map) ActionContext.getContext().get("request");
            req.put("name", "tt");
            return Action.ERROR;
        }
        return actionInvocation.invoke();
    }
}
