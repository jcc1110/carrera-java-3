package com.controllers;
import com.models.Empleado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "eb")
@ApplicationScoped
public class EmpleadoBean implements Serializable {
    // Atributos
    public static final long serialVersionUID = 1L;
    private List<Empleado> lstEmpleados;
    
    // Métodos
    public EmpleadoBean() {
        this.lstEmpleados = new ArrayList<>();
        this.lstEmpleados.add(new Empleado("John", "Lopez", 200.89));
        this.lstEmpleados.add(new Empleado("Robert", "Montoya", 300.00));
        this.lstEmpleados.add(new Empleado("Anna", "Zapata", 250.00));
        this.lstEmpleados.add(new Empleado("Luisa", "Van", 250.00));
        this.lstEmpleados.add(new Empleado("Peter", "Parker", 150.00));
    }

    public List<Empleado> getLstEmpleados() {
        return lstEmpleados;
    }

    public void setLstEmpleados(List<Empleado> lstEmpleados) {
        this.lstEmpleados = lstEmpleados;
    }
}
