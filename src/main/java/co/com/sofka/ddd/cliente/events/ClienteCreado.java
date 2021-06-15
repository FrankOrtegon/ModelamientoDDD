package co.com.sofka.ddd.cliente.events;

import co.com.sofka.ddd.cliente.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteCreado extends DomainEvent {

    private final Nombre nombre;

    public ClienteCreado(Nombre nombre) {
        super("sofka.cliente.clientecreado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
