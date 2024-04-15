package com.ulisesg.polimorfismo_1.models;

public class Estudiantes {

    String name;

    String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

