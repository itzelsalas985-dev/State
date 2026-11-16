
package State;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        System.out.println("=== SISTEMA DE GESTION DE PEDIDOS ===");

        pedido.mostrarEstado();

        System.out.println("\n1. Procesar pedido:");
        pedido.procesar();
        pedido.mostrarEstado();

        System.out.println("\n2. Enviar pedido:");
        pedido.enviar();
        pedido.mostrarEstado();

        System.out.println("\n3. Entregar pedido:");
        pedido.entregar();
        pedido.mostrarEstado();

        System.out.println("\n4. Intentar cancelar un pedido entregado:");
        pedido.cancelar();
        pedido.mostrarEstado();

        System.out.println("\n=== PRUEBA DE CANCELACION ===");

        Pedido otroPedido = new Pedido();
        otroPedido.mostrarEstado();

        otroPedido.cancelar();
        otroPedido.mostrarEstado();
    }
}
