package com.rddayofcode.daysofcode;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;

@SpringBootApplication
public class DaysofcodeApplication {

/*****************************GÚIA DE ARREGLOS**************************************/


//Ejercicio 1. Escriba un programa que permita imprimir en pantalla cada uno de los elementos del siguiente 
//arreglo: [0, 28, 30, 10, 4].

public static void ejercicio1 (){

ArrayList <Integer> arreglo = new ArrayList<Integer>();

arreglo.add(0);
arreglo.add(28);
arreglo.add(30);
arreglo.add(10);
arreglo.add(4);

System.out.print(arreglo );

}

// Ejercicio 2. Escriba un programa que permita imprimir al revés cada uno de los elementos del siguiente 
//arreglo: [0, 28, 30, 10, 4].

public static void alreves (){
	ArrayList <Integer> arreglo2 = new ArrayList<Integer>();

	arreglo2.add(0);
	arreglo2.add(28);
	arreglo2.add(30);
	arreglo2.add(10);
	arreglo2.add(4);
	
	for (int i=arreglo2.size()-1; i>=0; i--){
		arreglo2.get(i);
	}
	
	System.out.print(arreglo2);
}

//Ejercicio 3. Escriba un programa que permita calcular la suma de todos los elementos del siguiente arreglo: 
//[1, 3, 6, 82, 23].

public static void ejercicio3(){

ArrayList <Integer> arreglo3 = new ArrayList<Integer>();

arreglo3.add(1);
arreglo3.add(3);
arreglo3.add(6);
arreglo3.add(82);
arreglo3.add(23);

int contador = 0;

for(int i=0; i<=4; i++){
	contador = contador + arreglo3.get(i);
}

System.out.println("La suma de todos los valores del arreglo es "+contador);

}

//Ejercicio 4. Escriba un programa que deduzca e imprima en pantalla el número menor en el siguiente 
//arreglo: [90, 1, 38, 0, 29, 4].

public static void ejercicio4(){
	ArrayList<Integer> arreglo4 = new ArrayList<Integer>();

	arreglo4.add(90);
	arreglo4.add(1);
	arreglo4.add(38);
	arreglo4.add(0);
	arreglo4.add(29);
	arreglo4.add(4);

	int minimo =0;
	for(int i=0; i<=5; i++){
		if((arreglo4.get(i))< (arreglo4.get(i++))){
			minimo = arreglo4.get(i);
		}
	}

	System.out.println("El número menor del arreglo es "+minimo);
}

//Ejercicio 5. Escriba un programa que permita calcular la suma y el producto entre pares de todos los 
//elementos de los siguientes arreglos: [0, 28, 30, 10, 4] y [1, 3, 6, 82, 23].

public static void ejercicio5(){
	ArrayList<Integer> arreglo5 = new ArrayList<Integer>();
	ArrayList<Integer> arreglo6 = new ArrayList<Integer>();

	arreglo5.add(0);
	arreglo5.add(28);
	arreglo5.add(30);
	arreglo5.add(10);
	arreglo5.add(4);

	arreglo6.add(1);
	arreglo6.add(3);
	arreglo6.add(6);
	arreglo6.add(82);
	arreglo6.add(23);

	int suma=0;
	int producto=0;

	for(int i=0; i<=4; i++){
		suma = arreglo5.get(i)+arreglo6.get(i);
		producto = (arreglo5.get(i))*(arreglo6.get(i));
	
System.out.println("La suma de los valores de la posicion "+ i +" de los arreglos es " + suma);
System.out.println("El producto de los valores de la posicion "+ i +" de los arreglos es " + producto);	
System.out.println("");
	}
}

//Ejercicio 6. Escriba un programa que lea un arreglo de seis elementos (ingresados por el usuario) e 
//intercambie las posiciones de sus elementos, de tal forma que el primero pase a ser el último y 
//el último el primero, el segundo el penúltimo, y así sucesivamente. Imprima en pantalla el 
//arreglo resultante.

//Desarrollo en main

// Ejercicio 7. Escriba un programa que solicite al usuario el número de alumnos de un curso y cree un arreglo 
//que almacene las notas del control 1 del curso. Luego, imprima en pantalla el promedio de 
//todas las notas y muestre cuáles notas resultaron estar sobre el promedio.
 
//Desarrollo en main


// Ejercicio 8. Escriba un programa que solicite al usuario el tamaño de un arreglo y un número entero, e 
//imprima en pantalla el resultado de llenar dicho arreglo con los múltiplos del número dado. Por 
//ejemplo, si se define un arreglo de tamaño 5 y se indica el valor 3, el resultado será el arreglo 
//formado por los valores [3, 6, 9, 12, 15]





	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

//Ejercicio 1
System.out.println("**********Ejercicio 1**********");

System.out.println("");
ejercicio1();
System.out.println("\n");


//Ejercicio 2
System.out.println("**********Ejercicio 2**********");

System.out.println("");
alreves();
System.out.println("\n");


//Ejercicio 3
System.out.println("**********Ejercicio 3**********");

System.out.println("");
ejercicio3();
System.out.println("\n");


//Ejercicio 4
System.out.println("**********Ejercicio 4**********");

System.out.println("");
ejercicio4();
System.out.println("\n");


//Ejercicio 5
System.out.println("**********Ejercicio 5**********");

System.out.println("");
ejercicio5();


//Ejercicio 6
System.out.println("**********Ejercicio 6**********");

System.out.println("");
ArrayList<Integer> arreglo7 = new ArrayList<>();

for (int i=1; i<=6;i++){
	System.out.print("Ingrese dato: ");
	int in=teclado.nextInt();
	arreglo7.add(in);
	}
System.out.println("El arreglo original es "+arreglo7 );	

ArrayList<Integer> arreglo8= new ArrayList<>();
	
		for(int i=arreglo7.size()-1; i>=0; i--){
		arreglo8.add(arreglo7.get(i));
}
System.out.println("El arreglo final es: " + arreglo8);


System.out.println("\n");


//Ejercicio 7

System.out.println("**********Ejercicio 7**********");

System.out.println("");
System.out.println("Inserte cantidad de alumnos: ");
int inCantidad = teclado.nextInt();

ArrayList<Integer> arreglo9 = new ArrayList<Integer>();	

int contador = 0; 
for(int i=1; i<= inCantidad; i++){
System.out.print("Inserte nota de alumno "+ i + ": ");
int inNota =teclado.nextInt(); 
arreglo9.add(inNota);
contador = contador + inNota; 
}

System.out.println("Las notas del control 1 son: " + arreglo9);

int promedio = 0; 	

promedio = contador/inCantidad;
	
for(int i=0; i<=arreglo9.size()-1; i++){
	if(arreglo9.get(i)>promedio){
		System.out.println("La nota "+arreglo9.get(i)+ " está sobre el promedio "+ promedio);
	}
}

System.out.println("\n");

//Ejercicio 8

System.out.println("");
System.out.println("Ingrese un número para señalar la cantidad de datos del arreglo: ");
int inDatos = teclado.nextInt();

System.out.println("Ingrese un número para entregar sus múltiplos: ");
int inMultiplos = teclado.nextInt();

ArrayList<Integer> arreglo10 = new ArrayList<Integer>();

int resultado = 0; 
for (int i=1; i<=inDatos; i++){
     resultado = i*inMultiplos;
     arreglo10.add(resultado);	
}

System.out.println("Los múltiplos son: " + arreglo10);	 

System.out.println("\n");

}

}
