package empleados;

public class Descuentos extends Salario {

    public double calcularSalarioBase(){
        return (getHorasTrabajadas() * getValorHora());
    }

    public double impuesto(double porcentaje){
        return (this.calcularSalarioBase() * (porcentaje/100));
    }

    public double salarioFinal(double descuentos){
        return (calcularSalarioBase() - descuentos);
    }

    public double salarioFinal(double salud, double pension){
        return (calcularSalarioBase() - salud - pension);
    }

    public double salarioDefinitivo(double salud, double pension, double descuento){
        return (calcularSalarioBase() - salud - pension) - ((calcularSalarioBase() - salud - pension) * ( descuento / 100));
    }

    public double salarioDefinitivo(double descuento, double aumento){
        return (calcularSalarioBase() - descuento) + ((calcularSalarioBase() - descuento) * (aumento/100));
    }

}