package tests;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Test2 {
	
	
	@Test
	public void test3()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a & b values");
		int x;
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		x=a;   
		a=b;
		b=x;
		
		System.out.println("After swapping:"+ " "+"A valueis:"+ a+"  " +"b value is:" + b);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
