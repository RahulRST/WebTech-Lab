import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

class SpaceSession extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("planet",request.getParameter("planet"));
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Session Created</h1>");
        out.println("<a href='sestorespacesession'>Click here to see the session</a>");
        out.println("</body></html>");
    }
}