package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.events.*;
import co.com.sofka.ddd.cliente.values.MembresiaID;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;
import java.util.Set;

public class ClienteChange extends EventChange {
    public ClienteChange(Cliente cliente) {
        apply((ClienteCreado event) -> {
           cliente.nombre = event.getNombre();
           cliente.membresias = new HashSet<>();
           cliente.telefono = event.getTelefono();
        });

        apply((MembresiaAsociada event) -> {
            cliente.membresias = (Set<Membresia>) event.membresiaID();
        });

        apply((NombreCambiado event) -> {
            cliente.nombre = event.getNombre();
        });

        apply((TelefonoActualizado event) -> {
            cliente.telefono = event.getTelefono();
        });

        apply((TipoServicioSeleccionado event) -> {
            cliente.tipoServicioID = event.getTipoServicioID();
        });

        apply((TurnoAsignado event) -> {
            cliente.turno = event.getTurno();
        });
        }


    }

