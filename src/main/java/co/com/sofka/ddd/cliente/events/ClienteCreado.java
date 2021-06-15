package co.com.sofka.ddd.cliente.events;

import co.com.sofka.ddd.cliente.values.Nombre;
import co.com.sofka.ddd.cliente.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteCreado extends DomainEvent {

    private final Nombre nombre;
    private final Telefono telefono;

    public ClienteCreado(Nombre nombre, Telefono telefono) {
        super("sofka.cliente.clientecreado");
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
