/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package Simulador;

/**
 *
 * @author Jairo
 */
import java.util.Arrays;
public class Shaker {
 
     
     
    public static void shaker(Fila[]arreglo){
       int intercambios=0;
       int comparaciones=0;
       
    Fila aux;   
    int i,izq,der,k;
    izq=1;
    der=arreglo.length-1;
    k=arreglo.length-1;
    while(izq<=der){
      for(i=der;i>=izq;i--){
          comparaciones++;
       if(arreglo[i-1].compareTo(arreglo[i])==1){
           intercambios++;
           aux=arreglo[i-1];
           arreglo[i-1]=arreglo[i];
           arreglo[i]=aux;
            k=i;
       }
      }
      izq=k+1;
      for(i=izq;i<=der;i++){
          comparaciones++;
       if(arreglo[i-1].compareTo(arreglo[i])==1){
           intercambios++;
           aux=arreglo[i-1];
           arreglo[i-1]=arreglo[i];
           arreglo[i]=aux;
            k=i;
       }
      }
      der=k-1;
    }
        System.out.println("El numero de comparaciones que realizo es: "+comparaciones);
        System.out.println("El numero de intercambios que realizo es: "+intercambios);
         for(int y=0;y<arreglo.length;y++){
         System.out.println(arreglo[y]);
       }
    }
    
}
