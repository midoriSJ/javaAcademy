
public class Student {
	protected String department;
	String grade;
	String id;
	String name;
	String address;
	
	public Student(String nGrade, String strId, String strName, String strAdd, String strEmail) {
		// TODO Auto-generated constructor stub
		this.grade = nGrade;
		this.id = strId;
		this.name = strName;
		this.address = strAdd;
	}

	public void setDepartment(String department) {
		this.department = department;
		
	}
}
