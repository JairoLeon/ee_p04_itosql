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
public class SeleccionDirecta {
    
    
  public static void seleccionDirecta(Fila[]arreglo){
       int intercambios=0;
       int comparaciones=0;
      
     int i,k,j;
     Fila menor;
       for(i=0;i<arreglo.length-1;i++){
           comparaciones++;
            menor=arreglo[i];
            k=i;
            for(j=i+1;j<arreglo.length;j++){
                if(arreglo[j].compareTo(menor)==-1){
                    intercambios++;
                    menor=arreglo[j];
                     k=j;
                }
            }
            arreglo[k]=arreglo[i];
            arreglo[i]=menor;
       }
        System.out.println("El numero de comparaciones que realizo es: "+comparaciones);
        System.out.println("El numero de intercambios que realizo es: "+intercambios);
      for(int y=0;y<arreglo.length;y++){
         System.out.println(arreglo[y]);
       }
    }
  
}





