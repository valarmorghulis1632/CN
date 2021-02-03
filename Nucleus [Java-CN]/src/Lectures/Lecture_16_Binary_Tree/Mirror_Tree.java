package Lectures.Lecture_16_Binary_Tree;

public class Mirror_Tree {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
        mirror(root);
        Creation_of_Binary_Tree.print_tree(root);
    }

    public static <T> void mirror(Binary_Tree_Node<T> root)
    {
        if(root==null)
        {
            return;
        }

        Binary_Tree_Node<T> temp=root.left;
        root.left=root.right;
        root.right=temp;

        mirror(root.left);
        mirror(root.right);
    }
}
