package Assignment6.prob4;

public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        header = new Node();
    }
    //1. adds to the end of the list
    public void addLast(String item)
    {
        Node newNode = new Node();
        newNode.value = item;
        newNode.next = null;

        if(header.next== null)
        {
            header.next = newNode;
            newNode.previous = header;
        }
        else
        {
            Node current = header.next;
            while(current.next!=null)
            {
                current = current.next;
            }

            current.next = newNode;
            newNode.previous = current;
        }

    }
    // 2. Remove by passing object
    public boolean remove(String item)
    {
        if(header.next == null) return false;

        Node current = header.next;
        while(current!=null)
        {
            if(current.value.equals(item))
            {
                if(current.next == null)
                {
                    current.previous.next = null;
                }
                else
                {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;

                }
                current = null;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3. Remove the First Node
    public boolean removeFirst()
    {
        if(header.next == null) return false;

        header.next = header.next.next;
        header.next.previous = header;
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse()
    {
        if(header.next == null) return;

        Node current = header.next;
        while(current.next!=null)
        {
            current = current.next;
        }
        while(current != header)
        {
            System.out.println(current.value);
            current = current.previous;
        }

    }

    @Override
    public String toString() {
        if(header.next == null)
        {
            return "[Empty Linked List]";
        }
        StringBuilder str = new StringBuilder("[Header<==>");

        Node current = header.next;

        while(current!= null)
        {
            str.append(current.value);
            str.append("<==>");
            current = current.next;
        }

        str.append("Null]");
        return str.toString();

    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Rhitik");
        list.addLast("Karina");
        list.addLast("Shreeya");
        list.addLast("Mahima");
        list.addLast("Rahul");
        System.out.println(list);

        System.out.println(list.remove("Rahul"));
        System.out.println(list);

        System.out.println(list.removeFirst());
        System.out.println(list);

        list.printReverse();

    }
}

