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
        
        switch(options) {
        case 1:
        	
        	System.out.print("Introduce el nombre de la receta: ");
        	code_receta++;
        	CookingMama.setNombre(scan.next());
        	nombre[code_receta] = CookingMama.getNombre();
        	
        	System.out.println("Para añadir ingredientes pulse 1. Para añadir pasos pulse 2. Para volver al menú pulse 3.");
        	switch(scan.nextInt()) {
        	case 1:
        		int opciones = 0;
        		 do {
        			 
        			 System.out.print("Introduce el ingrediente:");
        			 CookingMama.setIngredientes(scan.next());
        			 code_receta++;
        			 ingredientes [code_ingrediente][code_receta] = CookingMama.getIngredientes();
        			 
        			 System.out.println("Para añadir otro ingrediente pulse 1. Para volver pulse 2.");
        			 opciones = scan.nextInt();
        		 } while(opciones==1);
        		 break;
        		 
        	case 2:
        		int opciones2 = 0;
       		 do {
       			 
       			 System.out.print("Introduce el siguiente paso:");
       			 CookingMama.setPasos(scan.next());
       			code_pasos++;
       			 pasos [code_pasos][code_receta] = CookingMama.getPasos();
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
        	do {
        		for(int i=0;i<nombre.length;i++) {
        			if(nombre[i]!=null) {
        				break;
        			} else {
        				System.out.println("Parece que todavía no has apuntado ninguna receta. Pulsa 2 para volver.");
        				if(scan.nextInt()==2) {
        	        		salirRecetas = true;
        	        	} else {
        	        		System.out.println("ERROR:Por favor, pulsa 2 para salir.");
        	        		scan.nextInt();
        	        	}
        			}
        		}
        	System.out.println("Elige una receta introduciendo su número correspondiente.");
        	for(int s=0;s<nombre.length;s++) {
        		if(nombre[s]!=null) {
        		
        		System.out.println(s+". "+nombre[s]);
        		}
        	}
        	int recetaElegida = scan.nextInt();
        	
        	System.out.println("Nombre de la receta: "+nombre[recetaElegida]);
        	System.out.println("Ingredientes:\n");
        	for(int t=0;t<ingredientes.length;t++) {
        		System.out.println(ingredientes[code_ingrediente][code_receta]);
        	}
        	System.out.println("Instrucciones:\n");
        	for(int t=0;t<pasos.length;t++) {
        		System.out.println("Paso "+t+": "+pasos[code_pasos][code_receta]);
        	}
        	
        	System.out.println("Pulsa 2 para volver al menú principal");
        	do {
        		if(scan.nextInt()==2) {
        		salirRecetas = true;
        	} else {
        		System.out.println("ERROR:Por favor, pulsa 2 para salir.");
        		scan.nextInt();
        	}
        	} while(!salirRecetas);
        	
        	} while(!salirRecetas);
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
