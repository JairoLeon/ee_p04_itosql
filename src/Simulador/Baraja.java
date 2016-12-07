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
public class Baraja {
    
 public static void baraja(Fila[]arreglo){
    int intercambios=0;
    int comparaciones=0; 
     
    Fila aux;
    int k;
    for(int i=1;i<arreglo.length;i++){
        comparaciones++;
       aux=arreglo[i];
        k=i-1;
    while(aux.compareTo(arreglo[k])==-1&&k>0){
       arreglo[k+1]=arreglo[k];
        k=k-1;
     }
    if(arreglo[k].compareTo(aux)==-1||arreglo[k].compareTo(aux)==0){
        intercambios++;
       arreglo[k+1]=aux;
    }else{
       arreglo[k+1]=arreglo[k];
       arreglo[k]=aux;
    }
    }
      System.out.println("El numero de comparaciones que realizo es: "+comparaciones);
      System.out.println("El numero de intercambios que realizo es: "+intercambios);
     for(int i=0;i<arreglo.length;i++){
     System.out.println(arreglo[i]);
    }
    
    }
 
 public static Integer[] barajaConBusquedaBi(Integer[]arreglo){
   int i,aux,izq,der,m,j;
   for(i=1;i<arreglo.length;i++){
       aux=arreglo[i];
        izq=0;
        der=i-1;
      while(izq<=der){
        m=(izq+der)/2;
        if(aux<arreglo[m]){
            der=m-1;
        }else{
           izq=m+1;
        }
      }
      j=i-1;
      while(j>=izq){
           arreglo[j+1]=arreglo[j];
             j=j-1;
      }
      arreglo[izq]=aux;
   }
   
     
     return arreglo;
 }
}
