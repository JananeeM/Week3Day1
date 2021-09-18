package Week3Day1;



public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Overridden deposit() Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank ab=new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.saving();

	}

}
