package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.events.*;
import co.com.sofka.ddd.cliente.values.*;
import co.com.sofka.ddd.tiposervicio.values.TipoServicioID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
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
        appendChange(new ClienteCreado(nombre, telefono)).apply();
    }

    private Cliente(ClienteID entityId) {
            super(entityId);
            subscribe(new ClienteChange(this));
    }

    public static Cliente from(ClienteID clienteID, List<DomainEvent> events) {
        var cliente = new Cliente(clienteID);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    public void asociarMembresia(MembresiaID membresiaID, Tipo tipo, Precio precio) {
        Objects.requireNonNull(membresiaID);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(tipo);

        appendChange(new MembresiaAsociada(membresiaID,tipo,precio)).apply();
    }

    public void seleccionarTipoServicio(TipoServicioID tipoServicioID) {
        appendChange(new TipoServicioSeleccionado(tipoServicioID)).apply();
    }

    public void cambiarNombre(Nombre nombre) {
        appendChange(new NombreCambiado(nombre)).apply();
    }

    public void asignarTurno(Turno turno) {
        appendChange(new TurnoAsignado(turno)).apply();
    }

    public void actualizarTelefono(Telefono telefono) {
        appendChange(new TelefonoActualizado(telefono)).apply();
    }

    protected Optional<Membresia> getMembresiaPorId(MembresiaID membresiaID) {
        return membresias()
                .stream()
                .filter(membresia -> membresia.identity().equals(membresiaID))
                .findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Turno turno() {
        return turno;
    }

    public Telefono telefono() {
        return telefono;
    }

    public Set<Membresia> membresias() {
        return membresias;
    }

    public TipoServicioID tipoServicioID() {
        return tipoServicioID;
    }
}
