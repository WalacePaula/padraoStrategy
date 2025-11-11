public class CalculadoraFrete {
    private float pesoKg;
    private float distanciaKm;

    public CalculadoraFrete(float pesoKg, float distanciaKm) {
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
    }

    public float calcular(EstrategiaFrete estrategia) {
        return estrategia.calcularCusto(this.pesoKg, this.distanciaKm);
    }
}
