
/**
 * Write a description of class Datos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package Simulador;
/**
 * tipo de dato abstracto para elmacenar un estring o un entero
 * @author Jairo
 */
public class Datos implements Comparable<Datos>
{
  private String datoTexto;
  private Integer datoEntero;
  
  public Datos(String datoTexto){
      this.datoTexto=datoTexto;
    
  }
  
  public Datos(Integer datoEntero){
    this.datoEntero=datoEntero;
  }
  
  public String  getDatoTexto(){
    return datoTexto;
  }
  public void setDatoTexto(String dt){
    this.datoTexto=dt;
  }
  public Integer getDatoEntero(){
    return datoEntero;
  }
  public void setDatoEntero(Integer de){
    this.datoEntero=de;
  }
  
  public String toString(){
      String s="";
      if(this.getDatoEntero()==null){
         s+=(this.getDatoTexto());
      }else{
        if(this.getDatoTexto()==null){
         s+=(String.valueOf(this.getDatoEntero()));
        }
    }
    return s;
  }
  
  @Override
    public int compareTo(Datos d) {
        if (datoEntero < d.datoEntero) { 
        return -1;
        }
        if (datoEntero > d.datoEntero) {
            return 1;
        }
        return 0;
    }
  
}

