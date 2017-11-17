package com.lambda.view;

public class Test {

	public static void main(String[] args) {
		ILambda lambda = (num1 , num2) -> {
			int result = num1 + num2;
			
			System.out.println("Hola mundo " + num1 + num2);
			System.out.println(num1 + num2);
			
			return result;
		};
		
		
	int	t = lambda.calculate(2, 3);
	System.out.println(t);
	}
	

}
