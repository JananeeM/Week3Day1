package student;

import Department.Department;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("Inside studentName() Method");
		System.out.println("Name of The Student  : V.Dhanyasree");
	}
	
	public void studentDept()
	{
		System.out.println("Inside studentDept() Method");
		System.out.println("Student Department : CSE");
	}
	public int studentId()
	{
		System.out.println("Inside studentId() Method");
		int StuId=123456;
		return(StuId);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		int StudentId=st.studentId();
		System.out.println("Student Id :"+StudentId);
		st.studentDept();
		st.studentName();
		st.deptName();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		

	}

}
