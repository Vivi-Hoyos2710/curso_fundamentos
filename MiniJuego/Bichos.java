package MiniJuego;

public class Bichos {
    // Atributos de bichos
    private String representacion; // Cómo se verá el bicho en pantalla.
    private int salud; // Salud del bicho
    public Bichos(){}
    public Bichos(String representacion, int salud) {
        this.representacion = representacion;
        this.salud = salud;
    }

   
    //Setters
    public void setSalud(int salud){
        if(salud>0){
            this.salud= salud;
        }
        else{
            this.salud= 0;
        }
    }
    //Getters
    public int getSalud() {
        return this.salud;
    }
    public String getRepresentacion() {
        return this.representacion;
    }
    //metodos
    public static Bichos creador(int tipo) {
        Bichos nuevoBicho= new Bichos();
        if (tipo == 1) {
            nuevoBicho = new Bichos("BN-",10);
        } else if (tipo == 2) {
            nuevoBicho = new Bichos("BA-",20);
        }
        return nuevoBicho;
    }

    public String toString() {
        String info= this.getRepresentacion()+this.getSalud();
        return info;
    }


}
