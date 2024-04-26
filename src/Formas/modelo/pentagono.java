package Formas.modelo;

public class pentagono extends Forma {


        private double ladoPentagono;
        private double apotema;

        public pentagono (double lado, double apotema) {
            this.ladoPentagono = lado;
            this.apotema = apotema;
        }
        @Override
        public double calcularArea() {

            return (5 * ladoPentagono * apotema) / 2;
        }

        @Override
        public double calcularPerimetro() {

            return 5 * ladoPentagono;
        }

    @Override
    public double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }
}




