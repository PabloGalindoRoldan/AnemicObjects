package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Tiempo tiempo = new Tiempo();
        TiempoAn tiempoAn = new TiempoAn();
        TiempoService service = new TiempoService();

        System.out.println("El tiempo en formato corto del objeto Tiempo es:");
        tiempo.getFechaCorta();
        System.out.println("El tiempo en formato largo del objeto Tiempo es:");
        tiempo.getFechaLarga();
        System.out.println("El tiempo en formato corto del objeto anemico es:");
        service.imprimirFechaCorta(tiempoAn);
        System.out.println("El tiempo en formato largo del objeto anemico es:");
        service.imprimirFechaLarga(tiempoAn);
    }
}
