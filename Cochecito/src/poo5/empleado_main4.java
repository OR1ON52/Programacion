package poo5;

import javax.swing.JOptionPane;

public class empleado_main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empleado empleado5 = new empleado();
		String [] name = new String [3];
		Double [] payout = new Double [3];
		int [] dia = new int [3];
		int [] mes = new int [3];
		int [] anno = new int [3];
		
		for(int i=0;i<name.length;i++) {
			name[i]=JOptionPane.showInputDialog("Introduce el nombre del empleado"+i);
			String sueldito=JOptionPane.showInputDialog("Introduce el sueldo del empleado "+i);
			payout[i]=Double.parseDouble(sueldito);
			String day=JOptionPane.showInputDialog("Introduce el dia de alta del empleado "+i);
			dia[i]=Integer.parseInt(day);
			String month=JOptionPane.showInputDialog("Introduce el mes de alta del empleado "+i);
			mes[i]=Integer.parseInt(month);
			String year=JOptionPane.showInputDialog("Introduce el año de alta del empleado "+i);
			anno[i]=Integer.parseInt(year);
			
		}
		
		
		
		
	}

}
