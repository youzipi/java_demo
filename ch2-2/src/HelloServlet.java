import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * project_name:java_demo
 * package_name:PACKAGE_NAME
 * user: youzipi
 * date: 2014/8/26
 */
public class HelloServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
                                  HttpServletResponse response)
        throws ServletException,IOException{

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Servlet ShowHeader at " + request.getContextPath() + "</h1>");
        Enumeration e = request.getHeaderNames();
        while (e.hasMoreElements()){
            String param = (String)e.nextElement();
            out.println(param + ":" + request.getHeader(param) + "<br />");
        }
        out.close();
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
    throws ServletException, IOException{
        response.setContentType("text/html;charset=utf-8");

        String name = request.getParameter("name");

        Hello hello = new Hello();
        String message = hello.sayHello(name);

        request.setAttribute("message",message);
        RequestDispatcher view = request.getRequestDispatcher("hello.jsp");
        view.forward(request,response);
    }
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }
}
