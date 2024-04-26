package Formas.modelo;

public class cuadrado extends Forma{

        private double lado;

        public cuadrado(double lado) {

            this.lado = lado;
        }
        @Override
        public double calcularArea() {
            return Math.pow(lado, 2);
        }
        @Override
        public double calcularPerimetro() {
            return 4 * lado;
        }
    @Override
    public double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }
}



