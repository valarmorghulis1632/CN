package Codezen.Assignment.BST.BST_2;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.*;

public class Nodes_in_Given_Range {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Binary_Tree_Node<Integer> root = Creation_of_Binary_Tree.create_binary_tree();
        int k1=scan.nextInt();
        int k2=scan.nextInt();
        nodes_in_range(root,k1,k2);
    }

    private static void nodes_in_range(Binary_Tree_Node<Integer> root, int k1, int k2) {
        if(root==null)
        {
            return;
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty())
        {
            Binary_Tree_Node<Integer> current_node=queue.remove();
            if(current_node==null && !queue.isEmpty())
            {
                queue.add(null);
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                Collections.sort(arrayList);
                int i=0;
                while (i<arrayList.size())
                {
                    System.out.print(arrayList.get(i)+" ");
                    i++;
                }
                return;
            }
            if(current_node.data>=k1 && current_node.data<=k2)
            {
                arrayList.add(current_node.data);
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
