package es.Studium.TablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, i; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el numero Entero");
		numero1 = teclado.nextInt();
		teclado.close();
		for(i=0; i<=10;i++) 
		{
			System.out.println(numero1+"x"+i+"="+numero1*i);
		}
	}

}
