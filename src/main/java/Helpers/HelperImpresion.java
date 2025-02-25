
package Helpers;

import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class HelperImpresion {
       public static void ImprimirInfo(ArrayList<Persona> listapersonas) {
       

        for (int i = 0; i < listapersonas.size(); i++) {
            System.out.println("Persona"+(i+1)+"\n");
            System.out.println("El nombre de la persona es:" + "\t" + listapersonas.get(i).getNombre());
            System.out.println("El apellido de la persona es:" + "\t" + listapersonas.get(i).getApellido());
            System.out.println("El cedula de la persona es:" + "\t" + listapersonas.get(i).getCedula());
            System.out.println("El direccion de la persona es:" + "\t" + listapersonas.get(i).getDireccion());
            System.out.println("\n");

            for (int j = 0; j < listapersonas.get(i).getListacompus().size(); j++) {
                System.out.println("Computador"+(j+1));
                System.out.println("La marca del computador es:" + "\t" + listapersonas.get(i).getListacompus().get(j).getMarca());
                System.out.println("El serial del computador es:" + "\t" + listapersonas.get(i).getListacompus().get(j).getSerial());
                System.out.println("El color del computador es:" + "\t" + listapersonas.get(i).getListacompus().get(j).getColor());
                System.out.println("La tamaño del computador es:" + "\t" + listapersonas.get(i).getListacompus().get(j).getTamaño());
                System.out.println("\n");
            }
        }

    }
    public static void BuscarPersona(String id, ArrayList<Persona> lista) {
        int band = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (id.equals(lista.get(i).getCedula())) {
                band = 1;
                System.out.println("El nombre de la persona es:" + "\t" + lista.get(i).getNombre());
                System.out.println("El apellido de la persona es:" + "\t" + lista.get(i).getApellido());
                System.out.println("El cedula de la persona es:" + "\t" + lista.get(i).getCedula());
                System.out.println("El direccion de la persona es:" + "\t" + lista.get(i).getDireccion());
                for (int j = 0; j < lista.get(i).getListacompus().size(); j++) {
                    System.out.println("Computador" + (j + 1));
                    System.out.println("La marca del computador es:" + "\t" + lista.get(i).getListacompus().get(j).getMarca());
                    System.out.println("El serial del computador es:" + "\t" + lista.get(i).getListacompus().get(j).getSerial());
                    System.out.println("El color del computador es:" + "\t" + lista.get(i).getListacompus().get(j).getColor());
                    System.out.println("La tamaño del computador es:" + "\t" + lista.get(i).getListacompus().get(j).getTamaño());
                }
            }
            if (band == 0) {
                System.out.println("id no encontrado");
            }
        }
    }
}
