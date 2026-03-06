package org.example;

import java.time.LocalDateTime;

public class TiempoAn {
    private LocalDateTime fecha;

    public TiempoAn() {
        this.fecha = LocalDateTime.now();
    }

    // Standard Getter and Setter
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}