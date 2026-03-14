package Assignment10.Problem3;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        try
        {

        // Basic operations (these will break when you add checks—students will add try/catch later)
        System.out.println("Push 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);


        // Uncomment later when exceptions are implemented
//         stack.push(40);            // should cause overflow
//         stack.push(null);          // should cause null not allowed
         stack.pop();               // should cause underflow
         stack.pop();               // should cause underflow
         stack.pop();               // should cause underflow
         stack.pop();               // should cause underflow
        // stack.peek();              // should cause underflow
        System.out.println("Stack: " + stack);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            throw ex;
        }

    }
}
