package Week3Day1;

public class StringAssignmentweek3d1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");
		 
		 
		 /* else part will b executed because == operator compares memory location of two strings 
		  * rather than comparing the string value
		  * */
		  

	}

}
