package co.com.sofka.ddd.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    public final String value;

    public Nombre(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }

        if(this.value.length() <= 2) {
            throw new IllegalArgumentException("El nombre no puede tener menos de 2 caracteres");
        }
    }

    public String value() {
        return value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turno turno = (Turno) o;
        return Objects.equals(value, turno.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
