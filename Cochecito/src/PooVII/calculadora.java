package PooVII;

import javax.swing.JOptionPane;

public class calculadora {

	private static int num1=0;
	private static int num2=0;
	
	public static int suma() {
		return num1 + num2;
	}
	public static int resta() {
		return num1 - num2;
	}
	public static int product() {
		return num1 * num2;
	}
	public static int div() {
		return num1 / num2;
	}
	
	public calculadora(int number1,int number2) {
		num1 = number1;
		num2 = number2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea1=JOptionPane.showInputDialog("Introduce el primer valor");
		String linea2=JOptionPane.showInputDialog("Introduce el segundo valor");
		calculadora calculator = new calculadora(Integer.parseInt(linea1),Integer.parseInt(linea2));
		
		
	}

}
