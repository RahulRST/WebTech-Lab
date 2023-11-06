import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SpaceHidden extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Space Hidden Form Fields</title></head>");
        out.println("<body class='flex-col'><h1>Space Hidden Form Fields</h1>");
        out.println("<form action='restorespacehidden' method='post'>");
        out.println("<input type='hidden' name='space' value='" + request.getParameter("space") + "' />");
        out.println("<input type='hidden' name='distance' value='" + request.getParameter("distance") + "' />");
        out.println("<input type='submit' value='Restore' />");
        out.println("</form></body></html>");
    }
}