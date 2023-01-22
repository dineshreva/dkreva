package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Course12 {
	int courseId;
	String courseName;
	int courseFee;
	String instituteName;
	@Autowired
	private Technology tech;
	public Technology getTech() {
		return tech;
	}
	public void setTech(Technology tech) {
		this.tech = tech;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public void getName() {
		System.out.println(" Successfully completed Running the Class ");
		/*
		 * Technology tech = new Technology(); tech.institute();
		 */
		tech.institute();
	}
}
