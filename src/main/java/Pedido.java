public class Pedido {
    private float pesoTotal;
    private float distanciaEntrega;
    private float custoEnvio;

    public Pedido(float pesoTotal, float distanciaEntrega) {
        this.pesoTotal = pesoTotal;
        this.distanciaEntrega = distanciaEntrega;
        this.custoEnvio = 0.0f; // Custo inicial
    }

    public float getCustoEnvio() {
        return custoEnvio;
    }

    public void calcularFreteStandard() {
        CalculadoraFrete calc = new CalculadoraFrete(this.pesoTotal, this.distanciaEntrega);
        this.custoEnvio = calc.calcular(new FreteServicoStandard());
    }

    public void calcularFreteExpresso() {
        CalculadoraFrete calc = new CalculadoraFrete(this.pesoTotal, this.distanciaEntrega);
        this.custoEnvio = calc.calcular(new FreteServicoExpresso());
    }

    public void definirComoRetiradaLocal() {
        CalculadoraFrete calc = new CalculadoraFrete(this.pesoTotal, this.distanciaEntrega);
        this.custoEnvio = calc.calcular(new FreteRetiradaLocal());
    }
}
