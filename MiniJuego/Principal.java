package MiniJuego;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Principal {

    public static void main(String[] args) {
        Bichos[][] tablero = new Bichos[2][2];
        int cantidadBichos = ThreadLocalRandom.current().nextInt(1, 5);// Numero aleatorio de 1 a 4 (la funcion toma el
                                                                       // ultimo parametro como n máximo+1)
        int tipoBicho = ThreadLocalRandom.current().nextInt(1, 3); // Lo mismo de arriba pero este se usa para sacar
                                                                   // tipo de bicho aleatoriamente.
        int contador = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (contador <= cantidadBichos) {
                    tablero[i][j] = Bichos.creador(tipoBicho);
                    contador++;
                    tipoBicho = ThreadLocalRandom.current().nextInt(1, 3);
                } else {
                    break;
                }

            }
        }
        String info1="";
        String info2="";
        String info3="";
        String info4="";
        if (tablero[0][0]==null) {
            info1="     ";
        }
        else{
            
        }
        
        Scanner entrada = new Scanner(System.in);
        int pistola = entrada.nextInt();

        while (true) {
            switch (pistola) {
                case 1:
                    if (tablero[0][0] != null) {
                        tablero[0][0].setSalud(tablero[0][0].getSalud() - 5);
                    }
                    if (tablero[0][0].getSalud() == 0) {
                        tablero[0][0] = null;
                    }
                    break;
                case 2:
                    if (tablero[0][1] != null) {
                        tablero[0][1].setSalud(tablero[0][1].getSalud() - 5);
                    }
                    if (tablero[0][1].getSalud() == 0) {
                        tablero[0][1] = null;
                    }
                    break;
                case 3:
                    if (tablero[1][0] != null) {
                        tablero[1][0].setSalud(tablero[1][0].getSalud() - 5);
                    }
                    if (tablero[1][0].getSalud() == 0) {
                        tablero[1][0] = null;
                    }
                    break;
                case 4:
                    if (tablero[1][1] != null) {
                        tablero[1][1].setSalud(tablero[1][1].getSalud() - 5);
                    }
                    if (tablero[1][1].getSalud() == 0) {
                        tablero[1][1] = null;
                    }
                    break;

                default:
                    System.out.println("Posición inválida");
                    break;
            }
            contador = 0;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j] != null) {
                        contador++;
                    }

                }
            }
            if(contador==0){
                break;
            }
        }

    }
}
