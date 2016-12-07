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
public class Burbuja {
    
    public static void burbuja1(Fila[]arreglo){
     int intercambios=0;
     int comparaciones=0;   
        
    Fila aux;
    for(int i=1;i<arreglo.length;i++){
        for(int j=arreglo.length-1;j>=i;j--){
            comparaciones ++;
          if(arreglo[j-1].compareTo(arreglo[j])==1){
              intercambios++;
            aux=arreglo[j-1];
            arreglo[j-1]=arreglo[j];
            arreglo[j]=aux;
         }
       }
    }
     System.out.println("El numero de comparaciones que realizo es: "+comparaciones);
     System.out.println("El numero de intercambios que realizo es: "+intercambios);
    for(int i=0;i<arreglo.length;i++){
     System.out.println(arreglo[i]);
    }

   } 
   
    public static void burbuja11(Fila[]arreglo){
     int intercambios=0;
     int comparaciones=0;   
        
    Fila aux;
    for(int i=1;i<arreglo.length;i++){
        for(int j=arreglo.length-1;j>=i;j--){
            comparaciones ++;
          if(arreglo[j-1].compareTo(arreglo[j])==-1){
              intercambios++;
            aux=arreglo[j-1];
            arreglo[j-1]=arreglo[j];
            arreglo[j]=aux;
         }
       }
    }
     System.out.println("El numero de comparaciones que realizo es: "+comparaciones);
     System.out.println("El numero de intercambios que realizo es: "+intercambios);
    for(int i=0;i<arreglo.length;i++){
     System.out.println(arreglo[i]);
    }

   } 
    
    public static Integer[] burbujaConSeñal(Integer[]arreglo){
    
     int aux=0,i=0;
     boolean flag=false;
     while(i<arreglo.length-1 && flag==flag){
        flag=true;
         for(int j=i;j<arreglo.length-1;j++){
          if(arreglo[j]>arreglo[j+1]){
             aux=arreglo[j];
             arreglo[j]=arreglo[j+1];
             arreglo[j+1]=aux;
             flag=false;
             }
        }
         i=i+1;
      }
      return arreglo;
    }
}

