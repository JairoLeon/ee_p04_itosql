package Simulador;
/**
 * Write a description of class Tabla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tabla
{
   private String nombre;
   private Lista<String> columnas=new Lista<String>();
   private Lista<Datos> inserciones=new Lista<Datos>();
   Integer contaC=0;
   Integer contaI=0;
    public Tabla(String nombre){
     this.nombre=nombre;
      System.out.println("Tabla "+nombre+" Creada");  
   }
    public void setNombre(String n){
     this.nombre=n;
   }
    public String getNombre(){
     return nombre;
   }
    
    public void agregarTabla(String nom,String...s){
      if(this.nombre==nom){
       for(String texto:s)
         if(columnas.getInicio()!=null)
           columnas.agregarFinal(texto);
         else
           columnas.agregarInicio(texto); 
      }
   }
     
    public void insertarElemento(String referencia,Datos...datos){
     if(this.nombre==referencia){
      for(Datos entrada:datos)
       if(inserciones.getInicio()!=null)
         inserciones.agregarFinal(entrada);
       else
          inserciones.agregarInicio(entrada); 
      System.out.println("1 Dato agregados a tabla: "+referencia);   
      }else{
        System.out.println("Datos no corresponden a tabla: "+referencia);  
        }
            
   }
   
   public Lista<Datos> getLista(){
     return inserciones;
    }
   public Lista<String> getLista2(){
     return columnas;
    }
    
   public void cuantosTieneI(Lista<Datos> inserciones){//metodo para saber cuantos datos tiene la tabla
     //Integer conta=0;
     Nodo<Datos> temporal;
     temporal=inserciones.getInicio();
      while(temporal.getSiguiente()!=null){
        contaI++;
        temporal=temporal.getSiguiente();
      }
        contaI=contaI+1;
        System.out.println("La tabla "+this.nombre+" tiene:"+contaI+" datos");
    }
    
   public void cuantosTieneC(Lista<String> columnas){//metodo para saber cuantas columnas tiene la tabla
     //Integer conta=0;
     Nodo<String> temporal;
     temporal=columnas.getInicio();
      while(temporal.getSiguiente()!=null){
        contaC++;
        temporal=temporal.getSiguiente();
      }
        contaC=contaC+1;
        System.out.println("La tabla "+this.nombre+" tiene:"+contaC+" Columnas");
    }
     
    public String toString(){
      String s=(nombre+"\n"+columnas.toString()+"\n"+inserciones.toString());
      return s;
   }
   
   public void llenarArreglo(Lista<Datos> inserciones){// Metodo para pasar los elementos que se encuentran en la lista de datos de la tabla a un arreglo y asi poder ordenarlos
      
      Datos[] arreglo=new Datos[contaC];
      Integer inte=contaC;
      Integer  aux=contaC;
      Nodo<Datos> temporal;
      temporal=inserciones.getInicio();
      while(temporal.getSiguiente()!=null&&inte>0){
        arreglo[aux-inte]=temporal.getDato();
        inte--;
        temporal=temporal.getSiguiente();
        inserciones.eliminaPrimero();
    }
       if(temporal.getSiguiente()==null){
        arreglo[aux-inte]=temporal.getDato();
    }
     //for(int u=0;u<4;u++){
       //   System.out.println(arreglo[u]);}
      while(inserciones.getInicio()!=null&&inserciones.getInicio().getSiguiente()!=null){
       llenarArreglo(inserciones);
       
    }
    System.out.println("Metodo para pasar los elementos que se encuentran en la lista de datos de la tabla "+this.nombre+" a un arreglo y asi poder ordenarlos: ");
    for(int u=0;u<5;u++){
     System.out.println(arreglo[u]);}
      
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
    
  }
}
