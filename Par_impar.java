/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.par_impar;

/**
 *
 * @author Joe
 */
import java.util.Scanner; //Se importa la clase "Scanner" de la biblioteca java.util.
public class Par_impar { //se declara una clase pública llamada Par_impar.
    
    public static void main(String[] args) {//Este es el método principal del programa.
        Scanner leer= new Scanner(System.in);//Se crea un objeto llamado leer de la clase Scanner, pasándole System.in como argumento. 
        int n;//Se declara una variable entera n.
        System.out.println("Ingresa un número: ");//Se pided un valor al usuario.
        n= leer.nextInt(); //El método nextInt() de leer (el objeto Scanner) se usa para leer el número entero ingresado por el usuario y guardarlo en n.
        if (n %2==0){ // se condiciona al valor de dos maneras: si es divisible por dos sin residuo es par y en caso contrario impar.
            System.out.println("El número es par.");
        }
        else{ 
            System.out.println("El número es impar.");
        }
        leer.close(); // Se cierra el objeto.
    }
        
       
    }

