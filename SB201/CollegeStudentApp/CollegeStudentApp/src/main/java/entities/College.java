package entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="collegeId")
	private int collegeId;
	private String collegeName;
	private String collegeAddress;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "college")
	private Set<Student> students;
	public College() {
	}
	
	public College(String collegeName, String collegeAddress, Set<Student> students) {
		super();
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.students = students;
	}

	
	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
