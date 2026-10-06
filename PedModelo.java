package Actividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PedModelo {

    private List<Pedido> pedidos;

    public PedModelo() {
        pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return Collections.unmodifiableList(pedidos);
    }
}