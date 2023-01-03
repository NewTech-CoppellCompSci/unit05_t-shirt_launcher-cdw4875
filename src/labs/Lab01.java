package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
	
		Scanner inKey = new Scanner(System.in); 
		System.out.print("Enter a postive integer.");
		int input1 = inKey.nextInt();
		System.out.print("Enter another postive integer.");
		int input2 = inKey.nextInt();
		System.out.println(input1 +"^"+ input2+ "= " + Math.pow(input1, input2));
	}
	
	
	
	public static void problem2() {
		
		Scanner inKey = new Scanner(System.in); 
		System.out.print("Enter a postive integer.");
		int input1 = inKey.nextInt();
		System.out.println("sqare root of "+ input1 +" = " + Math.sqrt(input1));
	}
	
	
	
	public static void problem3() {
		
		Scanner inKey = new Scanner(System.in); 
		System.out.print("Length of side A:");
		int input1 = inKey.nextInt();
		System.out.print("Length of side B:");
		int input2 = inKey.nextInt();
		
		System.out.println("Hypotenuse = " + Math.sqrt(Math.pow(input1,2) + Math.pow(input2,2)) + "\n");
		
		
		
		
	}
	
	
	
	public static void problem4() {
		
		
		System.out.println("\n");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int input = 1;
		while (input != 0) {
		Scanner inKey = new Scanner(System.in);
	
			System.out.print("Enter an integer: ");
			input = inKey.nextInt();
			
			
			max = Math.max(max, input);
			min = Math.min(min, input);
		}
		System.out.println("Max input = " + max + "Min input = " + min);
		
		
	}
	
}

	

