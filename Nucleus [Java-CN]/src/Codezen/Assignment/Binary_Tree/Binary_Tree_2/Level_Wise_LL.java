package Codezen.Assignment.Binary_Tree.Binary_Tree_2;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node <T>
{
    T data;
    Node<T> next;

    Node(T data)
    {
        this.data=data;
    }
}

public class Level_Wise_LL {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        ArrayList<Node<Binary_Tree_Node<Integer>>> arrayList=level_wise_LL(root);
        int i=0;
        while (i<arrayList.size())
        {
            Node<Binary_Tree_Node<Integer>> head=arrayList.get(i);
            while (head!=null)
            {
                Binary_Tree_Node<Integer> node=head.data;
                System.out.print(node.data+" ");
                head=head.next;
            }
            System.out.println("");
            i++;
        }
    }

    public static ArrayList<Node<Binary_Tree_Node<Integer>>> level_wise_LL(Binary_Tree_Node<Integer> root)
    {
        ArrayList<Node<Binary_Tree_Node<Integer>>> arrayList=new ArrayList<>();
        if(root==null)
        {
            arrayList.add(new Node<>(null));
            return arrayList;
        }
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        arrayList.add(new Node<>(root));
        Node<Binary_Tree_Node<Integer>> head=new Node<>(root);
        while (!queue.isEmpty())
        {
            Binary_Tree_Node<Integer> current_node=queue.remove();
            Node<Binary_Tree_Node<Integer>> n=new Node<>(current_node);
            if(current_node==null && !(queue.isEmpty()))
            {
                head.next=null;
                queue.add(null);
                Binary_Tree_Node<Integer> node=queue.remove();
                head=new Node<>(node);
                arrayList.add(head);
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                return arrayList;
            }
            head.next=n;
            head=head.next;
            if(current_node.left!=null)
            {
                queue.add(current_node.left);
            }
            if(current_node.right!=null)
            {
                queue.add(current_node.right);
            }
        }
        return arrayList;
    }
}
