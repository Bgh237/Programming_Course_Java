package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.Student;

/**
 * Servlet implementation class JsonServlet
 */
@WebServlet("/jsontest")
public class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student a = new Student(230, "Joe", "Blogs", "King Street, 4", "HELSINKI", "00530");
		Student b = new Student(290, "James", "Bond", "Queen Street, 5", "HELSINKI", "00521");
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(a);
		studentList.add(b);
		
		Gson gson = new Gson();
		String jsonString = gson.toJson(studentList);
		
		PrintWriter out = response.getWriter();
		out.print(jsonString);
		
	}

}
