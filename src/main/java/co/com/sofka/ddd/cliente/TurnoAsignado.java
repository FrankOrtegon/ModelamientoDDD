package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.values.Turno;
import co.com.sofka.domain.generic.DomainEvent;

public class TurnoAsignado extends DomainEvent {
    private final Turno turno;

    public TurnoAsignado(Turno turno) {
        super("sofka.cliente.turnoasignado");
        this.turno = turno;
    }

    public Turno getTurno() {
        return turno;
    }
}
