package orgSystem;

public class Desktop extends Computer  {
	
	public void desktopSize()
	{
		System.out.println("Displaying Desktop Size From desktopSize() method in DesktopClass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop dt=new Desktop();
		dt.desktopSize();
		dt.computerModel();


	}

}
