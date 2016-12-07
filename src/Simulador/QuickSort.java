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
public class QuickSort {
    
    private static Integer[]_quickSort(Integer[]arreglo,int ini,int fin){
      int izq,der,aux,pos;
      boolean flag;
      izq=ini;
      der=fin;
      pos=ini;
      flag=true;
      while(flag){
          flag=false;
          while((arreglo[pos]<=arreglo[der])&&(pos!=der)){
              der=der-1;
          }
          if(pos!=der){
              aux=arreglo[pos];
              arreglo[pos]=arreglo[der];
              arreglo[der]=aux;
              pos=der;
              while((arreglo[pos]>=arreglo[izq])&&(pos!=izq)){
                  izq=izq+1;
              }
              if(pos!=izq){
                  flag=true;
                  aux=arreglo[pos];
                  arreglo[pos]=arreglo[izq];
                  arreglo[izq]=aux;
                  pos=izq;
              }
          }
      }
        if((pos-1)>ini){
            _quickSort(arreglo,ini,pos-1);
        }
        if(fin>(pos+1)){
            _quickSort(arreglo,pos+1,fin);
        }
        return arreglo;
    }
    
    public static Integer[] quickSort(Integer[]arreglo){
    
        _quickSort(arreglo,0,arreglo.length-1);
        
         return arreglo;
    }
}
