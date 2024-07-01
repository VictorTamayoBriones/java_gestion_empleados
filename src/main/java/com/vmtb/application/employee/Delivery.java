package com.vmtb.application.employee;

/**
 * Clase que representa a un empleado de tipo Delivery
 */

public class Delivery extends Employee implements IEmployeeEnable {
    String zona;

    /**
     * Constructor de la clase
     * @param name
     * @param age
     * @param salary
     * @param zona
     */
    public Delivery(String name, int age, int salary, String zona){
        super(name, age, salary);
        this.zona = zona;
    }

    /**
     * Calcula el salario actualizado con el aumento
     *
     * @param salary salario actual del empleado al que se le aplicara el aumento
     * @return El salario actualizado con el aumento
     */
    @Override
    public int plus(int salary) {
        if (getAge()<25 && zona.equals("zona 3")){
            setSalary(IEmployeeEnable.super.plus(salary));
        }

        return getSalary();
    }

    /**
     * Método que devuelve la información del empleado
     */
    @Override
    public String toString() {
        return "com.vmtb.application.employee.Delivery [zona=" + zona + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getSalary()="
                + getSalary() + "]";
    }
}
