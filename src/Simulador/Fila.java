package Simulador;
/**
 * Write a description of class Fila here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fila implements Comparable<Fila>
{ //una vez que ingresamos los datos de la lista original dentro de un arreglo, creamos objetos Fila, cada objeto Fila seria equivalente a una instancia de la tabla, 
  //estas las ingresamos en un nuevo arreglo de tipo fila y procedemos a ordenarlo implementando todos los metodos de ordenacion interna;
  //una vez ordenado el arreglo, lo regresamos a la lista original de datos y mostramos el resultado
    private Datos[] fila;
    private Integer entero;
    
    public Fila(Datos...data){
     for(Datos det: data)
      if(det.getDatoEntero()!=null&& det.getDatoEntero()instanceof Integer)
      this.entero=det.getDatoEntero();
    }
    
    public Integer getEntero(){
      return entero;}
    
    public static void main(String []args){
      Datos[] data={new Datos("juan"), new Datos("cruz"),new Datos("salgado"),new Datos(14161302),new Datos(76)};
      Datos[] data1={new Datos("juan"), new Datos("cruz"),new Datos("salgado"),new Datos(14161302),new Datos(150)};
      Datos[] data2={new Datos("juan"), new Datos("cruz"),new Datos("salgado"),new Datos(14161302),new Datos(13)};
      Datos[] data3={new Datos("juan"), new Datos("cruz"),new Datos("salgado"),new Datos(14161302),new Datos(1899)};
      Fila fil1=new Fila(data);
      Fila fil2=new Fila(data1);
      Fila fil3=new Fila(data2);
      Fila fil4=new Fila(data3);
      
      Fila[] filas={fil1,fil2,fil3,fil4};
      
      System.out.println("Ordenar las filas de la tabla por Metodo de la Burbuja Ascendente: ");
      Burbuja b=new Burbuja();
      b.burbuja1(filas);
      System.out.println("Forma descendente");
      b.burbuja11(filas);
      
      System.out.println("Ordenar las filas de la tabla por Metodo de la Baraja: ");
      Baraja bara=new Baraja();
      bara.baraja(filas);
      
      System.out.println("Ordenar las filas de la tabla por Metodo Shaker: ");
      Shaker sh=new Shaker();
      sh.shaker(filas);
      
      System.out.println("Ordenar las filas de la tabla por Metodo Seleccion Directa : ");
      SeleccionDirecta sDir= new SeleccionDirecta();
      sDir.seleccionDirecta(filas);
      
    }
    
    @Override
    public int compareTo(Fila fit) {
        if (entero < fit.entero) { 
        return -1;
        }
        if (entero > fit.entero) {
            return 1;
        }
        return 0;
    }
    
    public String toString(){
    String s=("Dato de la tabla: "+entero);
    return s;
  }
   

}
