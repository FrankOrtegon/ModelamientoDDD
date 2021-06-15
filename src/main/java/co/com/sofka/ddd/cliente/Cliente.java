package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.events.ClienteCreado;
import co.com.sofka.ddd.cliente.values.ClienteID;
import co.com.sofka.ddd.cliente.values.Nombre;
import co.com.sofka.ddd.cliente.values.Telefono;
import co.com.sofka.ddd.cliente.values.Turno;
import co.com.sofka.ddd.tiposervicio.values.TipoServicioID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Cliente extends AggregateEvent<ClienteID> {
    protected Nombre nombre;
    protected Turno turno;
    protected Telefono telefono;
    protected Set<Membresia> membresias;
    protected TipoServicioID tipoServicioID;
    public Cliente(ClienteID entityId, Nombre nombre, Turno turno, Telefono telefono)
    {
        super(entityId);
        appendChange(new ClienteCreado(nombre)).apply();
    }
}
