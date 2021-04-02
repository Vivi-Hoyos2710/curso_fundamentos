public class Sensor{
    public static Sensor[][] sensores;
    private int estado;
    public Sensor(){}
    public Sensor(int estado){
        this.estado= estado;
    }
    public void setEstado(int estado){
        this.estado= estado;
    }
    public int getEstado(){
        return this.estado;
    }
    public String toString(){
        if(this.estado==1){
            return "Ocupado";
        }
        else{
            return "Libre";
        }
    }
    public static String sensorLibre(){
        String sensoresLibres="";
        for(int i=0;i<sensores.length;i++){
            for(int j=0;j<sensores[i].length;j++){
                if(sensores[i][j]!=null){
                    if(sensores[i][j].getEstado()==0){
                        sensoresLibres+= "Piso: "+i+"Espacio: "+j+"\n";
                    }
                }
            }
        }
        return sensoresLibres;
    }
    public static String sensoresEstado(){
        String listaDeSensores="";
        for(int i=0;i<sensores.length;i++){
            for(int j=0;j<sensores[i].length;j++){
                if(sensores[i][j]!=null){
                    listaDeSensores+= "Piso: "+i+"Espacio "+j+"Estado "+sensores[i][j].toString()+"\n";
                }
            }
        }
        return listaDeSensores;
    }
}