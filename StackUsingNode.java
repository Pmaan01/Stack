public class StackUsingNode {
    //push
    //pop
    //peek


    Node head;
    int size;
    StackUsingNode()

    {
        head = null;
        size = 0;
    }

    void push (int anElement)
    {
        Node tmp = new Node(); // if empty stack create node
        tmp.data = anElement; // node.data is whatever adding
        //todo
        if(head != null)
        {
        //2
         // now head is this new node and next is already null
         tmp.next = head;
        }

    head = tmp;
    }

    void pop()
    {
        //todo
        if(head != null)
       head = head.next;
         
    }

    int peek()
    {
        //Todo
        if(head != null)
        {
        return head.data;
        }
        else
        {
            return -1;
        }
    }
}
