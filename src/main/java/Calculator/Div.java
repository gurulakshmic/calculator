package Calculator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/div")
public class Div extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	int n1=Integer.parseInt(req.getParameter("num1"));
	int n2=Integer.parseInt(req.getParameter("num2"));
	resp.getWriter().print("<html><body><h1 style='color:blue'>the sum of "+n1+"and"+n2+"is"+(n1/n2)+"</h1></body></html>");
	
}
}
