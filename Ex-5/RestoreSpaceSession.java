import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RestoreSpaceSession extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Session Restored</h1>");
        out.println("<h2>Planet: " + session.getAttribute("planet") + "</h2>");
        XMLHttpRequest xhr = new XMLHttpRequest(new URL("https://api.le-systeme-solaire.net/rest/bodies/"+session.getAttribute("planet")));
        xhr.responseType = "json";
        xhr.send();
        out.println("</body></html>");
    }
}