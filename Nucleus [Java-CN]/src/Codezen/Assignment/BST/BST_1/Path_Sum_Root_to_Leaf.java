package Codezen.Assignment.BST.BST_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Path_Sum_Root_to_Leaf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        ArrayList<Integer> result=new ArrayList<>();
        path_sum_root_to_leaf(root,scanner.nextInt(),result);
    }

    private static void path_sum_root_to_leaf(Binary_Tree_Node<Integer> root, int sum,ArrayList<Integer> result) {
        if(root==null)
        {
            return ;
        }
        if(root.left==null && root.right==null)
         {
             if(sum-root.data==0)
             {
                 result.add(root.data);
                 int i=0;
                 while (i<result.size())
                 {
                     System.out.print(result.get(i)+" ");
                     i++;
                 }
                 System.out.println("");
                 result.remove(result.size()-1);
                 return ;
             }
             return ;
         }
         result.add(root.data);
         path_sum_root_to_leaf(root.left,sum-root.data,result);
         path_sum_root_to_leaf(root.right,sum-root.data,result);
         result.remove(root.data);
    }
}
