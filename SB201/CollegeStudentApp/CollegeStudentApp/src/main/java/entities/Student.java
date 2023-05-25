package entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentRoll;
	private String studentName;
	private String mobileNumber;
	
	private String email;
	private boolean status;
	@ManyToOne
	private College college;
	
	public Student() {
		
	}
	
	
	public Student(String studentName, String mobileNumber, String email, boolean status, College college) {
		super();
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.status = status;
		this.college = college;
	}


	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, mobileNumber, status, studentName, studentRoll);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email) && Objects.equals(mobileNumber, other.mobileNumber)
				&& status == other.status && Objects.equals(studentName, other.studentName)
				&& studentRoll == other.studentRoll;
	}


	


	


	


	
	
}
