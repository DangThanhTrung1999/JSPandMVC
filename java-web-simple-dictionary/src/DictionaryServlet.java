import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="DictionayServlet", urlPatterns = "/dictionary")
public class DictionaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String>  dictionary= new HashMap<>();
        dictionary.put("hello","xin chào");
        dictionary.put("how","thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        String search= req.getParameter("search");
        PrintWriter print= resp.getWriter();
        print.println("<html>");
        print.println("<h1>Dây là trang servlet</h1>");
        String result= dictionary.get(search);
        if(result!=null){
            print.println("Word: "+search);
            print.println("Result: "+result);
        }else{
            print.println("Not found");
        }
        print.println("</html>");
    }
}
