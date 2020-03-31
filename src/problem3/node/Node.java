
package problem3.node;


import problem5.student.Student;

public class Node {


    private Student s;
    private Node next;


    public Node() {
        s = new Student();
        next = null;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
