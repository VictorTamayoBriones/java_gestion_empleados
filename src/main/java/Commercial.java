public class Commercial extends Employe implements  IEmployeEnable{
    double commission;

    public Commercial(String name, int age, int salary, double commission){
        super(name, age, salary);
        this.commission = commission;
    }

    @Override
    public int plus(int salary) {

        if(commission > 200 && getAge() > 30){
            setSalary(IEmployeEnable.super.plus(salary));
        }

        return getSalary();
    }


    @Override
    public String toString() {
        return "Commercial [commission=" + commission + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getSalary()="
                + getSalary() + "]";
    }

}
