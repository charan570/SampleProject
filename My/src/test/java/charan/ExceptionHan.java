package charan;

public class ExceptionHan {

	public static void main(String[] args) {
		System.out.println("Selenium");
		try {
			System.out.println(100/0);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		System.out.println("Testing");
	}
}
