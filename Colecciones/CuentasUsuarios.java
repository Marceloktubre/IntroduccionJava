package Colecciones;

import java.util.*;

public class CuentasUsuarios {

    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
        Cliente cl2 = new Cliente("Rafael Nadal", "00002", 150000);
        Cliente cl3 = new Cliente("Penelope Cruz", "00003", 800000);
        Cliente cl4 = new Cliente("Marcelo Iglesias", "00004", 500000);
        Cliente cl5 = new Cliente("Antonio Banderas", "00001", 200000);

        //Creamos la coleccion de tipo HashSet
        Set<Cliente> clientesBancos = new HashSet<Cliente>();

        //Agregamos a la coleccion los clientes
        clientesBancos.add(cl1);
        clientesBancos.add(cl2);
        clientesBancos.add(cl3);
        clientesBancos.add(cl4);

        //Iterator como eliminar un elemento
        Iterator<Cliente> it = clientesBancos.iterator();
        while (it.hasNext()) {
            String nombre_cliente = it.next().getNombre();
            if (nombre_cliente.equals("Marcelo Iglesias")) {
                it.remove();

            }
        }

        //Mostramos los clientes
        for (Cliente e : clientesBancos) {
            System.out.println(e.getNombre() + " N de cuenta "
                    + e.getnCuenta() + "--Saldo: " + e.getSaldo());
        }

        //Iterator
        /* Iterator<Cliente> it=clientesBancos.iterator();
       while(it.hasNext()){
           String nombre_cliente=it.next().getNombre();
           System.out.println(nombre_cliente);
           
       }*/
    }

}
