import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name="DiscountServlet", value="/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer price = Integer.parseInt(req.getParameter("ListPrice"));
        Integer discountnt = Integer.parseInt(req.getParameter("DiscountPercent"));

        PrintWriter writer = resp.getWriter();
//        writer.println("<html>");
        writer.println("<h1> Discount Amount:" +price*discountnt*0.01+ "</h1>");
        writer.println("<h1> Discount Price:" +(price- price*discountnt*0.01)+ "</h1>");
//        writer.println("</html>");

    }

}
