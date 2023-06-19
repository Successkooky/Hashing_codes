import java.util.*;
public class Hashing7 {


    //Union and intersection of two linked lists
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public int size=0;

    
        public void printll(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("Null");
        }
        public void push(int new_data){
            Node new_node= new Node(new_data);
            new_node.next=head;
            head=new_node;
        }
        
        public void append(int new_data){
            if(this.head==null){
                Node n=new Node(new_data);
                this.head=n;
                return;
            }
        }
    }

    

