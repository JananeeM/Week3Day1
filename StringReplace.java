package Week3Day1;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I am working with Java8";
		String str1=sentence.replaceAll("8","11");
		System.out.println("Senetence after replacing"+str1);
		char[] ch=sentence.toCharArray();
		System.out.println("Printing the characters from 5 to 14");
		for(int i=5;i<=13;i++) {
			System.out.print(ch[i]);
		}
	
		

	}

}
