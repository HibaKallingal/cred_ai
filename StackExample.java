import java.util.Stack;
public class StackExample{
    public static void main(String[] args)
    {
        Stack<String> colors = new Stack<String>();
        colors.push("Red");
        colors.push("Green");
        colors.push("Yellow");
        colors.pop();//Remove element at the top
        System.out.println(colors.peek());//print top element of the stack
        System.out.println(colors);
    }
}