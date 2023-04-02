package com.tnspackage;
import java.util.Scanner;
public class CustomerDemo {
		public static void main(String[] arga) {
			Scanner Sc =new Scanner(System.in);
			String name,city;
			int id;
			System.out.println("Enter Customer name");
			name= Sc.nextLine();
			System.out.println("Enter Customer id");
			id=Sc.nextInt();
			System.out.println("Enter Customer city");
			city=Sc.next();
			System.out.println(" ");
			Customer ob =new Customer(); 
			ob.setCustomerId(id);
			ob.setCustomerName(name);
			ob.setCustomerCity(city);

			ob.setCustomerName("Namratha");
			ob.setCustomerCity("Bengaluru");
			System.out.println(ob);
			System.out.println(ob.getCustomerName()+" "+ob.getCustomerId()+" "+ob.getCustomerCity());
		}

	}
