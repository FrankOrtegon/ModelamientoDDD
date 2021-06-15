package co.com.sofka.ddd.cliente.commands;

import co.com.sofka.ddd.cliente.values.ClienteID;
import co.com.sofka.ddd.cliente.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class CrearCliente implements Command {
    private final ClienteID clienteID;
    private final Nombre nombre;

    public CrearCliente(ClienteID clienteID, Nombre nombre) {
        this.clienteID = clienteID;
        this.nombre = nombre;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
