import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RestoreSpaceURL extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Restore Space URL Rewriting</title></head>");
        out.println("<body class='flex-col'><h1>Restore Space URL Rewriting</h1>");
        out.println("<h2>Planet: " + request.getParameter("space") + "</h2>");
        out.println("<h2>Distance: " + request.getParameter("distance") + "</h2>");
        out.println("</body></html>");
    }
}