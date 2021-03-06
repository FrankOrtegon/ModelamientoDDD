package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.values.MembresiaID;
import co.com.sofka.ddd.cliente.values.Precio;
import co.com.sofka.ddd.cliente.values.Tipo;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Membresia extends Entity<MembresiaID> {

    private Tipo tipo;
    private Precio precio;

    public Membresia(MembresiaID membresiaID, Tipo tipo, Precio precio) {
        super(membresiaID);
        this.tipo = tipo;
        this.precio = precio;
    }

    public void agregarPrecio(Precio precio) {
        this.precio = Objects.requireNonNull(precio);
    }

    public void seleccionarTipo(Tipo tipo) {
        this.tipo = Objects.requireNonNull(tipo);
    }

    public Tipo tipo() {
        return tipo;
    }

    public Precio precio() {
        return precio;
    }


    public void MembresiaAsociada(MembresiaID membresiaID) {
    }
}
