package controller;

import stack.StackInt;

public class NPRController {

	public void insereValor(StackInt p, int valor) throws Exception
	{
		p.push(valor);
	}
	
	public void npr(StackInt p, String op) throws Exception
	{
		int num1 = p.pop();
		
		if (p.isEmpty()) {
			throw new Exception("Não há dois números para realizar operações");
		}
		
		int num2 = p.pop();
		
		int result = 0;
		
		switch (op) {
			case "+":
				result = num1 + num2;
				System.out.print(num1 + " " + op + " " + num2);
				p.push(result);
			break;
			case "-":
				result = num2 - num1;
				System.out.print(num2 + " " + op + " " + num1);
				p.push(result);
			break;
			case "*":
				result = num1 * num2;
				System.out.print(num1 + " " + op + " " + num2);
				p.push(result);
			break;
			case "/":
				result = num2 / num1;
				System.out.print(num2 + " " + op + " " + num1);
				p.push(result);
			break;
			default:
				throw new Exception("Operação inválida!");
		}
	
		System.out.print(" = " + result);
	}

}
