

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import command.ServiceManager;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * String s = request.getParameter("cmd"); String page = "show.jsp"; switch(s) {
		 * case "add": Service.add(request); case "show" : page =
		 * ServiceShow.show(request); }
		 * 
		 * request.getRequestDispatcher(page).forward(request, response);
		 */
		Command com = ServiceManager.getservice(request);
		String page = com.execute(request);
		this.getServletContext().getRequestDispatcher(page).forward(request, response);
		String email = request.getParameter("email");
		String password = request.getParameter("confirmPassword");
		request.setAttribute("email", email);
//		System.out.println(email);
//		System.out.println(password);
	
		
		//
		// List<Camera> cameralist = null;
		// Parsedb parsedb = new Parsedb();
		// cameralist = parsedb.ParserCanon();
		//// cameralist = parsedb.ParserSony();
		// System.out.println(cameralist);
		// // HttpSession session = request.getSession();
		// request.setAttribute("cameralist", cameralist);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	} 
//	private List<LoginModel> ParseLoginModel(HttpServletRequest request) {
//		LoginModel model = new LoginModel();
//		model.email = request.getParameter("email");
//		retrun model;
//	}
//
//	private class LoginModel {
//		private String email;
//	}
//	}
	

}
