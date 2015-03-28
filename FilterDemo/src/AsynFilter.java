import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2014/11/8
 */
@WebFilter(filterName = "ASynFilter",value = {"/index.jsp"},dispatcherTypes = {DispatcherType.REQUEST,DispatcherType.ASYNC})
public class AsynFilter implements Filter{
    public AsynFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Start...AsynFilter");
        chain.doFilter(request,response);
        System.out.println("End...AsynFilter");

    }

    @Override
    public void destroy() {

    }
}
