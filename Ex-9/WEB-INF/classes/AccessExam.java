import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AccessExam extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username == null) {
            response.sendRedirect("login.html");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head>");
            out.println("<link rel='stylesheet' href='style.css' /> <title>Access Exam</title></head>");
            out.println("<body class='flex-col'><h2>Welcome to the Space Exam!</h2>");
            out.println("<form class='flex-col' action='evaluationexam' method='post'>");
            out.println("Question 1: What is the largest planet in our solar system?");
            out.println("<input type='text' name='answer1'>");
            out.println("Question 2: Who was the first human to walk on the moon?");
            out.println("<input type='text' name='answer2'>");
            out.println("<input type='submit' value='Evaluate'>");
            out.println("</form>");
            out.println("</body></html>");
        }
    }
}
