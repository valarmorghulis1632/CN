package Codezen.Practice_Section.Binary_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Minimum_Depth {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(min_depth(root));
    }

    private static int min_depth(Binary_Tree_Node<Integer> root)
    {
        HashSet<Integer> hashSet=min_depth_helper(root);
        int minimum=Integer.MAX_VALUE;
        for (int x:hashSet)
        {
            if(minimum>x)
            {
                minimum=x;
            }
        }
        return minimum;
    }

    public static HashSet<Integer> min_depth_helper(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return null;
        }
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        HashSet<Integer> hashSet=new HashSet<>();
        int level=1;
        while (!queue.isEmpty())
        {
            Binary_Tree_Node<Integer> current_node=queue.remove();
            if(current_node==null && !queue.isEmpty())
            {
                queue.add(null);
                level++;
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                return hashSet;
            }
            if(current_node.left==null && current_node.right==null)
            {
                hashSet.add(level);
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
        return hashSet;
    }
}
