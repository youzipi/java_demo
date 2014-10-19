package nicebuild.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Tagcloud tagcloud[]=new Tagcloud[9]; 
		 tagcloud[0]=new Tagcloud("html","12");
		 tagcloud[1]=new Tagcloud("css","7");
		 tagcloud[2]=new Tagcloud("C++","9");
		 tagcloud[3]=new Tagcloud("linux","11");
		 tagcloud[4]=new Tagcloud("ajax","13");
		 tagcloud[5]=new Tagcloud("jsp","7");
		 tagcloud[6]=new Tagcloud("c#","8");
		 tagcloud[7]=new Tagcloud("jquery","11");
		 tagcloud[8]=new Tagcloud("JS","10");
		 String str=new Tagcloud().outputArray(tagcloud);
		response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  out.write(str);
	}
}
