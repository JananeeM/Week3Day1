package Week3Day1;

public class AssigmentString7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="I am Learning Java";
		String str2="I am learning java?";
		if(str1==str2)
		{
			System.out.println("Same Text");
		}
		else
			System.out.println("Different text");
		
		if(str1.equals(str2))
			System.out.println("Same Text");
		else
			System.out.println("Different text Case sensitive");
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Same Text Ignoring case");
		else
			System.out.println("Different text Case sensitive");
	}

}
