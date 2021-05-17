import java.io.*;
public abstract class Persistencia {
    public static void guardarVehiculos(String info){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero= new FileWriter("infoVehiculos.txt");
            pw = new PrintWriter(fichero);
            pw.println(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if (null != fichero)
              fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
