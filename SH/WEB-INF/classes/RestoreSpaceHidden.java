import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RestoreSpaceHidden extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Restore Space Hidden Form Fields</title></head>");
        out.println("<body class='flex-col'><h1>Restore Space Hidden Form Fields</h1>");
        out.println("<h2>Planet: " + request.getParameter("space") + "</h2>");
        out.println("<h2>Distance: " + request.getParameter("distance") + "</h2>");
        out.println("</body></html>");
    }
}