package com.vmtb.application.employee;

/**
 * Clase que representa a un empleado
 * Proporciona métodos para gestionar la información del empleado.
 */

public class Employee {
    private String name;
    private int age;
    private int salary;

    public final static int plus = 300;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Constructor de la clase
     * @param name
     * @param age
     * @param salary
     */
    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
