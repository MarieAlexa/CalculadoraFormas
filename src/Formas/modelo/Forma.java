package Formas.modelo;

public abstract class Forma implements Operacion {

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public double calcularPotencia(double basePotencia, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return 1 / (basePotencia * calcularPotencia(basePotencia, -exponente - 1));
        } else {
            return basePotencia * calcularPotencia(basePotencia, exponente - 1);
        }
    }
    }











