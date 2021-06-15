package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.tiposervicio.values.TipoServicioID;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoServicioSeleccionado extends DomainEvent {
    private final TipoServicioID tipoServicioID;

    public TipoServicioSeleccionado(TipoServicioID tipoServicioID) {
        super("sofka.cliente.tiposervicioseleccionado");
        this.tipoServicioID = tipoServicioID;
    }

    public TipoServicioID getTipoServicioID() {
        return tipoServicioID;
    }
}
