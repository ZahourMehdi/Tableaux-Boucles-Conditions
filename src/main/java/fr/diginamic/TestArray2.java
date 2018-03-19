package fr.diginamic;

public class TestArray2 {
	public static void main(String[] args) {
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		int a = 0;
		int moy = array.length;
		//Moyenne des éléments du tableau
		for (int i = 0; i < array.length; i++) {
			a = a + array[i];
			System.out.println(a);
		}
		moy = a/moy;
		System.out.println("La moyenne du tableaux est de : " + moy);
		
		//Quel est l’index dans le tableau de l’entier 15 ?
		for (int j = 0; j < array.length; j++) {
			if(array[j] == 15){
				System.out.println("L'index de l'entier 15 est : " + j);
			}
		}
		
		//algorithme permettant de trouver le nombre d’entiers en doublon dans le tableau
		int compteur = 0;
		int count = 0;
		
		for (int k = 0; k < array.length; k++) {
			int temp = array[k];
			if(compteur == temp){
				count++;
			}else {
				temp = array[k];
			}
		}
		System.out.println("Nombre d'entier en doublon dans le tableau : " + count);
		
	}
}
