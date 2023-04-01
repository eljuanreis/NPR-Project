package controller;

import javax.swing.JOptionPane;

public abstract class GUIController {
	
	public static int num1, num2;
	public static String op;
	
	public static void showOptions() {
		int option = 0;

		do {
			try {
				option = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção: \n\n"
						+ "1 - Realizar operações\n9 - Sair"));
				
				if (option == 1) {
					GUIController.operationGUI();
					option = 9;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}

		} while(option != 9);
		
	}
	
	public static void operationGUI() {
		GUIController.num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		GUIController.num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		
		GUIController.op = JOptionPane.showInputDialog("Digite a operação (+,-,/,*");

	}
	
}
