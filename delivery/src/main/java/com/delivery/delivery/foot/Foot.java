package com.delivery.delivery.foot;

public class Foot {
    private String name;
    private String descripcion;
    private float price;

    public Foot() {
    }

    public Foot(String name, String descripcion, float price) {
        this.name = name;
        this.descripcion = descripcion;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
