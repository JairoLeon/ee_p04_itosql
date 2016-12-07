package Simulador;
/**
 * Write a description of class Lista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lista<T>
{
  private Nodo<T> inicio;
  
  public Nodo<T> getInicio(){
    return inicio;
  }
  public void setInicio(Nodo<T> inicio){
    this.inicio=inicio;
  }
  
  public void agregarInicio(T dato){
    Nodo<T> nuevo=new Nodo<T>(dato);
    nuevo.setSiguiente(inicio);
    inicio=nuevo;
   }
   
  public void agregarFinal(T dato){
      Nodo<T> temporal;
      temporal=inicio;
      while(temporal.getSiguiente()!=null){
         temporal=temporal.getSiguiente();
        }
        temporal.setSiguiente(new Nodo<T>(dato));
    }
   
  public void insertarAntesDe(T dato,T referencia){
     Nodo<T> temporal;
     Nodo<T> encontrado=new Nodo<T>(dato);
     Nodo<T> nuevo=new Nodo<T>(dato);
     boolean band=true;
     temporal=inicio;
     while(temporal.getDato()!=referencia && band ){
         if(temporal.getSiguiente()!=null){
            encontrado=temporal;
        temporal=temporal.getSiguiente();
        }else{
         band= false;}
        }
        if (band){
          if (temporal==inicio){
              nuevo.setSiguiente(inicio);
              inicio=nuevo;
            }else{
            
            
                 nuevo.setSiguiente(temporal);
                 encontrado.setSiguiente(nuevo);
            }
         }
    }  
    
  public void insertarDespuesDe(T dato, T referencia){
     Nodo<T> temporal;
     Nodo<T> nuevo=new Nodo<T>(dato);
     boolean band=true;
     temporal=inicio;
     while(temporal.getDato()!=referencia && band ){
         if(temporal.getSiguiente()!=null){
        temporal=temporal.getSiguiente();
        }else{
         band= false;}
        }
        if (band){
          if (temporal==inicio){
              
              
            }else{
            
            
                 nuevo.setSiguiente(temporal.getSiguiente());
                 temporal.setSiguiente(nuevo);
            }
         }
    }
    
  public void eliminaPrimero(){
     if(inicio!=null){
       inicio=inicio.getSiguiente();
     }
   }
    
  public String toString(){
    Nodo<T> temporal=inicio;
    String res="";
     while(temporal!=null){
        res+=(temporal.getDato()+"|");
         temporal=temporal.getSiguiente();
        } 
        return res;
    }
  
    
}
