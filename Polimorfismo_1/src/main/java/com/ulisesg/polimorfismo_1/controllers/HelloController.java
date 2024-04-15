package com.ulisesg.polimorfismo_1.controllers;

import com.ulisesg.polimorfismo_1.models.Escuela;
import com.ulisesg.polimorfismo_1.models.Estudiantes;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    Escuela escuela = new Escuela();

    @FXML
    private ListView <String> ListaEstudiantes;

    @FXML
    private TextField email;

    @FXML
    private TextField nameAlumno;

    @FXML
    void btn_actualizar(MouseEvent event) {
        Estudiantes estudiante = new Estudiantes();
        estudiante.setName(nameAlumno.getText());
        estudiante.setEmail(email.getText());
        escuela.obtenerinformacion1().actualizar(estudiante, ListaEstudiantes.getSelectionModel().getSelectedIndex());
        escuela.obtenerinformacion2().actualizar(estudiante, ListaEstudiantes.getSelectionModel().getSelectedIndex());
        escuela.obtenerinformacion3().actualizar(estudiante, ListaEstudiantes.getSelectionModel().getSelectedIndex());
        actualizarLista();
    }

    @FXML
    void btn_agregar(MouseEvent event) {
        Estudiantes estudiante = new Estudiantes();
        estudiante.setName(nameAlumno.getText());
        estudiante.setEmail(email.getText());
        escuela.obtenerinformacion1().guardar(estudiante);
        escuela.obtenerinformacion2().guardar(estudiante);
        escuela.obtenerinformacion3().guardar(estudiante);
        actualizarLista();
    }

    @FXML
    void btn_salir(MouseEvent event) {

    }

    public void actualizarLista(){
        ListaEstudiantes.getItems().clear();
        for (Estudiantes i: escuela.obtenerinformacion1().getLista()){
            ListaEstudiantes.getItems().add(i.toString());
        }
    }
}
