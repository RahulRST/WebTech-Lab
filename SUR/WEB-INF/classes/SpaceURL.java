import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SpaceURL extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Space URL Rewriting</title></head>");
        out.println("<body class='flex-col'><h1>Space URL Rewriting</h1>");
        out.println("<a href='restorespaceurl?space=" + request.getParameter("space") + "&distance=" + request.getParameter("distance") + "'>Click here to see the URL</a>");
        out.println("</body></html>");
    }
}