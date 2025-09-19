package com.edifilar.model;

public class Dominio {
    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // Construtor
    public Dominio(long id) {
        this.id = id;
    }
}
