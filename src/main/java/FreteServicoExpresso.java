public class FreteServicoExpresso implements EstrategiaFrete{
    @Override
    public float calcularCusto(float pesoKg, float distanciaKm) {
        return 12.0f + (pesoKg * 2.50f) + (distanciaKm * 0.40f);
    }
}
