package comtnsMultipletrycatch;

import java.util.Scanner;

import com.tnsnestedtry.NestedTry;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("enter the value of x and y");
		int x = ob.nextInt();
        int y = ob.nextInt();
        System.out.println("value of x and y "+x+" "+y );
        MultipleTryCatch obj = new MultipleTryCatch();
       System.out.println(obj);
	}

}
