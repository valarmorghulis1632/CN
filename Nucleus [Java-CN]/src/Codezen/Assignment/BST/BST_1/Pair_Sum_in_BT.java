package Codezen.Assignment.BST.BST_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Pair_Sum_in_BT {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(Integer.MIN_VALUE);
        pair_sum_in_BT(root,root,scan.nextInt(),arrayList);
    }

    public static void pair_sum_in_BT(Binary_Tree_Node<Integer> root_1, Binary_Tree_Node<Integer> root, int sum, ArrayList<Integer> arrayList)
    {
        if(root==null)
        {
            return;
        }
        if(sum-root.data!=root.data)
        {
            int ans=search(root_1,sum-root.data);
            int i=0,flag=0;
            while (i<arrayList.size())
            {
                if(ans==arrayList.get(i))
                {
                    flag=1;
                    break;
                }
                i++;
            }
            if (ans!=-1 && flag==0)
            {
                System.out.println(Math.min(ans,root.data)+" "+Math.max(ans,root.data));
                arrayList.add(ans);
                arrayList.add(root.data);
            }
        }
        pair_sum_in_BT(root_1,root.left,sum,arrayList);
        pair_sum_in_BT(root_1,root.right,sum,arrayList);
    }

    public static int search(Binary_Tree_Node<Integer> root,int data)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.data==data)
        {
            return data;
        }
        int left_ans=search(root.left,data);
        if(left_ans!=-1)
        {
            return left_ans;
        }
        return search(root.right,data);
    }
}
