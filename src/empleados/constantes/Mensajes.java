package empleados.constantes;

public enum Mensajes {

    TITULO_MENU("Menú de opciones\n"),
    OPCION1("\n1. Calcular salario final."),
    OPCION2("\n2. Salir."),
    SOLICITAR_HORAS("Ingrese las horas trabajadas"),
    SOLICITAR_VALOR_HORA("Ingrese el valor de la hora de trabajo"),
    SALARIO_BASE("El salario base es: "),
    DESCUENTO_SALUD("\nEl descuento de salud es: "),
    DESCUENTO_PENSION("\nEl descuento de pensión es: "),
    SALARIO_FINAL_1("\nEl salario final 1 es: "),
    SALARIO_FINAL_2("\nEl salario final 2 es: "),
    SALARIO_A_PAGAR("\nEl salario a pagar es: "),
    PREGUNTA_REGRESAR("Desea regresar?"),
    DESPEDIDA("Gracias por usar éste programa"),
    CONFIRMACION("Mensaje de confirmación"),
    INVALIDA("Opción no existe.");


    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}