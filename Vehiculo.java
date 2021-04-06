public class Vehiculo {
  public static Vehiculo[][] vehiculos;
  public static int tamano;
  public static int cantidad = 0;
  private String placa;
  private String marca;
  private String color;
  private int valorComercial;

  public Vehiculo() {
  }

  public Vehiculo(String p, String m, String c, int v) {
    this.placa = p;
    this.marca = m;
    this.color = c;
    this.valorComercial = v;
    cantidad++;
  }

  public Vehiculo(String p, String m, String c) {
    this(p, m, c, 30000000);
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setValorComercial(int valor) {
    this.valorComercial = valor;
  }

  public String getPlaca() {
    return this.placa;
  }

  public String getMarca() {
    return this.marca;
  }

  public String getColor() {
    return this.color;
  }

  public int getValorComercial() {
    return this.valorComercial;
  }

  public String toString(){
    String info = "Marca: "+this.marca+" Placa: "+this.placa+" Color: "+this.color+" Precio: "+this.valorComercial;
    return info;
  }

  public static String toStringVehiculos(){
      String info_de_todos = "";
      for(int i=0;i < vehiculos.length;i++){
          for(int j=0;j<vehiculos[i].length;j++){
             if(vehiculos[i][j]!= null) {
                 info_de_todos += vehiculos[i][j].toString()+"\n";
             }
          }
      }
      return info_de_todos;
  }

  public static int cantidadVehiculos() {
    return cantidad;
  }
}
