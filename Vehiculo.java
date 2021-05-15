import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Vehiculo {
  public static Vehiculo[][] vehiculos;
  public static int tamano;
  public static int cantidad = 0;
  private String placa;
  private String marca;
  private String color;
  private Date fechaYHora;
  private int valorComercial;
  SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy/HH:mm");  
  public Vehiculo() {
  }

  public Vehiculo(String p, String m, String c, int v) {
    this.placa = p;
    this.marca = m;
    this.color = c;
    this.valorComercial = v; 
    fechaYHora=new Date();
    
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
  
  public String getFecha(){
   return formato.format(this.fechaYHora);
  }
  
  public Date getFechaYHora(){
   return this.fechaYHora;
  }
  
  public int getValorComercial() {
    return this.valorComercial;
  }
  
  public String getTipo(){
   return "Vehiculo"; 
  }
  
  public int getPrecioDeParqueo() {
    return 0;
  }
  
  public String toString(){
    String info = "Marca: "+this.marca+" Placa: "+this.placa+" Color: "+this.color+ " Tipo: "+this.getTipo()+" Precio: "+this.valorComercial+" Fecha: "+this.getFecha();
    return info;
  }

  public static String toStringVehiculos(){
      String info_de_todos = "";
      for(int i=0;i < vehiculos.length;i++){
          for(int j=0;j<vehiculos[i].length;j++){
             if(vehiculos[i][j]!= null) {
                 info_de_todos += vehiculos[i][j].toString()+"piso "+i+" espacio "+j+"\n";
             }
          }
      }
      return info_de_todos;
  }

  public static int cantidadVehiculos() {
    return cantidad;
  }
  public static String filtroColor(String x){
  String Carro="";
  for(int i=0;i<vehiculos.length;i++){
    for(int j=0;j<vehiculos[i].length;j++){
      if((vehiculos[i][j]!=null)&&(vehiculos[i][j].color.equalsIgnoreCase(x))){
       Carro += vehiculos[i][j].toString()+" piso "+i+" espacio "+j+"\n";   
      }
    }
  }
    return Carro;
  }
  
  public static int Comparador(Vehiculo v1, Vehiculo v2){
  if(v1.valorComercial>v2.valorComercial){
    return 1;
    }    
  else if(v1.valorComercial<v2.valorComercial){
    return -1;
    }
  else{
      return 0;
    }  
  }
  
  public static Vehiculo[] Ordenar(){
    Vehiculo PD[] = new Vehiculo [Vehiculo.cantidadVehiculos()];
    int a=0;
    for(int i=0;i<vehiculos.length;i++){
        for(int j=0;j<vehiculos[i].length;j++){
        if(vehiculos[i][j]!=null){
          PD[a]=vehiculos[i][j];
          a++;
        }    
      }  
     }
    Arrays.sort(PD,(v1,v2)->Vehiculo.Comparador (v1,v2));
    return PD;
    }
}
