package Week3Day1;

public class Students {
	
	public void getStudentInfo() 
	{
		
		System.out.println("Method without arguements");		
	}
	
	public void getStudentInfo(int studId)
	{
		
			System.out.println("Student Id : "+studId);
	}
	public void getStudentInfo(int studId,String name)
	{
		
		System.out.println("Student Id : "+studId);
		System.out.println("Student Name : "+name);
	}
		
	public void getStudentInfo(String emailId,int phoneNum)
	{
		
		System.out.println("Student Id : "+emailId);
		System.out.println("Student Name : "+phoneNum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s=new Students();
		s.getStudentInfo();
		s.getStudentInfo(123);
		s.getStudentInfo(100,"V.Dhanyasree");
		s.getStudentInfo("vds@gmail.com",12340);
	}

}
