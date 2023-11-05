import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RestoreSpaceSession extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Restore Space Session</title></head>");
        out.println("<body class='flex-col'><h1>Session Restored</h1>");
        out.println("<h2>Planet: " + session.getAttribute("planet") + "</h2>");
        out.println("</body></html>");
    }
}