package co.com.sofka.ddd.cliente.commands;

import co.com.sofka.ddd.cliente.values.ClienteID;
import co.com.sofka.ddd.tiposervicio.values.TipoServicioID;
import co.com.sofka.domain.generic.Command;

public class SeleccionarTipoServicio implements Command {
    private final ClienteID clienteID;
    private final TipoServicioID tipoServicioID;

    public SeleccionarTipoServicio(ClienteID clienteID, TipoServicioID tipoServicioID) {
        this.clienteID = clienteID;
        this.tipoServicioID = tipoServicioID;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public TipoServicioID getTipoServicioID() {
        return tipoServicioID;
    }
}
