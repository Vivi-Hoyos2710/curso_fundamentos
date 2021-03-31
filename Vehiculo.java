public class Vehiculo
{
  public static Vehiculo[][]vehiculos; 
  public static int tamaño;
  public static int cantidad = 0;
  private String placa;
  private String marca;
  private String color;
  private int valorComercial;
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