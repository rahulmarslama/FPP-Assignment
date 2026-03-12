package Assignment7.Problem3;

import java.util.Stack;

public class BrowserHistory
{
    //stack1 and stack2 will be used to store the browser activity.
    private Stack<String> stack1;
    private Stack<String> stack2;

    public BrowserHistory(String url)
    {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        stack1.push(url);
    }

    public void visit(String url)
    {
        System.out.println("Visited: "+ url);
        stack1.push(url);
    }

    public void back()
    {
        if(stack1.isEmpty())
        {
            System.out.println("No history to go back to.");
            return;
        }

        String poppedItem = stack1.peek();
        stack2.push(poppedItem);
        stack1.pop();
        System.out.println("Back to: "+ poppedItem);
    }

    public void forward()
    {
        if(stack2.isEmpty())
        {
            System.out.println("No forward history");
            return;
        }
        String poppedItem = stack2.peek();
        stack1.push(poppedItem);
        stack2.pop();
        System.out.println("Back to: "+ poppedItem);
    }
}
