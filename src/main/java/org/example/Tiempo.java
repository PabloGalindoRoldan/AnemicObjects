package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Tiempo {
    Locale spanishLocale = new Locale("es", "AR");
    private LocalDateTime fecha;

    public Tiempo() {
        this.fecha = LocalDateTime.now();
    }

    public void getFechaCorta() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(fecha.format(formatter));
    }

    public void getFechaLarga() {
        String dayNameUncap = fecha.format(DateTimeFormatter.ofPattern("EEEE", spanishLocale));
        String dayName = dayNameUncap.substring(0, 1).toUpperCase() + dayNameUncap.substring(1);
        String monthName = fecha.format(DateTimeFormatter.ofPattern("MMMM", spanishLocale));
        int day = fecha.getDayOfMonth();
        int year = fecha.getYear();

        System.out.println(dayName + ", " + day + " de " + monthName + " de " + year + ".");
    }
}