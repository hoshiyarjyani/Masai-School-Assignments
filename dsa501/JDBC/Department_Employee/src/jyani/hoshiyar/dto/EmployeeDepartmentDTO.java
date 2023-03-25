package jyani.hoshiyar.dto;

	public class EmployeeDepartmentDTO {
	    private int empId;
	    private String ename;
	    private String address;
	    private String mobile;
	    private int deptid;
	    private String dname;
	    private String location;
		public EmployeeDepartmentDTO(int empId, String ename, String address, String mobile, int deptid, String dname,
				String location) {
			super();
			this.empId = empId;
			this.ename = ename;
			this.address = address;
			this.mobile = mobile;
			this.deptid = deptid;
			this.dname = dname;
			this.location = location;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public int getDeptid() {
			return deptid;
		}
		public void setDeptid(int deptid) {
			this.deptid = deptid;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public String getLocation() {
			return location;
		}
		
		public void setLocation(String location) {
			this.location = location;
		}
		@Override
		public String toString() {
			return "EmployeeDepartment [empId=" + empId + ", ename=" + ename + ", address=" + address + ", mobile="
					+ mobile + ", deptid=" + deptid + ", dname=" + dname + ", location=" + location + "]";
		}

 }
	
