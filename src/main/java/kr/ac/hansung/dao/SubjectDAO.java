package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Subject;

@Repository
public class SubjectDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getSubjectScoreSum(String division) {//sql문 수정 필요 sum으로
		String sqlStatement = "select sum(score) from subject where division = ?";
		return jdbcTemplateObject.queryForObject(sqlStatement,new Object[]{division}, 
				Integer.class);
	}
	
	public int getSubjectCount(int year, int grade) {
		String sqlStatement = "select sum(score) from subject where year = ? and grade = ?";
		return jdbcTemplateObject.queryForObject(sqlStatement,new Object[]{year, grade}, 
				Integer.class);
	}

	// querying and returning a single object
	public Subject getSubject(String name) {
		String sqlStatement = "select * from subject where name=?";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { name }, new SubjectMapper());
	}
	
	public List<Subject> getSubject(int year, int grade) {
		String sqlStatement = "select * from subject where year=? and grade=?";

		return jdbcTemplateObject.query(sqlStatement, new Object[] { year, grade }, new SubjectMapper());
	}


	// querying and returning multiple object
	public List<Subject> getSubject() {
		String sqlStatement = "select * from subject";

		return jdbcTemplateObject.query(sqlStatement, new SubjectMapper());
	}
	
	// querying and returning multiple object
		public List<Subject> getSubjectApplication() {
			String sqlStatement = "select * from subjectapplication";

			return jdbcTemplateObject.query(sqlStatement, new SubjectMapper());
		}
	
	

	public boolean insert(Subject subject) {

		int year = subject.getYear();
		int grade = subject.getGrade();
		String code = subject.getCode();
		String name = subject.getName();
		String division = subject.getDivision();
		int score = subject.getScore();

		String sqlStatement = "insert into subjectapplication (year, grade, code, name, division, score) values (?,?,?,?,?,?)";
		return jdbcTemplateObject.update(sqlStatement, new Object[] { year, grade, code, name, division, score }) == 1;
	}
	
//	public boolean update(Subject subject) {
//
//		int year = subject.getYear();
//		int grade = subject.getGrade();
//		String code = subject.getCode();
//		String name = subject.getName();
//		String division = subject.getDivision();
//		int score = subject.getScore();
//
//		String sqlStatement = "update subject set year=?, grade=?, code=?, name=?, division=?, score=? where code=?";
//		return jdbcTemplateObject.update(sqlStatement, new Object[] { year, grade, code, name, division, score }) == 1;
//	}
	
//	public boolean delete (int id) {
//		String sqlStatement = "delete from offers where id=?";
//		
//		return(jdbcTemplateObject.update(sqlStatement, new Object[]{id})==1);
//	}
}
