package fr.diginamic;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		//Affiche l’ensemble des éléments du tableau grâce à une boucle
		System.out.println("Affichage du tableau");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Valeur courante : " + array[i]);
		}
		
		//Affiche l’ensemble des éléments dans l’ordre inverse du tableau
		System.out.println("Affichage du tableau inverse");
		for (int j = array.length-1 ; j >= 0; j--) {
			System.out.println("Valeur courante : " + array[j]);
		}
	
		//Faire une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		System.out.println("Affichage des entiers supérieurs à 3");
		for (int k = 0; k < array.length; k++) {
			if(array[k]> 3){
				System.out.println("Valeur courante : " + array[k]);
			} else{
				continue;
			}
		}
		//Boucle qui affiche uniquement les entiers pairs
		System.out.println("affichage uniquement des entiers pairs");
		for (int l = 0; l < array.length; l++) {
			if (array[l]%2 == 0 ) {
				System.out.println("Valeur courante : " + array[l]);
			} else{
				continue;
			}	
				
		}
		//Affichage du plus grand élément du tableau
		int min =0;
		int max = 0;
		for (int m = 0; m < array.length; m++) {
			if (array[m] < min){
				min = array[m];
			}else if (array[m] > max){
				max = array[m];
			}
		}
		System.out.println("Valeur la plus petite : " + min);
		System.out.println("Valeur la plus grande : " + max);
	}

}
