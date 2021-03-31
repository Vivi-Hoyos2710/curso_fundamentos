public class Vehiculo
{
  public static Vehiculo[][]vehiculos; 
  public static int tamaño;
  public static int cantidad = 0;
  private String placa;
  private String marca;
  private String color;
  private int valorComercial;
<<<<<<< HEAD
<<<<<<< HEAD
  public void setPlaca(String placa){
      this.placa= placa;
    }
    public void setMarca(String marca){
      this.marca= marca;
    }
   public void setColor(String color){
      this.color= color;
    }  
   public void setValorComercial(int valor){
      this.valorComercial= valor;
    } 
    
}
=======
  public Vehiculo(){  }
  public Vehiculo(String p, String m, String c, int v){
   this.placa = p;
   this.marca = m;
   this.color = c;
   this.valorComercial = v;
  }
  public Vehiculo(String p, String m, String c){
   this(p,m,c,30000000);
  }
  
}
>>>>>>> 7d1a54fcbbcbe70baa64f1b5ef64aa6b5121c7a0
=======
  public Vehiculo(){  }
  public Vehiculo(String p, String m, String c, int v){
   this.placa = p;
   this.marca = m;
   this.color = c;
   this.valorComercial = v;
  }
  public Vehiculo(String p, String m, String c){
   this(p,m,c,30000000);
  }
  public String getPlaca(){
      return this.placa;
    }
  public String getMarca(){
      return this.marca;
    }
  public String getColor(){
      return this.color;
    }
  public int getValorComercial(){
      return this.valorComercial;
    }
}
>>>>>>> ab1e9276e9803acaf2f76176885d2bde2234aa69
