package Header;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Parameter
 */
@WebServlet("/Parameter")
public class Parameter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Parameter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>Header</title></head>");
		pw.println("<body>");
		pw.println("<h1>Parameter anzeigen</h1>");
		Enumeration<String> paramterName=request.getParameterNames();
		while(paramterName.hasMoreElements()){
			String name=paramterName.nextElement();
			pw.append("<p> ----------------------- </p>");
			pw.append("<p> Neuer Parameter </p>");
			pw.append("<p>Name: "+name+"</p>");
			String[] param=request.getParameterValues(name);
			for(int i=0;i<param.length;i++){
				System.out.println(param[i]);
				pw.append("<p>Parameterwert "+(i+1)+": "+param[i]+"</p>");
			}
		}
		pw.println("</body>");
		pw.println("</html>");
		pw.flush();
		pw.close();
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
