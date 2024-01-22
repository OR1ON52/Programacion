package poo3;

import java.util.Scanner;

public class Habitacion_main {

public static void main(String[] args) {
		
		Habitacion Hotel = new Habitacion();
		Scanner scan = new Scanner(System.in);
		boolean ocupada [] = new boolean [101];
		System.out.println("Bienvenido al Hotel Eurostars, por favor introduzca la opción deseada");
		do {
		
		System.out.println("Reservar habitaciones: Pulse 1.\nCancelar reservas: Pulse 2.\nSalir: Pulse 3.");
		int option = scan.nextInt();
		
		switch(option) {
		case 1:
		
		do {
		System.out.println("Habitaciones del 1 al 33:simple\nHabitaciones del 34 al 66:doble\nHabitaciones del 67 al 100: Suites");
		
		
		for (int i=0;i>ocupada.length;i++) {
			ocupada[i]=false;
		}
		
		
			Hotel.setNumRoom(scan.nextInt());
			if(!(Hotel.getNumRoom()>=0 || Hotel.getNumRoom()<=100)) {
				System.out.println("ERROR: El número de habitación debe estar entre 1 y 100");
			} else {
				if(ocupada[Hotel.getNumRoom()]==true) {
					System.out.println("La habitación "+Hotel.getNumRoom()+" ya esta ocupada, por favor seleccione otra habitación.");
				} else {
					ocupada[Hotel.getNumRoom()] = true;
					System.out.println("Habitación "+Hotel.getNumRoom()+" reservada correctamente\n");
					
					break;
				}
			}
			
		} while(true);
	
		System.out.println("Habitación/es reservada/s: ");
		for(int i=0;i<=100;i++) {
			if(ocupada[i]==true) {
				if(i>=1 && i<=33) {
					Hotel.setTipo("Simple");
				} else if(i>=34 && i<=66) {
					Hotel.setTipo("Doble");
				} else {
					Hotel.setTipo("Suite");
				}
				System.out.println("Numero de habitación: "+i+"\nClase de habitación: "+Hotel.getTipo());
				
			}
		}
		
		break;
		
		case 2:
			System.out.println("Introduzca el numero de habitación que desea cancelar");
			int cancelar = scan.nextInt();
			if(cancelar>=1 && cancelar<=100) {
				if(ocupada[cancelar]) {
					ocupada[cancelar] = false;
					System.out.println("Reserva de Habitación "+cancelar+" cancelada correctamente.");
				} else {
					System.out.println("ERROR: Esta habitación no está reservada.");
				}
			} else {
				System.out.println("ERROR: El valor introducido no es válido.");
			}
				break;
		case 3:
			System.out.println("Gracias por confiar en nosotros. :)");
			scan.close();
			System.exit(0);
			break;
		
		default:
			System.out.println("ERROR: Valor no valido, introduzca una opción valida.");
			}
		
		} while (true);
		
		
		
	}

 
}
