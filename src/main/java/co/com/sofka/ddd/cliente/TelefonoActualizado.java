package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoActualizado extends DomainEvent {
    private final Telefono telefono;

    public TelefonoActualizado(Telefono telefono) {
        super("sofka.cliente.telefonoactualizado");
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
