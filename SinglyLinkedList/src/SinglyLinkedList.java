import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SinglyLinkedList {
    //creating linkedlist
    private ListNode head;
    private static class ListNode {
        private int value;
        // we declare next object to link nodes
        private ListNode next;
        public ListNode (int value) {
            this.value=value;
            this.next=next;
        }
    }
    //this implementation deletes last element of linkedlist
    public void deleteLast() {
        ListNode current=head;
        if (head==null)
            System.out.println("There is no element to delete");
        else {
            while(current.next.next!=null)
            {
                current=current.next;
            }
            current.next=null;
        }
    }
    //this implementation deletes first element of linkedlist
    public void deleteFirst(){
        if(head==null)
            System.out.println("There is no element to delete");
        else{
            ListNode temp=head.next;
            head.next=null;
            head=temp;
        }
    }
    //this implementation deletes element of the linkedlist at specific index
    public void deleteAtIndex(int index){
        if(index==1)
            head=head.next;
        else{
            int count=1;
            ListNode previous=head;
            while(count<index-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=current.next;
            //current.next=null;
        }
    }

    //this method implements printing all of listnode elements
    public void display()
    {
        ListNode current=head;
        while (current!=null)
        {
            System.out.print(current.value+" ");
            current=current.next;
        }
        System.out.println();
    }
    //this method implements adding given value to the last element of our listnode
    public void insertValueToLastElement(int value)
    {
        ListNode newNode=new ListNode(value);
        ListNode current=head;
        if (head==null)
            head=newNode;
        else
        {
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=newNode;
        }
    }
    //this method implements adding given value before the first of our listnode
    public void insertValueToFirstElement(int value)
    {
        ListNode newNode=new ListNode(value);
        if(head==null)
            head=newNode;
        else
        {
            newNode.next = head;
            head=newNode;
        }
    }




    public static void main(String[] args)
    {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.head=new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(30);
        ListNode fourth=new ListNode(40);
        singlyLinkedList.head.next=second;
        second.next=third;
        third.next=fourth;
        singlyLinkedList.deleteAtIndex(2);
        singlyLinkedList.display();

    }
}