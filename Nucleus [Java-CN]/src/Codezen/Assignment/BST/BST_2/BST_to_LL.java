package Codezen.Assignment.BST.BST_2;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class BST_to_LL {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        ArrayList<Integer> arrayList=Bst_to_LL(root);
        LinkedListNode<Integer> head=new LinkedListNode<>(arrayList.get(0)),temp=head;
        int i=1;
        while (i<arrayList.size())
        {
            temp.next=new LinkedListNode<>(arrayList.get(i));
            temp=temp.next;
            i++;
        }
        temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }

    private static ArrayList<Integer> Bst_to_LL(Binary_Tree_Node<Integer> root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        if(root.left==null && root.right==null)
        {
            ArrayList<Integer> arrayList=new ArrayList<>();
            arrayList.add(root.data);
            return arrayList;
        }
        ArrayList<Integer> left_ans=Bst_to_LL(root.left);
        left_ans.add(root.data);
        ArrayList<Integer> right_ans=Bst_to_LL(root.right);
        int i=0;
        while (i<right_ans.size())
        {
            left_ans.add(right_ans.get(i));
            i++;
        }
        return left_ans;
    }
}
