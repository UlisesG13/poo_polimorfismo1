package com.ulisesg.polimorfismo_1.models;

import java.util.ArrayList;

public class BaseDeDatos1 implements Interfaz {
    ArrayList <Estudiantes> lista = new ArrayList<Estudiantes>();
    @Override
    public void guardar(Estudiantes estudiantes) {
        lista.add(estudiantes);
    }

    @Override
    public void actualizar(Estudiantes actualizar, int indice) {
        lista.set(indice, actualizar);
    }

    public ArrayList<Estudiantes> getLista() {
        return lista;
    }
}
