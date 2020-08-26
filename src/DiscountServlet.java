import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet" , urlPatterns = "/index")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("DiscountPercent"));

        float discountAmount = listPrice*discountPercent* 0.01f;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> listPrice: " + listPrice +"</h1>");
        writer.println("<h1> discountPercent: " + discountPercent +"</h1>");
        writer.println("<h1> discountAmount: " + discountAmount +"</h1>");
        writer.println("<h1> discountPrice: " + (listPrice - discountAmount)  +"</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
