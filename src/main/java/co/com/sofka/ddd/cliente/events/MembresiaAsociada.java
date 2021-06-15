package co.com.sofka.ddd.cliente.events;

import co.com.sofka.ddd.cliente.values.MembresiaID;
import co.com.sofka.ddd.cliente.values.Precio;
import co.com.sofka.ddd.cliente.values.Tipo;
import co.com.sofka.domain.generic.DomainEvent;

public class MembresiaAsociada extends DomainEvent {
    private final MembresiaID membresiaID;
    private final Tipo tipo;
    private final Precio precio;

    public MembresiaAsociada(MembresiaID membresiaID, Tipo tipo, Precio precio) {
        super("sofka.cliente.membresiaasociada");
        this.membresiaID = membresiaID;
        this.precio = precio;
        this.tipo = tipo;

    }

    public MembresiaID membresiaID() {
        return membresiaID;
    }

    public Tipo tipo() {
        return tipo;
    }

    public Precio precio() {
        return precio;
    }
}
