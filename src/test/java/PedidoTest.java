import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoTest {
    @Test
    void deveCalcularFreteStandard() {
        Pedido pedido = new Pedido(5.0f, 50.0f);
        pedido.calcularFreteStandard();

        assertEquals(17.5f, pedido.getCustoEnvio());
    }

    @Test
    void deveCalcularFreteExpresso() {
        Pedido pedido = new Pedido(5.0f, 50.0f);
        pedido.calcularFreteExpresso();

        assertEquals(44.5f, pedido.getCustoEnvio());
    }

    @Test
    void deveDefinirCustoZeroParaRetiradaLocal() {
        Pedido pedido = new Pedido(5.0f, 50.0f);
        pedido.definirComoRetiradaLocal();

        assertEquals(0.0f, pedido.getCustoEnvio());
    }

    @Test
    void deveCalcularFreteStandardValoresDiferentes() {
        Pedido pedido = new Pedido(10.0f, 20.0f);
        pedido.calcularFreteStandard();

        assertEquals(19.0f, pedido.getCustoEnvio());
    }

    @Test
    void deveCalcularFreteExpressoValoresDiferentes() {
        Pedido pedido = new Pedido(2.0f, 100.0f);
        pedido.calcularFreteExpresso();

        assertEquals(57.0f, pedido.getCustoEnvio());
    }
}
