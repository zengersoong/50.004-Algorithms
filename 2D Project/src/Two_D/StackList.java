package Two_D;

import java.util.Scanner;

/*  Class Node  */
class Node{
    protected int data;
    protected Node link;

    /*  Constructor  */
    public Node()    {
        link = null;
        data = 0;
    }
    /*  Constructor  */
    public Node(int d,Node n)    {
        data = d;
        link = n;
    }
    /*  Function to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    }
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }
    /*  Function to get link to next node  */
    public Node getLink()
    {
        return link;
    }
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
}

/* Class Stack */
class Stack
{
    protected Node tStack;
    public int size ;

    /*  Constructor  */
    public Stack()    {
        tStack = null;
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return tStack == null;
    }
    /*  Function to get size of list  */
    public int top()
    {
        return tStack.getData();
    }
    /*  Function to push  */
    public void push(int val)
    {
        Node nptr = new Node(val, null);
        size++ ;
        if(tStack == null)
        {
            tStack = nptr;
        }
        else
        {
            nptr.setLink(tStack);
            tStack = nptr;
        }
    }


    /*  Function to pop  */
    public void pop()
    {
        tStack = tStack.getLink();
        size--;
        return ;
    }
    
    /*  Function to display elements  */
    public void display()    {
        System.out.print("\nStack = ");
        if (size == 0)        {
            System.out.print("empty\n");
            return;
        }
        if (tStack.getLink() == null)        {
            System.out.println(tStack.getData() );
            return;
        }
        Node ptr = tStack;
        System.out.print(tStack.getData()+ "->");
        ptr = tStack.getLink();
        while (ptr.getLink() != null)       {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}

/*  Class SinglyLinkedList  */
public class StackList{
    public static void main(String[] args)    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of class linkedList */
        Stack list = new Stack();
        System.out.println("Singly Linked List Test\n");
        char ch;
        /*  Perform list operations  */
        do        {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. Push");
            System.out.println("2. Top");
            System.out.println("3. Pop");
            System.out.println("4. Check Empty");
            System.out.println("5. Display Stack");
            int choice = scan.nextInt();
            switch (choice)            {
                case 1 :
                    System.out.println("Enter integer element to push");
                    list.push( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Top = " + list.top()+ "\n");
                    break;
                case 3 :
                    System.out.println("Item popped = " + list.top());
                    list.pop();
                    break;
                case 4 :
                    System.out.println("Empty status = "+ list.isEmpty());
                    break;
                case 5 :
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display List  */
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}