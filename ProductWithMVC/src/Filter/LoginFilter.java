package Filter;

import com.sun.deploy.net.HttpResponse;
import model.Admin;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter", urlPatterns = "/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request= (HttpServletRequest) req;
        if(request.getRequestURI().contains("/products")){
            HttpSession session= request.getSession();
            Admin admin= (Admin)session.getAttribute("admin");
            if(admin==null){
                HttpServletResponse response= (HttpServletResponse) resp;
                response.sendRedirect("index.jsp");
            }
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
