package Formas.modelo;

public class rectangulo extends Forma{

        private double baseRectangulo;
        private double alturaRectangulo;


        public rectangulo(double base, double altura) {
            this.baseRectangulo = base;
            this.alturaRectangulo = altura;
        }

        @Override
        public double calcularArea() {

            return baseRectangulo * alturaRectangulo;
        }

        @Override
        public double calcularPerimetro() {

            return 2 * (baseRectangulo + alturaRectangulo);
        }
    @Override
    public double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }
}






