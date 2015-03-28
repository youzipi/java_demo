import javax.servlet.*;
import java.io.IOException;

/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2014/11/8
 */
public class SecondFilter implements Filter{

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init2..");
        this.filterConfig = filterConfig;

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long begin = System.currentTimeMillis();
        System.out.println("start..doFilter2");
        chain.doFilter(request, response);
        System.out.println("End...doFilter2");
        filterConfig.getServletContext().log("Request2 process in " + (System.currentTimeMillis() - begin) + "milleseconds");
        System.out.println("Request2 process in " + (System.currentTimeMillis()-begin) + "milleseconds");
    }

    @Override
    public void destroy() {
        System.out.println("destroy2");

    }
}
