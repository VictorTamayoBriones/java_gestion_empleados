package com.vmtb.application.employee;

/**
 * Esta interfaz define un comportamiento adicional para habilitar el aumento de salario.
 */

public interface IEmployeeEnable {

    /**
     * Calcula el salario actualizado con el aumento
     *
     * @param salary salario actual del empleado al que se le aplicara el aumento
     * @return El salario actualizado con el aumento
     */

    default int plus(int salary){
        return salary + Employee.plus;
    }
}
