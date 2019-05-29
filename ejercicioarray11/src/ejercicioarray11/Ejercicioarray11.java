/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarray11;

import java.util.Scanner;

/**
 *
 * Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. 
 * Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, 
 * e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
 * 
 */
public class Ejercicioarray11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int elementos[]= new int [10];
        boolean creciente = true;
        int num,sitio=0,j=0;
        
        System.out.println("LLENE EL ARREGLO");
        do{
            //llenamos el arreglo
            for(int i = 0;i <5; i++){
                System.out.print((i+1)+".Digite un número: ");
                elementos[i]= entrada.nextInt();
            }
            
            //comprobamos si el arreglo esta ordenado en forma creciente
            for(int i =0; i<4;i++){
                if(elementos[i]<elementos[i+1]){
                    creciente = true;
                }
                if(elementos[i]>elementos[i+1]){
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("El arreglo no esta ordenado en forma creciente");
            }
        }while(creciente == false);
        
        System.out.println("Digite un lemento a insertar");
        num = entrada.nextInt();
        
        //para observar la posición del número
        while(elementos[j]<num&&j<5){
            sitio++;
            j++;
        }
        
        //trasaladamos posicion de arreglo a los elementos que vann detras de numero
        for(int i = 4; i>=sitio;i-- ){
            elementos[i+1]=elementos[i];
        }
        //insertamos el numero  del usuario
        elementos[sitio]=num;
            
            System.out.println("El arreglo queda como: ");
        for(int i=0;i<6;i++){
            System.out.print(elementos[i]+" - ");
        }
        
    }
    
}
