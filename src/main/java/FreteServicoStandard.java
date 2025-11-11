public class FreteServicoStandard implements EstrategiaFrete{
    @Override
    public float calcularCusto(float pesoKg, float distanciaKm) {
        return 4.0f + (pesoKg * 1.20f) + (distanciaKm * 0.15f);
    }
}
