import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SpaceCookie extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie(request.getParameter("space"), request.getParameter("distance"));
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Space Cookie</title></head>");
        out.println("<body class='flex-col'><h1>Space Cookie</h1>");
        out.println("<a href='restorespacecookie'>Click here to see the cookie</a>");
        out.println("</body></html>");
    }
}