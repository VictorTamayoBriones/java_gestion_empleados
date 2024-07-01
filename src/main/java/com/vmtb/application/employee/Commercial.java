package com.vmtb.application.employee;

/**
 * Clase que representa a un empleado de tipo Commercial
 */

public class Commercial extends Employee implements IEmployeeEnable {
    double commission;

    /**
     * Constructor de la clase
     * @param name
     * @param age
     * @param salary
     * @param commission
     */
    public Commercial(String name, int age, int salary, double commission){
        super(name, age, salary);
        this.commission = commission;
    }

    /**
     * Calcula el salario actualizado con el aumento
     *
     * @param salary salario actual del empleado al que se le aplicara el aumento
     * @return El salario actualizado con el aumento
     */
    @Override
    public int plus(int salary) {

        if(commission > 200 && getAge() > 30){
            setSalary(IEmployeeEnable.super.plus(salary));
        }

        return getSalary();
    }

    /**
     * Método que devuelve la información del empleado
     */
    @Override
    public String toString() {
        return "com.vmtb.application.employee.Commercial [commission=" + commission + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getSalary()="
                + getSalary() + "]";
    }

}
