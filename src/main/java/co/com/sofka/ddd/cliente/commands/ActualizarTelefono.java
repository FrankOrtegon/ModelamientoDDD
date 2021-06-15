package co.com.sofka.ddd.cliente.commands;

import co.com.sofka.ddd.cliente.values.ClienteID;
import co.com.sofka.ddd.cliente.values.Telefono;
import co.com.sofka.domain.generic.Command;

public class ActualizarTelefono implements Command {
    private final ClienteID clienteID;
    private final Telefono telefono;

    public ActualizarTelefono(ClienteID clienteID, Telefono telefono) {
        this.clienteID = clienteID;
        this.telefono = telefono;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
