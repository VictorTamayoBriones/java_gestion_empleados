public interface IEmployeEnable {

    default int plus(int salary){
        return salary + Employe.plus;
    }
}
