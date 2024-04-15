package com.ulisesg.polimorfismo_1.models;

public class Escuela {
    BaseDeDatos1 baseDeDatos1 = new BaseDeDatos1();
    BaseDeDatos2 baseDeDatos2 = new BaseDeDatos2();
    BaseDeDatos3 baseDeDatos3 = new BaseDeDatos3();

    public BaseDeDatos1 obtenerinformacion1() {
        return baseDeDatos1;
    }

    public BaseDeDatos2 obtenerinformacion2() {
        return baseDeDatos2;
    }

    public BaseDeDatos3 obtenerinformacion3() {
        return baseDeDatos3;
    }
}

