public class EmployeeLinkedList {

    private EmployeeNode head;

    public void addToFront(Employee employee)
    {
        //new node is created
        EmployeeNode newNode= new EmployeeNode(employee);
        //Now, connect new nde to the list
        newNode.setNext(head);
        //Now we need to pint new node with header, as it is now the first element of the list.
        head=newNode;
    }

    public void printList()
    {
        EmployeeNode current = head;
        System.out.print("HEAD ---->");
        while(current != null){
            System.out.print(current);
            System.out.print(" ---->");
            current= current.getNext();
        }
        System.out.print("null");
    }
}
