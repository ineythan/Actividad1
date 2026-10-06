package Actividades;

import java.util.List;
import java.util.Scanner;

public class PedVista implements AutoCloseable {

    private Scanner scanner;

    public PedVista() {
        scanner = new Scanner(System.in);
    }

    public String solicitarNombrePlato() {
        System.out.print("ingrese el nombre del plato ");
        return scanner.nextLine();
    }

    public void mostrarPedidos(List<Pedido> pedidos) {
        if (pedidos.isEmpty()) {
            System.out.println("no hay pedidos en la lista");
        } else {
            System.out.println("lista de pedidos");

            for (Pedido pedido : pedidos) {
                System.out.println(pedido.getNombrePlato());
            }
        }
    }

    public void mostrarMenu() {
        System.out.println();
        System.out.println("opciones");
        System.out.println("1 agregar pedido");
        System.out.println("2 mostrar pedidos");
        System.out.println("3 salir");
    }

    public String solicitarOpcion() {
        System.out.print("seleccione una opcion ");
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void close() {
        scanner.close();
    }
}