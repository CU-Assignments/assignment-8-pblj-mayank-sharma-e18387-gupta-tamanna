import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EasyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if ("admin".equals(username) && "password123".equals(password)) {
            out.println("<h1>Welcome, " + username + "!</h1>");
        } else {
            out.println("<h1>Login Failed</h1>");
        }
    }
}