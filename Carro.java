public class Carro extends Vehiculo
{
   private int precio_de_parqueo;
   public Carro(String p, String m, String c, int v,int pp){
    super(p,m,c,v);
    this.precio_de_parqueo=pp; 
   }
    public Carro(String p, String m, String c,int pp){
    super(p,m,c);
    this.precio_de_parqueo=pp; 
   }
  @Override 
   public String getTipo() {
    return "Carro";
  }
  public int getPrecioDeParqueo() {
    return this.precio_de_parqueo;
  }
}