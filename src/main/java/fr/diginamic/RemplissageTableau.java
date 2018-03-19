package fr.diginamic;

import java.util.Arrays;
import java.util.Scanner;

public class RemplissageTableau {

	public static void main(String[] args){
		// Initialisation du tableau
		int[] array = new int[0];
		int temp = 0;
		boolean a = true;
		//boucle infinie qui peut être arrêter si on tape 3 au moment du choix
		while(a){
			System.out.println("Option 1 : Ajouter un nombre");
			System.out.println("Option 2 : Afficher les nombres existants");
			System.out.println("Option 3 : quitter le menu");
			Scanner option = new Scanner(System.in);
			int choix = option.nextInt();
			if(choix==1){
				if(temp==array.length){
					//Permet de copier le contenu de array et d'ajouter 1 case en plus dans le tableau
					array = Arrays.copyOf(array, (array.length+1));
				}
				System.out.println("Saisissez un nombre à entrer dans le tableau?");
				Scanner choixNombre = new Scanner(System.in);
				array[temp] = choixNombre.nextInt();	
				++temp;
			}
			if(choix==2){
				//Affiche le tableau avec la class Array
				System.out.println(Arrays.toString(array));
			}
			if(choix==3){
				//Quitte l'application
				break;
			}
		}
	}
}
