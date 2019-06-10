import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletSinhVien", urlPatterns = "/display")
public class ServletSinhVien extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<SinhVien> listSV= new ArrayList<>();
        listSV.add(new SinhVien(1,"Đoàn Phương Linh"));
        listSV.add(new SinhVien(2, "Lưu Bị"));
        listSV.add(new SinhVien(3, "Tào Tháo"));
        listSV.add(new SinhVien(4, "Phú IT"));
        request.setAttribute("list", listSV);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("listSV.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
