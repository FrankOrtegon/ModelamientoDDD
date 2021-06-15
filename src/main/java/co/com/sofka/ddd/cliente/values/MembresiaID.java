package co.com.sofka.ddd.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class MembresiaID extends Identity {

    public MembresiaID() {
    }

    private MembresiaID(String id) {
        super(id);
    }

    public static MembresiaID of(String id) {
        return new MembresiaID(id);
    }
}
