package Codezen.Assignment.Binary_Tree.Binary_Tree_2;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Zig_Zag_Tree {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        zig_zag_tree(root);
    }

    public static void zig_zag_tree(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            System.out.print(root.data);
            return;
        }
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        Stack<Binary_Tree_Node<Integer>> stack=new Stack<>();
        queue.add(root);
        queue.add(null);
        int count=0;
        while (!queue.isEmpty())
        {
            Binary_Tree_Node<Integer> current_node=queue.remove();
            if(current_node==null && !(queue.isEmpty()))
            {
                queue.add(null);
                if(count%2!=0)
                {
                    while (!stack.isEmpty())
                    {
                        System.out.print(stack.pop().data+" ");
                    }
                }
                System.out.println("");
                count++;
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                while (!stack.isEmpty())
                {
                    System.out.print(stack.pop().data+" ");
                }
                return;
            }
            if(count%2==0)
            {
                System.out.print(current_node.data+" ");
            }
            else
            {
                stack.push(current_node);
            }
            if(current_node.left!=null)
            {
                queue.add(current_node.left);
            }
            if(current_node.right!=null)
            {
                queue.add(current_node.right);
            }
        }
    }
}
