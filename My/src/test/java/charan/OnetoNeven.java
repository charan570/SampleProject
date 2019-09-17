package charan;

class OnetoNeven {
	   public static void main(String args[]) {
		int n = 20;
		System.out.print("Even Numbers from 1 to "+20+" are: ");
		for (int i = 1; i <= n; i++) {
		   //if number%2 == 0 it means its an even number
		   if (i % 2 == 0)
		   {
			   System.out.print(i+ "  " );
		   }
		}
	   }
	}