package main.java.exercises;

public class ArithmeticEx {
	
	public static int i;
	public static int j;
	
	public static void main(String[] args) {
		
		i = Integer.parseInt(args[0]);
		j = Integer.parseInt(args[1]);
		
		binaryArithmetic();
		unaryArithmetic();
		relations();
		logic();
		
	}
	
	public static void binaryArithmetic() {
		
		System.out.println("Binary operations:");
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);
		
	}
	
	public static void unaryArithmetic() {
		
		System.out.println("Unary operations:");
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i--);
		System.out.println(--i);
		System.out.println(-i);
		
	}
	
	public static void relations() {
		
		System.out.println("Relational operations:");
		System.out.println(i == j);
		System.out.println(i < j);
		System.out.println(i!= j);
		System.out.println(i <= j);
		System.out.println(i > j);
		System.out.println(i >= j);
		
	}

	public static void logic() {
	
		System.out.println("Logical operations:");
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(!false);
	
	
	}

}
