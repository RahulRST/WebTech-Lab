import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EvaluationExam extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer1 = request.getParameter("answer1");
        String answer2 = request.getParameter("answer2");

        String correctAnswer1 = "Jupiter";
        String correctAnswer2 = "Neil Armstrong";

        int score = 0;
        if (answer1.equalsIgnoreCase(correctAnswer1)) {
            score += 50;
        }
        if (answer2.equalsIgnoreCase(correctAnswer2)) {
            score += 50;
        }

        // Store the score in the session for display
        HttpSession session = request.getSession();
        session.setAttribute("score", score);

        // Display the score
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Exam Evaluation</title></head>");
        out.println("<body class='flex-col'><h1>Space Exam Results</h1><h2>Your Score: " + score + "</h2>");
        out.println("</body></html>");
    }
}
