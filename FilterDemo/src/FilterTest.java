import javax.servlet.*;
import java.io.IOException;

/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2014/11/2
 */
public class FilterTest implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init..");
        this.filterConfig = filterConfig;

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long begin = System.currentTimeMillis();
        System.out.println("start..doFilter");
        chain.doFilter(request, response);//放行：执行下一个过滤器，没有则调用Servlet的service方法。
        System.out.println("End...doFilter");
        filterConfig.getServletContext().log("Request process in " + (System.currentTimeMillis() - begin) + "milleseconds");
        System.out.println("Request process in " + (System.currentTimeMillis()-begin) + "milleseconds");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");

    }
}
