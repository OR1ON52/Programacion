package poo3;

import java.util.Scanner;

public class receta_main {

public static void main(String[] args) {
		
		receta CookingMama = new receta();
		String [][] ingredientes = new String [20][5];
		String [] nombre = new String [5];
		String [][] pasos = new String [20][5];
		Scanner scan = new Scanner(System.in);
		boolean salir = false;
		int code_receta = 0;
    	int code_ingrediente = 0;
    	int code_pasos = 0;
		
		do {
        System.out.println("Bienvenido a Cooking Mama.\nPara añadir una receta pulse 1.\nPara ver las recetas añadidas pulse 2.\nPara salir pulse 3.");
        
        int options = scan.nextInt();
        scan.nextLine();
        
        switch(options) {
        case 1:
        	
        	System.out.print("Introduce el nombre de la receta: ");
        	code_receta++;
        	CookingMama.setNombre(scan.nextLine());
        	nombre[code_receta] = CookingMama.getNombre();
        	
        	System.out.println("Para añadir ingredientes pulse 1. Para añadir pasos pulse 2. Para volver al menú pulse 3.");
        	switch(scan.nextInt()) {
        	case 1:
        		int opciones = 0;
        		int i = 0;
        		 do {
        			 scan.nextLine();
        			 System.out.print("Introduce el ingrediente:");
        			 CookingMama.setIngredientes(scan.nextLine());
        			 ingredientes [code_ingrediente][i] = CookingMama.getIngredientes();
        			 i++;
        			 System.out.println("Para añadir otro ingrediente pulse 1. Para volver pulse 2.");
        			 opciones = scan.nextInt();
        		 } while(opciones==1);
        		 break;
        		 
        	case 2:
        		int opciones2 = 0;
        		int j = 0;
       		 do {
       			 
       			 System.out.print("Introduce el siguiente paso:");
       			 CookingMama.setPasos(scan.nextLine());
       			 pasos [code_pasos][j] = CookingMama.getPasos();
       			 j++;
       			 System.out.println("Para añadir otro paso pulse 1. Para volver pulse 2.");
       			 opciones2 = scan.nextInt();
        	} while(opciones2 == 1);
       		 break;
       		 
        	case 3:
        		break;
     
        	default:
        		System.out.println("ERROR: Caracter no válido. Por favor seleccione una opción.");
        		break;
        }
        	break;
        	
        case 2:
        	boolean salirRecetas = false;
            if (nombre[1] == null) {
                System.out.println("Parece que todavía no has apuntado ninguna receta. Pulsa 2 para volver.");
                if (scan.nextInt() == 2) {
                    salirRecetas = true;
                } else {
                    System.out.println("ERROR: Por favor, pulsa 2 para salir.");
                    scan.nextInt();
                }
            } else {
                do {
                    System.out.println("Elige una receta introduciendo su número correspondiente.");
                    for (int s = 1; s < code_receta; s++) {
                        System.out.println(s + ". " + nombre[s]);
                    }
                    int recetaElegida = scan.nextInt();

                    System.out.println("Nombre de la receta: " + nombre[recetaElegida]);
                    System.out.println("Ingredientes:\n");
                    for (int t = 0; t < ingredientes[recetaElegida].length; t++) {
                        if (ingredientes[recetaElegida][t] != null) {
                            System.out.println(ingredientes[recetaElegida][t]);
                        }
                    }
                    System.out.println("Instrucciones:\n");
                    for (int t = 0; t < pasos[recetaElegida].length; t++) {
                        if (pasos[recetaElegida][t] != null) {
                            System.out.println("Paso " + t + ": " + pasos[recetaElegida][t]);
                        }
                    }

                    System.out.println("Pulsa 2 para volver al menú principal");
                    do {
                        if (scan.nextInt() == 2) {
                            salirRecetas = true;
                        } else {
                            System.out.println("ERROR: Por favor, pulsa 2 para salir.");
                            scan.nextInt();
                        }
                    } while (!salirRecetas);

                } while (!salirRecetas);
            }
            break;
        
        case 3:
        	salir = true;
        	System.out.println("Saliendo...");
        	break;
	}

} while (!salir);
		
		scan.close();
}

}
