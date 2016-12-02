package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.SubjectDAO;
import kr.ac.hansung.model.Subject;

@Service
public class SubjectService {

	private SubjectDAO subjectDAO;
	
	@Autowired
	public void setSubjectDao(SubjectDAO subjectDao) {
		this.subjectDAO = subjectDao;
	}
	
	public List<Subject> getCurrunt() {
		return subjectDAO.getSubject();
	}
	
	public List<Subject> getCurrunt(int year, int grade) {
		return subjectDAO.getSubject(year, grade);
	}
	
	public List<Subject> getCurruntApplication() {
		return subjectDAO.getSubjectApplication();
	}
	
	public int getSubjectCountName(String division){
		return subjectDAO.getSubjectScoreSum(division);
	}
	
	public Integer getSubjectCountName(int year, int grade){
		return subjectDAO.getSubjectCount(year, grade);
	}
	
	public void dataInsert(Subject subject){
		Boolean i = subjectDAO.insert(subject);
	}
}
