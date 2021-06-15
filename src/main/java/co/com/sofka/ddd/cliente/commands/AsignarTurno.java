package co.com.sofka.ddd.cliente.commands;

import co.com.sofka.ddd.cliente.values.ClienteID;
import co.com.sofka.ddd.cliente.values.Turno;
import co.com.sofka.domain.generic.Command;

public class AsignarTurno implements Command {
    private final ClienteID clienteID;
    private  final Turno turno;

    public AsignarTurno(ClienteID clienteID, Turno turno) {
        this.clienteID = clienteID;
        this.turno = turno;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public Turno getTurno() {
        return turno;
    }
}
