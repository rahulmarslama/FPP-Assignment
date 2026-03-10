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


        newNode.next = null;
        newNode.value = item;

        Node tempNode = header;
        while(tempNode.next!=null)
        {
            tempNode = tempNode.next;
        }

        if(header.next==null)
        {
            header.next = newNode;
            newNode.previous =  header;
        }
        else
        {
            tempNode.next = newNode;
            newNode.previous = tempNode;
        }

        /*if(header.value == null)
        {
            header.value = item;
            header = newNode;
        }*/

    }
    // 2. Remove by passing object
    public boolean remove(String item)
    {
        boolean found =false;
        Node tempNode = header;
        while(tempNode != null)
        {
            if(item.equals(tempNode.value))
            {
                found = true;
                break;

            }
            tempNode = tempNode.next;
        }
        if(found)
        {
            Node prevNode = tempNode.previous;
            Node nextNode = tempNode.next;

            if(nextNode == null)
            {
                prevNode.next = null;
            }
            else
            {
                prevNode.next = nextNode;
                nextNode.previous = prevNode;
            }
        }

        return found;
    }

    // 3. Remove the First Node
    public boolean removeFirst()
    {
        Node tempNode = header;

        if(header.next != null)
        {
            header.next = header.next.next;
            header.previous = null;
            return true;
        }
        else
        {
            return false;
        }
    }


    // 4. Prints the list from last to first
    public void printReverse()
    {
        Node tempNode = header;
        while(tempNode.next!=null)
        {
            tempNode =tempNode.next;
        }

        while(tempNode.previous!=header)
        {
            System.out.println(tempNode.value);
            tempNode =tempNode.previous;
        }
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
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

