package Codezen.Practice_Section.Binary_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kth_Level {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(print_sum_of_kth_level_nodes(root,scanner.nextInt()));
    }

    private static long print_sum_of_kth_level_nodes(Binary_Tree_Node<Integer> root, int k) {
        if(root==null)
        {
            return 0;
        }
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        long sum=0;
        while (!queue.isEmpty())
        {
            Binary_Tree_Node<Integer> current_node=queue.remove();
            if(current_node==null && !queue.isEmpty())
            {
                queue.add(null);
                k--;
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                return sum;
            }
            if(k==1)
            {
                sum=sum+current_node.data;
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
        return sum;
    }
}
