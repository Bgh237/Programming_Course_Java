package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import data_access.StudentDAO;
import model.Student;

/**
 * Servlet implementation class StudentUpdateServlet
 */
@WebServlet("/updateStudent")
public class StudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		StudentDAO studentDAO = new StudentDAO();
		Student student = studentDAO.getStudentByID(id);
		
		Gson gson = new Gson();
		String jsonString = gson.toJson(student);
		
		out.print(jsonString);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String streetAddress = request.getParameter("streetAddress");
		String postcode = request.getParameter("postcode");
		String postOffice = request.getParameter("postOffice");
		
		Student student = new Student(id, firstName, lastName, streetAddress, postcode, postOffice);
		
		StudentDAO studentDAO = new StudentDAO();
		
		int a = studentDAO.updateStudent(student);
		
		Map<String, Integer> errorCode = new HashMap<String, Integer>();
		errorCode.put("errorCode", a);
		
		Gson gson = new Gson();
		String jsonString = gson.toJson(errorCode);
		
		out.print(jsonString);
	}

}
