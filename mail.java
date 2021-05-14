public class mail {
    //Add node from front element
    //Remove from front element
    public static void main(String args[])
    {
        EmployeeLinkedList list= new EmployeeLinkedList();
        list.addToFront(new Employee("101","Priya","Agrawal"));
        list.addToFront(new Employee("201","Akar","Agrawal"));
        list.addToFront(new Employee("301","Ashu","Agrawal"));
        list.addToFront(new Employee("401","Rajesh","Agrawal"));
        list.printList();
    }
}
