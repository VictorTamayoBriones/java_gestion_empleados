package com.vmtb.application;

import com.vmtb.application.employee.Commercial;
import com.vmtb.application.employee.Delivery;

public class Main {

    public static void main(String[] args){

        System.out.println("com.vmtb.application.employee.Delivery and com.vmtb.application.employee.Commercial with plus");

        Delivery delivery = new Delivery("Juan", 24, 1000, "zona 3");
        delivery.plus(delivery.getSalary());
        System.out.println(delivery);

        Commercial commercial = new Commercial("Pedro", 31, 1000, 300);
        commercial.plus(commercial.getSalary());
        System.out.println(commercial);

        System.out.println("\n--------------------------\n");

        System.out.println("com.vmtb.application.employee.Delivery and com.vmtb.application.employee.Commercial without plus");

        Delivery delivery2 = new Delivery("Pedro", 26, 1000, "zona 2");
        delivery2.plus(delivery2.getSalary());
        System.out.println(delivery2);

        Commercial commercial2 = new Commercial("Juan", 29, 1000, 100);
        commercial2.plus(commercial2.getSalary());
        System.out.println(commercial2);
    }

}
