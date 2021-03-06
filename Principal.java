import java.util.Scanner;
import java.util.Date;
import java.time.temporal.ChronoUnit;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadPisos, cantidadEspacios, precioCarros, precioMotos;
        // solicitando cantidad de pisos del edificio y cantidad de espacios
        System.out.println("Por favor ingrese la cantidad de pisos: ");
        cantidadPisos = entrada.nextInt();
        System.out.println("Por favor ingrese la cantidad de espacios: ");
        cantidadEspacios = entrada.nextInt();
        System.out.println("Por favor ingrese la cantidad a cobrar a los carros: ");
        precioCarros = entrada.nextInt();
        System.out.println("Por favor ingrese la cantidad a cobrar a las motos: ");
        precioMotos = entrada.nextInt();
        Vehiculo.vehiculos = new Vehiculo[cantidadPisos][cantidadEspacios];
        Sensor.sensores = new Sensor[cantidadPisos][cantidadEspacios];
        for (int i = 0; i < Sensor.sensores.length; i++) {
            for (int j = 0; j < Sensor.sensores[i].length; j++) {
                Sensor.sensores[i][j] = new Sensor(0);
            }
        }
        Vehiculo.tamano = cantidadEspacios * cantidadPisos;
        System.out.println("Escriba una opcion: ");
        System.out.println("0. Salir del sistema");
        System.out.println("1. Sensores libres");
        System.out.println("2. Registrar parqueo de vehiculo");
        System.out.println("3. Registrar parqueo de vehiculo con valor comercial");
        System.out.println("4. Listar información de vehiculos que se encuentran parqueados");
        System.out.println("5. Muestra cantidad de vehiculos que se han parqueado");
        System.out.println("6. Verificar si el espacio esta ocupado");
        System.out.println("7. Listar estado de sensores");
        System.out.println("8. Filtrar por color");
        System.out.println("9. Ordenar por valor comercial");
        System.out.println("10. Salir del parqueadero");
        System.out.println("11. Exportar informacion de vehiculos");
        int seleccion = entrada.nextInt();
        int pisoDeseado, lugarDeseado;
        String tipoVehiculos;
        while (seleccion != 0) {

            switch (seleccion) {
                case 1:
                    System.out.println(Sensor.sensorLibre());
                    break;
                case 2:
                    System.out.println("Ingrese en que piso y espacio desea parquearse: ");
                    pisoDeseado = entrada.nextInt() - 1;
                    lugarDeseado = entrada.nextInt() - 1;
                    System.out.println("Ingrese el tipo de vehiculo a parquear");
                    tipoVehiculos = entrada.next();
                    // Primero, verificar que la cantidad de vehiculos actual sea menor a el tamaño
                    // permitido de vehiculos totales.
                    // probando esto.
                    if ((0 <= pisoDeseado) && (0 <= lugarDeseado) && (pisoDeseado < cantidadPisos)
                            && (lugarDeseado < cantidadEspacios)) {
                        if (Vehiculo.cantidad < Vehiculo.tamano) {
                            if (Sensor.sensores[pisoDeseado][lugarDeseado].getEstado() == 0) {
                                System.out.println("Por favor ingresar placa,marca y color separados por espacios");
                                String placa = entrada.next();
                                String marca = entrada.next();
                                String color = entrada.next();
                                if (tipoVehiculos.equalsIgnoreCase("Moto")) {
                                    Vehiculo.vehiculos[pisoDeseado][lugarDeseado] = new Moto(placa, marca, color,
                                            precioMotos);
                                    Sensor.sensores[pisoDeseado][lugarDeseado].setEstado(1);
                                    System.out.println(Vehiculo.vehiculos[pisoDeseado][lugarDeseado]);
                                } else if (tipoVehiculos.equalsIgnoreCase("Carro")) {
                                    Vehiculo.vehiculos[pisoDeseado][lugarDeseado] = new Carro(placa, marca, color,
                                            precioCarros);
                                    Sensor.sensores[pisoDeseado][lugarDeseado].setEstado(1);
                                    System.out.println(Vehiculo.vehiculos[pisoDeseado][lugarDeseado]);
                                } else {
                                    System.out.println("Invalido, su vehiculo no es aceptado en este parqueadero.");
                                }

                            } else {
                                System.out.println("Esta ocupado");
                            }
                        }

                        else {
                            System.out.println("Esta lleno");
                        }
                    } else {
                        System.out.println("Este espacio no existe");
                    }

                    break;
                case 3:
                    System.out.println("Ingrese en que piso y espacio desea parquearse: ");
                    pisoDeseado = entrada.nextInt() - 1;
                    lugarDeseado = entrada.nextInt() - 1;
                    System.out.println("Ingrese el tipo de vehiculo a parquear");
                    tipoVehiculos = entrada.next();
                    if ((0 <= pisoDeseado) && (0 <= lugarDeseado) && (pisoDeseado < cantidadPisos)
                            && (lugarDeseado < cantidadEspacios)) {
                        if (Vehiculo.cantidad < Vehiculo.tamano) {
                            if (Sensor.sensores[pisoDeseado][lugarDeseado].getEstado() == 0) {
                                System.out.println("Ingrese la placa,marca y color separado por un espacio");
                                String placa = entrada.next();
                                String marca = entrada.next();
                                String color = entrada.next();
                                System.out.println("Ingrese el valor comercial del vehiculo: ");
                                int valor = entrada.nextInt();
                                if (tipoVehiculos.equalsIgnoreCase("Moto")) {
                                    Vehiculo.vehiculos[pisoDeseado][lugarDeseado] = new Moto(placa, marca, color, valor,
                                            precioMotos);
                                    Sensor.sensores[pisoDeseado][lugarDeseado].setEstado(1);
                                    System.out.println(Vehiculo.vehiculos[pisoDeseado][lugarDeseado].toString());
                                } else if (tipoVehiculos.equalsIgnoreCase("Carro")) {
                                    Vehiculo.vehiculos[pisoDeseado][lugarDeseado] = new Carro(placa, marca, color,
                                            valor, precioCarros);
                                    Sensor.sensores[pisoDeseado][lugarDeseado].setEstado(1);
                                    System.out.println(Vehiculo.vehiculos[pisoDeseado][lugarDeseado].toString());
                                } else {
                                    System.out.println("Invalido, su vehiculo no es aceptado en este parqueadero.");
                                }

                            } else {
                                System.out.println("Esta ocupado mijo");
                            }
                        } else {
                            System.out.println("Esta lleno");
                        }
                    } else {
                        System.out.println("Este lugar no existe");
                    }
                    break;
                case 4:
                    System.out.println(Vehiculo.toStringVehiculos());
                    break;
                case 5:
                    System.out.println("Hay " + Vehiculo.cantidad + " vehiculos parqueados");
                    break;
                case 6:
                    System.out.println("Ingrese en que piso y espacio desea parquearse: ");
                    pisoDeseado = entrada.nextInt() - 1;
                    lugarDeseado = entrada.nextInt() - 1;
                    if ((0 <= pisoDeseado) && (0 <= lugarDeseado) && (pisoDeseado < cantidadPisos)
                            && (lugarDeseado < cantidadEspacios)) {
                        if (Sensor.sensores[pisoDeseado][lugarDeseado] != null) {
                            System.out.println(Sensor.sensores[pisoDeseado][lugarDeseado].toString());
                        }
                    } else {
                        System.out.println("Este lugar no existe");
                    }

                    break;
                case 7:
                    System.out.println(Sensor.sensoresEstado());
                    break;
                case 8:
                    System.out.println("Ingrese el color deseado");
                    String color_deseado = entrada.next();
                    System.out.println(Vehiculo.filtroColor(color_deseado));
                    break;
                case 9:
                    for (int i = 0; i < Vehiculo.Ordenar().length; i++) {
                        System.out.println(Vehiculo.Ordenar()[i].toString());
                    }
                    break;
                case 10:
                    System.out.println("Ingrese el espacio a desocupar");
                    pisoDeseado = entrada.nextInt() - 1;
                    lugarDeseado = entrada.nextInt() - 1;
                    Sensor.sensores[pisoDeseado][lugarDeseado].setEstado(0);
                    Vehiculo.vehiculos[pisoDeseado][lugarDeseado].sacarVehiculo();
                    Vehiculo.vehiculos[pisoDeseado][lugarDeseado] = null;
                    Vehiculo.cantidad-=1;

                    break;
                case 11:
                    Persistencia.guardarVehiculos(Vehiculo.toStringVehiculos());
                    break;
                default:
                    System.out.println("Comando incorrecto");
                    break;
            }
            System.out.println("Escriba una opcion: ");
            System.out.println("0. Salir del sistema");
            System.out.println("1. Sensores libres");
            System.out.println("2. Registrar parqueo de vehiculo");
            System.out.println("3. Registrar parqueo de vehiculo con valor comercial");
            System.out.println("4. Listar información de vehiculos que se encuentran parqueados");
            System.out.println("5. Muestra cantidad de vehiculos que se han parqueado");
            System.out.println("6. Verificar si el espacio está ocupado");
            System.out.println("7. Listar estado de sensores");
            System.out.println("8. Filtrar por color");
            System.out.println("9. Ordenar por valor comercial");
            System.out.println("10. Salir del parqueadero");
            System.out.println("11. Exportar informacion de vehiculos");
            seleccion = entrada.nextInt();
        }
        System.out.println("Saliendo...");

    }
}
