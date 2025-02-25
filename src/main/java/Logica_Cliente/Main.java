package Logica_Cliente;

import Helpers.HelperValidacion;
import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Santiago Lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //abstaccion tiene los atyributos 
        String marca, serial, tamaño, color;
        String nombre, apellido, cedula = null, direccion;
        int rta, conteo, opc = 0, num_pcs;

// Se crea la lista de compuitador y persona
// Se crea la lista global = null para que se borre la información y no se sobreescriba 
        ArrayList<Computador> listacompusglobal = null;
        ArrayList<Persona> listapersona = new ArrayList<>();

// Se crean lo objetos computador y persona 
        Computador compu;
        Persona objPersona;

        do {
            System.out.println("1. Registar Persona");
            System.out.println("2. Mostrar Persona");
            System.out.println("3. Buscar persona");
            System.out.println("4. Salir");

            System.out.println("Digite una opcion valida");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    ArrayList<Computador> listacompuslocal = new ArrayList<>();
                    System.out.println("Digite el numero de pcs");
                    num_pcs = scan.nextInt();

                    for (int i = 0; i < num_pcs; i++) {
                        scan.nextLine();
                        // TO DO computador
                        System.out.println("Digite la marca del pc");
                        marca = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(marca);

                        while (rta > 0) {
                            System.out.println("Digite la marca del computador");
                            marca = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(marca);
                        }

                        conteo = HelperValidacion.ValidarTodo(marca);

                        while (conteo != 0) {
                            System.out.println("Digite la marca de la computador");
                            marca = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodo(marca);

                        }

                        System.out.println("Digite el serial del pc");
                        serial = scan.nextLine();

                        rta = HelperValidacion.ValidarVacio(serial);

                        while (rta > 0) {
                            System.out.println("Digite el serial del computador");
                            serial = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(serial);
                        }

                        conteo = HelperValidacion.ValidarTodoSerial(serial);

                        while (conteo != 0) {
                            System.out.println("Digite el serial del computador");
                            serial = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodoSerial(serial);

                        }

                        System.out.println("Digite el tamaño del pc");
                        tamaño = scan.nextLine();

                        rta = HelperValidacion.ValidarVacio(tamaño);

                        while (rta > 0) {
                            System.out.println("Digite el tamaño del computador");
                            tamaño = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(tamaño);
                        }

                        conteo = HelperValidacion.ValidarTodo(tamaño);

                        while (conteo != 0) {
                            System.out.println("Digite el tamaño computador");
                            tamaño = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodo(tamaño);

                        }

                        System.out.println("Digite el color del pc");
                        color = scan.nextLine();

                        rta = HelperValidacion.ValidarVacio(color);

                        while (rta > 0) {
                            System.out.println("Digite el color del pc");
                            color = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(color);
                        }

                        conteo = HelperValidacion.ValidarTodo(color);

                        while (conteo != 0) {
                            System.out.println("Digite el color del pc");
                            color = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodo(color);

                        }

                        compu = new Computador(marca, serial, tamaño, color);
                        listacompuslocal.add(compu);
                    }

                    listacompusglobal = listacompuslocal;
                    listacompuslocal = null;

                    //TO DO Persona
                    System.out.println("Digite el nombre de la persona");
                    nombre = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(nombre);

                    while (rta > 0) {
                        System.out.println("Digite el nombre de la persona");
                        nombre = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(nombre);
                    }

                    conteo = HelperValidacion.ValidarTodoSerial(nombre);

                    while (conteo != 0) {
                        System.out.println("Digite el nombre de la persona");
                        nombre = scan.nextLine();
                        conteo = HelperValidacion.ValidarTodoSerial(nombre);

                    }

                    System.out.println("Digite el apellido de la persona");
                    apellido = scan.nextLine();

                    rta = HelperValidacion.ValidarVacio(apellido);

                    while (rta > 0) {
                        System.out.println("Digite el apellido de la persona");
                        apellido = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(apellido);
                    }

                    conteo = HelperValidacion.ValidarTodoSerial(apellido);

                    while (conteo != 0) {
                        System.out.println("Digite el apellido de la persona");
                        apellido = scan.nextLine();
                        conteo = HelperValidacion.ValidarTodoSerial(apellido);

                    }

                    System.out.println("Digite la cedula de la persona");
                    cedula = scan.nextLine();

                    rta = HelperValidacion.ValidarVacio(cedula);

                    while (rta > 0) {
                        System.out.println("Digite la cedula de la persona");
                        cedula = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(cedula);
                    }

                    conteo = HelperValidacion.ValidarTodoLetra(cedula);

                    while (conteo != 0) {
                        System.out.println("Digite la cedula de la persona");
                        cedula = scan.nextLine();
                        conteo = HelperValidacion.ValidarTodoLetra(cedula);

                    }

                    System.out.println("Digite la direccion de la persona");
                    direccion = scan.nextLine();

                    rta = HelperValidacion.ValidarVacio(direccion);

                    while (rta > 0) {
                        System.out.println("Digite la direccion de la persona");
                        direccion = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(direccion);
                    }

                    conteo = HelperValidacion.ValidarTodoDireccion(direccion);

                    while (conteo != 0) {
                        System.out.println("Digite la direccion de la persona");
                        direccion = scan.nextLine();
                        conteo = HelperValidacion.ValidarTodoDireccion(direccion);

                    }
                    // En esta parte se hace la asociación
                    objPersona = new Persona(nombre, apellido, direccion, cedula, listacompusglobal);
                    listapersona.add(objPersona);

                    break;
                // cambio la forma de imprimir, es con helperImpresion
                case 2:
                    Helpers.HelperImpresion.ImprimirInfo(listapersona);
                    break;
                case 3:
                    Helpers.HelperImpresion.BuscarPersona(cedula, listapersona);
                    break;
                case 4:
                    break;
            }

        } while (opc != 4);

    }

}
