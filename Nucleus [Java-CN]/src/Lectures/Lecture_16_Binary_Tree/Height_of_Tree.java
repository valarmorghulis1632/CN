package Lectures.Lecture_16_Binary_Tree;

public class Height_of_Tree {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(height_of_binary_tree(root));
    }

    public static <T> int height_of_binary_tree(Binary_Tree_Node<T> root)
    {
        if(root==null)
        {
            return 0;
        }
        int left_ans=height_of_binary_tree(root.left);
        int right_ans=height_of_binary_tree(root.right);
        return (left_ans>right_ans?left_ans:right_ans)+1;
    }
}
