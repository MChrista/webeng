
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Lol
 */
@WebServlet("/Lol")
public class Lol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession();
		java.util.Date now = new java.util.Date(session.getCreationTime());
		java.util.Date yes = new java.util.Date(session.getLastAccessedTime());
		long yesmillis=yes.getTime();
		long millis=now.getTime();
		millis=yesmillis-millis;
		millis=millis/1000;
		long sekunden=millis%60;
		millis=millis/60;
		long minuten=millis%60;
		millis=millis/60;
		long stunden=millis%24;
		millis=millis/24;
		long tage=millis;
		System.out.println(tage+":"+stunden+":"+minuten+":"+sekunden);	
		
		pw.println("<html>");
		pw.println("<head><title>Sessionzeit</title></head>");
		pw.println("<body>");
		pw.println("<h1> Sessionzeit</h1>");
		pw.println(tage+":"+stunden+":"+minuten+":"+sekunden);
		pw.println("</body>");
		pw.println("</html>");
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
