package Codezen.Practice_Section.Binary_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Leaves_at_Same_Level{
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(leaves_at_same_level(root));
    }

    private static boolean leaves_at_same_level(Binary_Tree_Node<Integer> root) {
        HashSet<Integer> hashSet=leaves_at_same_lvl_helper(root);
        if(hashSet.size()==1)
        {
            return true;
        }
        return false;
    }

    public static HashSet<Integer> leaves_at_same_lvl_helper(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return null;
        }
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        HashSet<Integer> hashSet= new HashSet<>();
        int level=0;
        while (!queue.isEmpty())
        {
            Binary_Tree_Node<Integer> current_node=queue.remove();
            if(current_node==null && !queue.isEmpty())
            {
                level++;
                queue.add(null);
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
