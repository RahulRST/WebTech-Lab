import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

class SpaceSession extends HttpSession {
    @override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = new HttpSession();
        session.setAttribute("planet",request.getParameter("planet"));
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Session Created</h1>");
        out.println("<a href='RestoreSpaceSession'>Click here to see the session</a>");
        out.println("</body></html>");
    }
}