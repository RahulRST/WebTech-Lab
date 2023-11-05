import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SpaceSession extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("planet",request.getParameter("planet"));
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Space Session</title></head>");
        out.println("<body class='flex-col'><h1>Session Created</h1>");
        out.println("<a href='restorespacesession'>Click here to see the session</a>");
        out.println("</body></html>");
    }
}