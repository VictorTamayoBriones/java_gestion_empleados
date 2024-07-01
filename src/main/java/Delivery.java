public class Delivery extends Employe implements IEmployeEnable{
    String zona;

    public Delivery(String name, int age, int salary, String zona){
        super(name, age, salary);
        this.zona = zona;
    }

    @Override
    public int plus(int salary) {
        if (getAge()<25 && zona.equals("zona 3")){
            setSalary(IEmployeEnable.super.plus(salary));
        }

        return getSalary();
    }

    @Override
    public String toString() {
        return "Delivery [zona=" + zona + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getSalary()="
                + getSalary() + "]";
    }
}
