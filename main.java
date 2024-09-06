class Main
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        StackUsingNode obj = new StackUsingNode();
       obj.push(6);
       obj.push(1);
       obj.push(7);
       obj.push(8);
       obj.pop();
       System.out.println(obj.peek()); //7 expected

        //Test Case 2
        //System.out.println(obj.peek());  /// expection if comment ou all above but after modification return -1

        //test case 3

        obj.pop(); // pop from an empty stack comment out all above will not return anything after modification

        obj.push(1);
        System.out.println(obj.peek()); //expected 1 after the modification
    }
}