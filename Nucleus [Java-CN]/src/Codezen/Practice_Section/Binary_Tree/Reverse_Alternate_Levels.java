package Codezen.Practice_Section.Binary_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_Alternate_Levels {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        reverse_alt_levels(root);

    }

    public static void reverse_alt_levels(Binary_Tree_Node<Integer> root)
    {
        Queue<Binary_Tree_Node<Integer>> queue=reverse_alt_levels_helper(root);
        Binary_Tree_Node<Integer> arr[]=new Binary_Tree_Node[queue.size()];
        int i=0;
        for (Binary_Tree_Node<Integer> node:queue)
        {
            arr[i]=node;
            i++;
        }
        Binary_Tree_Node<Integer> root_1=arr[0];
        i=0;
        int j=1;
        while (j<arr.length)
        {
            arr[i].left=arr[j];
            arr[i].right=arr[j+1];
            j=j+2;
            i++;
        }
        ArrayList<Integer> arrayList=get_inorder(root_1);
        for (int x :arrayList)
        {
            System.out.print(x+" ");
        }
    }

    private static ArrayList<Integer> get_inorder(Binary_Tree_Node<Integer> root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        ArrayList<Integer> left_ans=get_inorder(root.left);
        left_ans.add(root.data);
        ArrayList<Integer> right_ans=get_inorder(root.right);
        left_ans.addAll(right_ans);
        return left_ans;
    }

    private static Queue<Binary_Tree_Node<Integer>> reverse_alt_levels_helper(Binary_Tree_Node<Integer> root) {
        if(root==null)
        {
            return null;
        }
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        Queue<Binary_Tree_Node<Integer>> queue1=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        Stack<Binary_Tree_Node<Integer>> stack=new Stack<>();
        int level=0;
        while (!queue.isEmpty())
        {
            Binary_Tree_Node<Integer> current_node=queue.remove();
            if(current_node==null && !queue.isEmpty())
            {
                queue.add(null);
                if(level%2!=0)
                {
                    while (!stack.isEmpty())
                    {
                        queue1.add(stack.pop());
                    }
                }
                level++;
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                if(level%2!=0)
                {
                    while (!stack.isEmpty())
                    {
                        queue1.add(stack.pop());
                    }
                }
                return queue1;
            }
            if(level%2==0)
            {
                queue1.add(current_node);
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
        return queue1;
    }
}
