package ServletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UserServlet() {
        super();
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		String existingEmail = "tom@163.com";
		
		String userEmail = request.getParameter("userEmail");
		
		System.out.println(userEmail);
		
		if(existingEmail.equals(userEmail)) {
			
			writer.write("false");
			
		}else{
			System.out.println("岳不群rq2888fawfa");
			System.out.println("哈哈哈6666666666666666");
			writer.write("true");
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	}

}
