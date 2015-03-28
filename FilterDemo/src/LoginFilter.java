import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2014/11/8 18:26
 */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("start...LoginFilter");
        HttpServletRequest req = (HttpServletRequest)request;
        HttpSession session = req.getSession();
        System.out.println(session.getAttribute("username"));
        if(session.getAttribute("username")!= null){
            chain.doFilter(request,response);
        }
        else{
            System.out.println("cdx");
            ((HttpServletResponse)response).sendRedirect("login.jsp");
        }

    }

    @Override
    public void destroy() {

    }
}
