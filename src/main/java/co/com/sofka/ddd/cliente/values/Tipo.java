package co.com.sofka.ddd.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<String> {
    public final String value;

    public Tipo(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("El tipo no puede estar vacio");
        }

    }

    public String value() {
        return value;
    }
}
