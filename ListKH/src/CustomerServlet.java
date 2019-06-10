import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customerServlet")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Customer> list= new ArrayList<>();
        list.add(new Customer("Đặng Thanh Trung", LocalDate.parse("1999-09-02"),"Đà Nẵng","1"));
        list.add(new Customer("Mai Tấn Sang", LocalDate.parse("1999-09-02"),"Đà Nẵng","1"));
        list.add(new Customer("Đặng Thanh Tùng", LocalDate.parse("1999-09-02"),"Đà Nẵng","1"));
        list.add(new Customer("Đỗ Như Ngọc", LocalDate.parse("1999-09-02"),"Đà Nẵng","1"));
        request.setAttribute("listKH",list);
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("cutomer.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
