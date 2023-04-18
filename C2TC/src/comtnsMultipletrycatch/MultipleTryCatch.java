package comtnsMultipletrycatch;

public class MultipleTryCatch
{
	int NestedTry (int x,int y) 
	{
		String str="hello";
		str = null;
		int[] arr= {1,2,3};
		try {
			  int z=x/y;
			try 
			{
				System.out.println(arr[y]);
			}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("array index out of Bound");
			}
			try {
				int slength = str.length();
				System.out.println("String length"+slength);
		    }
			catch(NullPointerException np) {
				System.out.println("null pointer exception"+np);
			}
			return z;
		}
		catch(ArithmeticException e) {
			System.out.println("division by 0 error"+e);
		}
		catch(Exception w) {
			System.out.println("base class exception");
		}
		finally {
			System.out.println("finally block");
		}
		return x;
	
	}
	

}
