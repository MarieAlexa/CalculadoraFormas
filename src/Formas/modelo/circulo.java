package Formas.modelo;

public class circulo extends Forma {


        private double radio;


        public circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }

        @Override
        public double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }

        @Override
        public double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente);
        }
}




