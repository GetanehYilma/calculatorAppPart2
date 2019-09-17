import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorImproved extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Improved");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        try{

            String num1 = req.getParameter("num1");
            String num2 = req.getParameter("num2");
            String num3 = req.getParameter("num3");
            String num4 = req.getParameter("num4");
            int a = Integer.valueOf(num1);
            int b = Integer.valueOf(num2);
            int c = Integer.valueOf(num3);
            int d = Integer.valueOf(num4);
            int sum = a + b;
            int product = c * d;

            out.print("<html><head><meta charset=\"UTF-8\"><title>Calculator</title></head><body>");
            out.print("<form method='post'>");
            out.print("<input type='text' name='n1' value='"+ a +"' /> + ");
            out.print("<input type='text' name='n2' value='"+ b +"' /> = ");
            out.print("<input type='text' name='r1' value='"+ sum +"' />  <br/>");
            out.print("<input type='text' name='n3' value='"+ c +"' /> * ");
            out.print("<input type='text' name='n4' value='"+ d +"' /> = ");
            out.print("<input type='text' name='r2' value='"+ product +"' /> <br/><br/>");
            out.print("<input type='submit' name='submit' value='Submit'>");
            out.print("</form></body></html>");
        } catch (Exception e){
            out.println("Invalid Input");
        }

//        out.println("<form action="calculate" method="post" ");

    }
}
