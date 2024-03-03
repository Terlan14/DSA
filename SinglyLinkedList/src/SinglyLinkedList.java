import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SinglyLinkedList {
    //creating linkedlist
    private static ListNode head;
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
    public boolean isPalindrome(){
        if(head==null ||head.next==null)
            return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode reversedNode=reverse(slow);
        while (reversedNode!=null){
            if(head.value!=reversedNode.value){
                return false;
            }
            head=head.next;
            reversedNode=reversedNode.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;

    }

    //this method implements printing all of listnode elements
    public void display(ListNode head)
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
    //this method implements to add given value at given index
    public void insertValueAtIndex(int index,int value){
        ListNode newNode=new ListNode(value);
        if(index==1){
            newNode.next=head;
            head=newNode;
        }
        else {
            int count = 1;
            ListNode current = head;
            while (count < index) {
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    //Remove element with given value (Leetcode 203 problem)
    public ListNode removeElements(int value){
        if(head==null){
            return head;
        }

        ListNode tempNode=new ListNode(0);
        tempNode.next=head;
        ListNode prev=tempNode;
        ListNode curr=head;
        while(curr!=null){
            if(head.value==value){
                head=head.next;
            }
            if(curr.value==value){
                prev.next=curr.next;
            }
            else{
                prev=curr;
            }
            curr=curr.next;
        }

        return tempNode.next  ;
    }

    //counts element of the linkedlist
    public int countElements(){
        ListNode current=head;
        if(head==null)
            return 0;
        else {
            int count = 0;
            while (current.next != null) {
                current = current.next;
                count++;
            }
            count++;
            return count;
        }
    }


    public static void main(String[] args)
    {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.head=new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(30);
        ListNode fourth=new ListNode(40);
        ListNode fifth=new ListNode(30);
        ListNode sixth=new ListNode(20);
        ListNode seventh=new ListNode(50);
        singlyLinkedList.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        singlyLinkedList.display(head);
        //System.out.println(singlyLinkedList.isPalindrome());
        ListNode reversed=singlyLinkedList.reverse(head);
        singlyLinkedList.display(reversed);

    }
}