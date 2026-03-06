package org.example;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TiempoService {
    private final Locale spanishLocale = Locale.of("es", "AR");

    public void imprimirFechaCorta(TiempoAn tiempo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(tiempo.getFecha().format(formatter));
    }

    public void imprimirFechaLarga(TiempoAn tiempo) {
        var fecha = tiempo.getFecha();

        String dayNameRaw = fecha.format(DateTimeFormatter.ofPattern("EEEE", spanishLocale));
        String dayName = dayNameRaw.substring(0, 1).toUpperCase() + dayNameRaw.substring(1);
        String monthName = fecha.format(DateTimeFormatter.ofPattern("MMMM", spanishLocale));

        System.out.println(dayName + ", " + fecha.getDayOfMonth() + " de " + monthName + " de " + fecha.getYear() + ".");
    }
}