package main;

import empleados.Descuentos;

import static empleados.constantes.Mensajes.*;
import static empleados.constantes.Valores.IMPUESTO_SALUD;
import static empleados.constantes.Valores.IMPUESTO_PENSION;
import static empleados.constantes.Valores.OTRO_DESCUENTO;
import static empleados.constantes.Valores.AUMENTO;
import static empleados.constantes.Valores.UN_MILLON;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Descuentos descuentos = new Descuentos();
        boolean accion = true;
        boolean salir = false;

        while (accion) {

            String opcion = JOptionPane.showInputDialog(null,
                    TITULO_MENU.getMensaje() +
                            OPCION1.getMensaje() +
                            OPCION2.getMensaje());

            switch (opcion) {

                case "1":

                    String horasTrabajads = JOptionPane.showInputDialog(null, SOLICITAR_HORAS.getMensaje());
                    double horas = Double.parseDouble(horasTrabajads);

                    String valorHora = JOptionPane.showInputDialog(null, SOLICITAR_VALOR_HORA.getMensaje());
                    double valor = Double.parseDouble(valorHora);

                    descuentos.setHorasTrabajadas(horas);
                    descuentos.setValorHora(valor);

                    double salud = descuentos.impuesto(IMPUESTO_SALUD);
                    double pension = descuentos.impuesto(IMPUESTO_PENSION);

                    JOptionPane.showMessageDialog(null,
                            SALARIO_BASE.getMensaje() + descuentos.calcularSalarioBase() +
                                    DESCUENTO_SALUD.getMensaje() + salud +
                                    DESCUENTO_PENSION.getMensaje() + pension +
                                    SALARIO_FINAL_1.getMensaje() + descuentos.salarioFinal(salud + pension) +
                                    SALARIO_FINAL_2.getMensaje() + descuentos.salarioFinal(salud, pension) +
                                    SALARIO_A_PAGAR.getMensaje() +
                                    ((descuentos.salarioFinal(salud, pension) > UN_MILLON) ?
                                            descuentos.salarioDefinitivo(salud, pension, OTRO_DESCUENTO) :
                                            descuentos.salarioDefinitivo(salud + pension, AUMENTO)));

                    break;

                case "2":
                    JOptionPane.showMessageDialog(null,
                            DESPEDIDA.getMensaje());
                    salir = true;
                    accion = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, INVALIDA.getMensaje());
                    break;
            }

            if (!salir){
                int respuesta = JOptionPane.showConfirmDialog(null,
                        PREGUNTA_REGRESAR.getMensaje(),
                        CONFIRMACION.getMensaje(),
                        JOptionPane.YES_NO_OPTION);

                if(respuesta == JOptionPane.YES_OPTION){
                    accion = true;
                }else if(respuesta == JOptionPane.NO_OPTION){
                    accion = false;
                }else {
                    accion = false;
                }
            }
        }
    }
}
