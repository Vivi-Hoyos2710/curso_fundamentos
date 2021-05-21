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
            info1= tablero[0][0].toString();
        }

        if (tablero[0][1]==null) {
            info2="     ";
        }
        else{
            info2= tablero[0][1].toString();
        }

        if (tablero[1][0]==null) {
            info3="     ";
        }
        else{
            info3= tablero[1][0].toString();
        }

        if (tablero[1][1]==null) {
            info3="     ";
        }
        else{
            info3= tablero[1][1].toString();
        }
        Scanner entrada = new Scanner(System.in);
        int pistola = entrada.nextInt();
        System.out.println("-------------");
        System.out.println("|"+info1+"|"+info2+"|");
        System.out.println("-------------");
        System.out.println("|"+info3+"|"+info4+"|");
         System.out.println("-------------");

        System.out.println("Seleccione el lugar a dispara");
        int pistola = entrada.nextInt();
        while (true) {
            System.out.println("-------------");
            System.out.println("|"+info1+"|"+info2+"|");
            System.out.println("-------------");
            System.out.println("|"+info3+"|"+info4+"|");
            System.out.println("-------------");
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

            if (tablero[0][0]==null) {
                info1="     ";
            }
            else{
                info1= tablero[0][0].toString();
            }

            if (tablero[0][1]==null) {
                info2="     ";
            }
            else{
                info2= tablero[0][1].toString();
            }

            if (tablero[1][0]==null) {
                info3="     ";
            }
            else{
                info3= tablero[1][0].toString();
            }

            if (tablero[1][1]==null) {
                info3="     ";
            }
            else{
                info3= tablero[1][1].toString();
            }
            System.out.println("-------------");
            System.out.println("|"+info1+"|"+info2+"|");
            System.out.println("-------------");
            System.out.println("|"+info3+"|"+info4+"|");
            System.out.println("-------------");
        }

    }
}
