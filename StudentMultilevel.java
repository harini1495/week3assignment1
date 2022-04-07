package week3.day1;

public class StudentMultilevel extends DepartmentMultilevel{

	public void studentName() {
		// TODO Auto-generated method stub
        System.out.println("Harini M");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("ECE");

	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("412313106024");

	}
	public static void main(String[] args) {
		
		StudentMultilevel inheritance = new StudentMultilevel();
		inheritance.collegeName();
		inheritance.collegeCode();
		inheritance.collegeRank();
		inheritance.deptName();
		inheritance.studentName();
		inheritance.studentDept();
		inheritance.studentId();
		
	}
}
