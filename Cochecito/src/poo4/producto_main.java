package poo4;

import javax.swing.JOptionPane;

public class producto_main {


		 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			producto item = new producto();
			String [] name = new String [10];
			int [] count = new int [10];
			double [] price = new double[10];
			boolean salir = false;
			int r = 0;
	 
			do {
			String option=JOptionPane.showInputDialog("Para añadir un producto pulsa 1. Para ver el inventario pulsa 2.");
			if(Integer.parseInt(option)==1) {
				
				item.setNombre(JOptionPane.showInputDialog("Introduzca el nombre del producto"));
				name [r] = item.getNombre();
				String convertor1 = JOptionPane.showInputDialog("Introduzca la cantidad de items");
				item.setCantidad(Integer.parseInt(convertor1));
				count[r] = item.getCantidad();
				String convertor2 = JOptionPane.showInputDialog("Introduzca el precio del producto");
				item.setPrecio(Double.parseDouble(convertor2));
				price[r] = item.getPrecio();
				System.out.println("Producto añadido correctamente al inventario");
				r++;
			} else if(Integer.parseInt(option)==2) {
				if(name[0]==null) {
					System.out.println("El inventario está vacío");
				} else {
					salir = true;
					break;
				}
			} else {
				System.out.println("ERROR: Valor inválido");
			}
			} while(!salir);
			
			for(int i=0;i<name.length;i++) {
				if(name[i]!=null) {
					System.out.println("Nombre del producto: "+name[i]);
				System.out.println("Número de items del producto: "+count[i]);
				System.out.println("Precio del producto: "+price[i]+"€\n");
				}
				
			}
		}

}
