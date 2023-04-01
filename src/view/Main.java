package view;

import javax.swing.JOptionPane;

import controller.GUIController;
import controller.NPRController;
import stack.StackInt;

public class Main {

	public static void main(String[] args) {
		try {
			GUIController.showOptions();

			StackInt stack = new StackInt();
			
			NPRController c =  new NPRController();
			
			if (GUIController.op == null) {
				JOptionPane.showMessageDialog(null, "Operação inválida");
				throw new Exception("Operação inválida");
			}
	
			c.insereValor(stack, GUIController.num1);
			c.insereValor(stack, GUIController.num2);
			
			c.npr(stack, GUIController.op);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
