package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.hansung.dao.SubjectDAO;
import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

/**
 * Servlet implementation class DoApplication
 */
@WebServlet("/DoApplication")
public class DoApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoApplication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read form data
		int year = Integer.parseInt(request.getParameter("year"));
		int grade = Integer.parseInt(request.getParameter("grade"));
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String division = request.getParameter("division");
		int score = Integer.parseInt(request.getParameter("score"));
		
		SubjectService subjectService = new SubjectService();
		
		Subject subject = new Subject(year,grade,code,name,division,score);
		
		subjectService.dataInsert(subject);
		
		
//		// perform business logic
//		
//		PrintWriter out = response.getWriter();
//		
//		//Build HTML code
//		String htmlResponse="<html>";
//		
//		htmlResponse+= "<h2> 수강년도 : " + year + "<br/>";
//		htmlResponse+= " 학기: " + grade + "<br/>";
//		htmlResponse+= " 신청코드: " + code + "<br/>";
//		htmlResponse+= " 과목명: " + name + "<br/>";
//		htmlResponse+= " 구분: " + division + "<br/>";
//		htmlResponse+= " 학점: " + score + "<br/>";
//		htmlResponse+= " 2017년 1학기에 신청할 예상 교과목 입력이 완료되었습니다. " + "<h2>";
//		htmlResponse+= "</html>";
//		
//		out.println(htmlResponse);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
