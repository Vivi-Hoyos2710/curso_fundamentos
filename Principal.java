import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadPisos, cantidadEspacios;
        // solicitando cantidad de pisos del edificio y cantidad de espacios
        System.out.println("Por favor ingrese la cantidad de pisos: ");
        cantidadPisos = entrada.nextInt();
        System.out.println("Por favor ingrese la cantidad de espacios: ");
        cantidadEspacios = entrada.nextInt();
        Vehiculo.vehiculos = new Vehiculo[cantidadPisos][cantidadEspacios];
        Sensor.sensores = new Sensor[cantidadPisos][cantidadEspacios];
        Vehiculo.tamano = cantidadEspacios * cantidadPisos;
        System.out.println("Escriba una opcion: ");
        System.out.println("1. Sensores libres");
        System.out.println("2. Registrar parqueo de vehiculo");
        System.out.println("3. Registrar parqueo de vehiculo con valor comercial");
        System.out.println("4. Listar información de vehiculos que se encuentran parqueados");
        System.out.println("5. Muestra cantidad de vehiculos que se han parqueado");
        System.out.println("6. Verificar si el espacio está ocupado");
        System.out.println("7. Listar estado de sensores");
        int seleccion = entrada.nextInt();
        int pisoDeseado, lugarDeseado;
        while (seleccion != 0) {

            switch (seleccion) {
            case 1:
                System.out.println(Sensor.sensorLibre());
                break;
            case 2:
                System.out.println("Ingrese en qué piso y espacio desea parquearse: ");
                pisoDeseado = entrada.nextInt();
                lugarDeseado = entrada.nextInt();
                if (Sensor.sensores[pisoDeseado][lugarDeseado] != null) {
                    if (Sensor.sensores[pisoDeseado][lugarDeseado].getEstado() == 0) {
                        System.out.println("Ingrese la placa,marca y color separado por un espacio");
                        String placa = entrada.next();
                        String marca = entrada.next();
                        String color = entrada.next();
                        Vehiculo.vehiculos[pisoDeseado][lugarDeseado] = new Vehiculo(placa, marca, color);
                        Sensor.sensores[pisoDeseado][lugarDeseado].setEstado(1);
                        System.out.println(Vehiculo.vehiculos[pisoDeseado][lugarDeseado]);

                    } else {
                        System.out.println("Esta ocupado mijo :(");
                    }
                } else {
                    System.out.println("Este lugar no existe");
                }
                break;
            case 3:
                System.out.println("Ingrese en qué piso y espacio desea parquearse: ");
                pisoDeseado = entrada.nextInt();
                lugarDeseado = entrada.nextInt();
                if (Sensor.sensores[pisoDeseado][lugarDeseado] != null) {
                    if (Sensor.sensores[pisoDeseado][lugarDeseado].getEstado() == 0) {
                        System.out.println("Ingrese la placa,marca y color separado por un espacio");
                        String placa = entrada.next();
                        String marca = entrada.next();
                        String color = entrada.next();
                        System.out.println("Ingrese el valor comercial del vehiculo: ");
                        int valor = entrada.nextInt();
                        Vehiculo.vehiculos[pisoDeseado][lugarDeseado] = new Vehiculo(placa, marca, color, valor);
                        Sensor.sensores[pisoDeseado][lugarDeseado].setEstado(1);
                        System.out.println(Vehiculo.vehiculos[pisoDeseado][lugarDeseado]);

                    } else {
                        System.out.println("Esta ocupado mijo :(");
                    }
                } else {
                    System.out.println("Este lugar no existe");
                }
                break;
            case 4:
                System.out.println(Vehiculo.toStringVehiculos());
                break;
            case 5:
                System.out.println(Vehiculo.cantidad);
                break;
            case 6:
                System.out.println("Ingrese en que piso y espacio desea parquearse: ");
                pisoDeseado = entrada.nextInt();
                lugarDeseado = entrada.nextInt();
                if (Sensor.sensores[pisoDeseado][lugarDeseado] != null) {
                    System.out.println(Sensor.sensores[pisoDeseado][lugarDeseado].toString());
                } else {
                    System.out.println("Este lugar no existe");
                }
                break;
            case 7:
                System.out.println(Sensor.sensoresEstado());
                break;
            default:
                System.out.println("Comando incorrecto");
                break;
            }
            System.out.println("Escriba una opcion: ");
            System.out.println("1. Sensores libres");
            System.out.println("2. Registrar parqueo de vehiculo");
            System.out.println("3. Registrar parqueo de vehiculo con valor comercial");
            System.out.println("4. Listar información de vehiculos que se encuentran parqueados");
            System.out.println("5. Muestra cantidad de vehiculos que se han parqueado");
            System.out.println("6. Verificar si el espacio está ocupado");
            System.out.println("7. Listar estado de sensores");
        }
        System.out.println("Saliendo...");

    }
}
