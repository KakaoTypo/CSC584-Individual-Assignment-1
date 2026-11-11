import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet(name = "ProfileServlet", urlPatterns = {"/ProfileServlet"})
public class ProfileServlet extends HttpServlet {

    // Simple XSS sanitization helper
    private String sanitize(String input) {
        if (input == null) return "";
        return input.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#x27;");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Extract and sanitize inputs
        String name = sanitize(request.getParameter("name"));
        String studentId = sanitize(request.getParameter("studentId"));
        String programme = sanitize(request.getParameter("programme"));
        String email = sanitize(request.getParameter("email"));
        String hobbies = sanitize(request.getParameter("hobbies"));
        String bio = sanitize(request.getParameter("bio"));

        // Pass attributes forward
        request.setAttribute("userName", name);
        request.setAttribute("userStudentId", studentId);
        request.setAttribute("userProgramme", programme);
        request.setAttribute("userEmail", email);
        request.setAttribute("userHobbies", hobbies);
        request.setAttribute("userBio", bio);

        RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
        dispatcher.forward(request, response);
    }
}