package projectjunit5;

public class Numberfunctions {
	public static int factorial (int n) {
		int f = 1;
		while (n!=0) {
			f= f*n;
			
			if (n<0)
				n++;
			else
				n--;
		}
		return f;
	}
 public static int isPalindrome( int no) {
	 int d, rev =0,no1=no;
	 while(no!=0) {
		 d=no%10;
		 no=no/10;
		 rev= rev*10+d;
	 }
	 if(no1==rev) {
		 return 1;
	 }
	else {
			 return 0;
	 }
 }
}
