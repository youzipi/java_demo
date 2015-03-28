import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2014/11/8
 */
public class LoginServlet extends HttpServlet{
    public LoginServlet() {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if("admin".equals(username) && "admin".equals(password)){
            HttpSession session = req.getSession();
            session.setAttribute("username",username);
            resp.sendRedirect(req.getContextPath()+"/success.jsp");
        }
        else{
            resp.sendRedirect(req.getContextPath()+"/fail.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
