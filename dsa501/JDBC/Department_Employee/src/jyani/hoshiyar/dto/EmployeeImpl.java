package jyani.hoshiyar.dto;

public class EmployeeImpl implements Employee {
	int empId;
	String ename;
	String address;
	String mobile;
	int deptid;

	public EmployeeImpl(int empId, String ename, String address, String mobile, int deptid) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.address = address;
		this.mobile = mobile;
		this.deptid = deptid;
	}

	@Override
	public int getEmpId() {
		return empId;
	}

	@Override
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String getEname() {
		return ename;
	}

	@Override
	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String getMobile() {
		return mobile;
	}

	@Override
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public int getDeptid() {
		return deptid;
	}

	@Override
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", address=" + address + ", mobile=" + mobile
				+ ", deptid=" + deptid + "]";
	}

}
