public class EmployeeNode {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeNode(Employee employee) {
        this.employee = employee; // It is so, because we currently do not know, if this the last node on the list or not.
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    private EmployeeNode next;

     public String toString(){
         return employee.toString();
     }

}
