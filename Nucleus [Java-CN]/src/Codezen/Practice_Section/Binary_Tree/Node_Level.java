package Codezen.Practice_Section.Binary_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Node_Level {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(node_level(root,scanner.nextInt()));
    }

    private static int node_level(Binary_Tree_Node<Integer> root, int m) {
        if(root==null)
        {
            return -1;
        }
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
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
                return -1;
            }
            if(current_node.data==m)
            {
                return level;
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
        return level;
    }
}
