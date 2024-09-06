public class StackUsingArray {

    int[] arr = new int[10]; //1- is a magic number not fixed array ( but dont use magic number)
    int top;

    StackUsingArray()
    {
        arr = new int[10];
        top = -1; // last element
    }

    void push (int anElement)
    {
        //todo
        //1- method that has same name as the class
        //2-it does not return anything
        //3-always public
        arr[++top] = anElement;
    }

    void pop()
    {
        if(top == -1)
            return;
        //todo
        top--;
    }

    int peek()
    {
        //Todo
        if(top == -1)
        {
            return -1; //return -1 if stack empty 
        }
        return arr[top];
    }
}
