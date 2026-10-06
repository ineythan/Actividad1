package Actividades;


public class Main {

    public static void main(String[] args) {

        PedModelo modelo = new PedModelo();

        try (PedVista vista = new PedVista()) {
            PedControlador controlador = new PedControlador(modelo, vista);
            controlador.iniciar();
        }
    }
}