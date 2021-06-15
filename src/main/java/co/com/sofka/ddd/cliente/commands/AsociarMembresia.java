package co.com.sofka.ddd.cliente.commands;

import co.com.sofka.ddd.cliente.values.ClienteID;
import co.com.sofka.ddd.cliente.values.MembresiaID;
import co.com.sofka.ddd.cliente.values.Precio;
import co.com.sofka.ddd.cliente.values.Tipo;
import co.com.sofka.domain.generic.Command;

public class AsociarMembresia implements Command {
    private final ClienteID clienteID;
    private final MembresiaID membresiaID;
    private final Tipo tipo;
    private final Precio precio;

    public AsociarMembresia(ClienteID clienteID, MembresiaID membresiaID, Tipo tipo, Precio precio) {
        this.clienteID = clienteID;
        this.membresiaID = membresiaID;
        this.tipo = tipo;
        this.precio = precio;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public MembresiaID getMembresiaID() {
        return membresiaID;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Precio getPrecio() {
        return precio;
    }
}
