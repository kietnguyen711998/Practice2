package bai1;


public class ManagerStudentInfo {
	private String studentCode;
	private String studentName;
	private int studentAge;
	private String studentSex;
	
	
	public String getStudentCode() {
		return studentCode;
	}



	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public int getStudentAge() {
		return studentAge;
	}



	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}



	public String getStudentSex() {
		return studentSex;
	}



	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}


	public ManagerStudentInfo() {
		
	}



	public ManagerStudentInfo(String studentCode, String studentName, int studentAge, String studentSex) {
		super();
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentSex = studentSex;
	}
	
	

}
