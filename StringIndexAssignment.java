package Week3Day1;

public class StringIndexAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Java Exercise";
		char ch[]=text.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]=='E')
			{
				System.out.println("Position Of Letter E Is :"+i);
			}
			if(ch[i]=='s')
			{
				System.out.println("Position Of Letter s Is :"+i);
			}
			
		}
		

	}

}
