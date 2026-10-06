package Actividades;


import java.util.List;

public class PedControlador {

    private PedModelo modelo;
    private PedVista vista;

    public PedControlador(PedModelo modelo, PedVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarPedido(String nombrePlato) {
        if (!nombrePlato.isEmpty()) {
            modelo.agregarPedido(new Pedido(nombrePlato));
            vista.mostrarMensaje("pedido agregado " + nombrePlato);
        } else {
            vista.mostrarMensaje("el nombre del plato no puede estar vacio");
        }
    }

    public void mostrarPedidos() {
        List<Pedido> pedidos = modelo.getPedidos();
        vista.mostrarPedidos(pedidos);
    }

    public void iniciar() {
        String opcion;

        do {
            vista.mostrarMenu();
            opcion = vista.solicitarOpcion();

            switch (opcion) {
                case "1":
                    String nombrePlato = vista.solicitarNombrePlato();
                    agregarPedido(nombrePlato);
                    break;

                case "2":
                    mostrarPedidos();
                    break;

                case "3":
                    vista.mostrarMensaje("saliendo");
                    break;

                default:
                    vista.mostrarMensaje("opcion no valida");
            }

        } while (!opcion.equals("3"));
    }
}