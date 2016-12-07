package Simulador;
/**
 * Write a description of class BaseDeDatos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseDeDatos
{
    Lista<Tabla> tablas=new Lista<Tabla>();
    
    public void select(String referencia){// Este metodo muestra en pantalla la tabla seleccionada dandole el nombre de la tabla
      System.out.println("El metodo select muestra en pantalla una tabla especifica segun un nombre que se le pasa como parametro:");
      Nodo<Tabla> temporal;
      temporal=tablas.getInicio();
      boolean flag=true;
      while(temporal.getSiguiente()!=null&& flag){
        if(temporal.getDato().getNombre().equals(referencia)){
           System.out.println(temporal.getDato().toString());
           flag=false;
        }else{
        temporal=temporal.getSiguiente();
         if(temporal.getSiguiente()==null)
            System.out.println("Tabla; "+referencia+" no existe");
       }
        }
       
    }   
    
    public void insertar(Tabla...tab){//este metodo almacena las tablas creadas en una lista de tablas
      for(Tabla tabs:tab)  
        if(tablas.getInicio()!=null)
         tablas.agregarFinal(tabs);
        else
         tablas.agregarInicio(tabs);  
    
    }
    
    public String toString(){// el toString nos muestra en pantalla todas las tablas que se encuentran disponibles, que han sido creadas
      String s=("Tablas Disponibles: ");
      Nodo<Tabla> temporal=tablas.getInicio();
       while(temporal!=null){
        s+=(temporal.getDato().getNombre()+"; ");
         temporal=temporal.getSiguiente();
        } 
      return s;
    }
    
    public static void main(String[]args){
      Tabla ta=new Tabla("Personas");
      ta.agregarTabla("Personas","Nombre","aMaterno","aPaterno","Edad");
      Tabla ta1=new Tabla("Estudiantes");
      ta1.agregarTabla("Estudiantes","Nombre","aMaterno","aPaterno","No Control","Edad");
      Tabla ta2=new Tabla("Carros");
      ta2.agregarTabla("Carros","Marca"," modelo","Año","Precio");
      Tabla ta3=new Tabla("Materias");
      ta3.agregarTabla("Materias","Nombre Materia","Creditos","Horas");
     
      ta.insertarElemento("Personas",new Datos("Juan   "),new Datos("Pérez   "),new Datos("Prado   "),new Datos(50));
      ta1.insertarElemento("Estudiantes",new Datos("Luis    "),new Datos("Caballero"),new Datos("Martinez "),new Datos(14161304),new Datos(14));
      ta1.insertarElemento("Estudiantes",new Datos("Roberto "),new Datos("Espinoza"), new Datos("Cruz "),    new Datos(14162112),new Datos(19));
      ta1.insertarElemento("Estudiantes",new Datos("Pedro   "),new Datos("Lopez  "),  new Datos("Torres "),  new Datos(14168315),new Datos(15));
      ta1.insertarElemento("Estudiantes",new Datos("Jose    "),new Datos("Juarez "),  new Datos("Chavez "),  new Datos(14164671),new Datos(20));
      ta1.insertarElemento("Estudiantes",new Datos("Armando "),new Datos("Leon   "),new Datos("Salgado"),    new Datos(14165710),new Datos(17));
      ta2.insertarElemento("Carros",new Datos("Nissan"),new Datos("Tsuru"),new Datos(2016),new Datos(115000));
      ta3.insertarElemento("Materias",new Datos("Estructuras de Datos"),new Datos(5),new Datos(80));
      
      System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////// ");
      
      System.out.println(ta);
      System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////// ");
      System.out.println(ta1);
      System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////// ");
      System.out.println(ta2);
      System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////// ");
      System.out.println(ta3);
      System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////// ");
      
      ta1.cuantosTieneI(ta1.getLista());
      ta1.cuantosTieneC(ta1.getLista2());
      System.out.println("EL numero de datos dividido entre el numero de columnas nos da el tamaño del arreglo en el cual ingresaremos los datos para ordenarlo");
      System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////// ");
      ta1.llenarArreglo(ta1.getLista());
      System.out.println(" ");
      System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////// ");
      BaseDeDatos bd=new BaseDeDatos();
      bd.insertar(ta,ta1,ta2,ta3);
      System.out.println(bd);
      bd.select("Personas");
      bd.select("Estudiantes");
      System.out.println(" ");
     
     
      
    }
}
