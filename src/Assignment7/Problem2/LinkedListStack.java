package Assignment7.Problem2;


public class LinkedListStack
{
    Node header;
    LinkedListStack(){
        header = new Node(null);
    }

    class Node
    {
        private Integer data;
        private Node next;

        public Node(Integer data)
        {
            this.data = data;
        }
    }


    public void push(Integer x)
    {
        Node newNode = new Node(x);

        if(!isEmpty())
        {
            newNode.next = header.next;
        }
        header.next = newNode;

    }
    public Integer peek() {
        if(isEmpty()) return null;
        return header.next.data;
    }
    public Integer pop()
    {
        if(isEmpty()) return null;
        Integer data = peek();

        header.next = header.next.next;

        return data;
    }
    public boolean isEmpty()
    {
        return header.next==null ;
    }

    public int size()
    {
        if(isEmpty()) return 0;
        int count = 0;

        Node current = header.next;
        while(current!=null)
        {
            count++;
            current = current.next;
        }
        return count;
    }
    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder("[Header=>");

        Node current = header.next;
        while(current!=null)
        {
            str.append(current.data+"=>");
            current = current.next;
        }
        str.append("Null]");
        return str.toString();
    }
    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println("Size: "+ st.size());
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);

    }
}
