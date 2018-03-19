package fr.diginamic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArrayTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		//Affichage par ordre croissant du tableau
		int temp=0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if( array[i] > array[j]){
					temp =array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Affichage par ordre croissant du tableau");
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
		int[] array2 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		// Utilisation de la classe Array
		Arrays.sort(array2);
		System.out.println("Affichage par ordre croissant du tableau à l'aide de la class Array");
		System.out.println(Arrays.toString(array2));
	}
}
