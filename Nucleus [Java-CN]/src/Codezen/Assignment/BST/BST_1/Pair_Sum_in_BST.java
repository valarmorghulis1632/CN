package Codezen.Assignment.BST.BST_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Pair_Sum_in_BST {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        arrayList.add(Integer.MIN_VALUE);
//        pair_sum_in_BST(root,root,scan.nextInt(),arrayList);
        Stack<Binary_Tree_Node<Integer>> stack_1=new Stack<>();
        Stack<Binary_Tree_Node<Integer>> stack_2=new Stack<>();
        ArrayList<Binary_Tree_Node<Integer>> list_1=get_left_path(root);
        ArrayList<Binary_Tree_Node<Integer>> list_2=get_right_path(root);
        int i=list_1.size()-1;
        while (i>=0)
        {
            stack_1.push(list_1.get(i));
            i--;
        }
        i=list_2.size()-1;
        while (i>=0)
        {
            stack_2.push(list_2.get(i));
            i--;
        }
        pair_sum_in_BT_1(stack_1,stack_2,scan.nextInt(),0,node_count(root));
    }

    private static int node_count(Binary_Tree_Node<Integer> root) {
        if(root==null)
        {
            return 0;
        }
        return node_count(root.left)+node_count(root.right)+1;
    }

    private static ArrayList<Binary_Tree_Node<Integer>> get_right_path(Binary_Tree_Node<Integer> root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        ArrayList<Binary_Tree_Node<Integer>> ans=get_right_path(root.right);
        ans.add(root);
        return ans;
    }

    private static ArrayList<Binary_Tree_Node<Integer>> get_left_path(Binary_Tree_Node<Integer> root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        ArrayList<Binary_Tree_Node<Integer>> ans=get_left_path(root.left);
        ans.add(root);
        return ans;
    }

    public static void pair_sum_in_BT_1(Stack<Binary_Tree_Node<Integer>> stack_1, Stack<Binary_Tree_Node<Integer>> stack_2, int sum,int count,int no_of_nodes)
    {
        if(stack_1.isEmpty() || stack_2.isEmpty() || stack_1.peek().data==stack_2.peek().data || count==no_of_nodes)
        {
            return;
        }
        Binary_Tree_Node<Integer> node_1=stack_1.peek();
        Binary_Tree_Node<Integer> node_2=stack_2.peek();
        if(node_1.data+node_2.data==sum)
        {
            stack_1.pop();
            count++;
            if(node_1.right!=null)
            {
                ArrayList<Binary_Tree_Node<Integer>> list=get_left_path(node_1.right);
                int i=list.size()-1;
                while (i>=0)
                {
                    stack_1.push(list.get(i));
                    i--;
                }
            }
            stack_2.pop();
            count++;
            if(node_2.left!=null)
            {
                ArrayList<Binary_Tree_Node<Integer>> list=get_right_path(node_2.left);
                int i=list.size()-1;
                while (i>=0)
                {
                    stack_2.push(list.get(i));
                    i--;
                }
            }
            System.out.println(Math.min(node_1.data,node_2.data)+" "+Math.max(node_1.data,node_2.data));
        }
        else if(node_1.data+node_2.data>sum)
        {
            stack_2.pop();
            count++;
            if(node_2.left!=null)
            {
                ArrayList<Binary_Tree_Node<Integer>> list=get_right_path(node_2.left);
                int i=list.size()-1;
                while (i>=0)
                {
                    stack_2.push(list.get(i));
                    i--;
                }
            }
        }
        else if(node_1.data+node_2.data<sum)
        {
            stack_1.pop();
            count++;
            if(node_1.right!=null)
            {
                ArrayList<Binary_Tree_Node<Integer>> list=get_left_path(node_1.right);
                int i=list.size()-1;
                while (i>=0)
                {
                    stack_1.push(list.get(i));
                    i--;
                }
            }
        }
        pair_sum_in_BT_1(stack_1, stack_2, sum,count,no_of_nodes);
    }

//    public static void pair_sum_in_BST(Binary_Tree_Node<Integer> root_1,Binary_Tree_Node<Integer> root,int sum,ArrayList<Integer> arrayList)
//    {
//        if(root==null)
//        {
//            return;
//        }
//        if(sum-root.data!=root.data)
//        {
//            int ans=search(root_1,sum-root.data);
//            int i=0,flag=0;
//            while (i<arrayList.size())
//            {
//                if(ans==arrayList.get(i))
//                {
//                    flag=1;
//                    break;
//                }
//                i++;
//            }
//            if (ans!=-1 && flag==0)
//            {
//                System.out.println(Math.min(ans,root.data)+" "+Math.max(ans,root.data));
//                arrayList.add(ans);
//                arrayList.add(root.data);
//            }
//        }
//        pair_sum_in_BST(root_1,root.left,sum,arrayList);
//        pair_sum_in_BST(root_1,root.right,sum,arrayList);
//    }
//
//    public static int search(Binary_Tree_Node<Integer> root,int data)
//    {
//        if(root==null)
//        {
//            return -1;
//        }
//        if(root.data==data)
//        {
//            return data;
//        }
//        else if (root.data>data)
//        {
//            return search(root.left,data);
//        }
//        else
//        {
//            return search(root.right,data);
//        }
//    }
}
