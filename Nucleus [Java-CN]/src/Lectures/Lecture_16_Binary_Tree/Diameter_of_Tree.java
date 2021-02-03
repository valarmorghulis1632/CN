package Lectures.Lecture_16_Binary_Tree;

class Answer_Object
{
    int diameter;
    int height;

    Answer_Object(int diameter,int height)
    {
        this.diameter =diameter;
        this.height=height;
    }
}

public class Diameter_of_Tree {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
        Answer_Object ans=diameter_of_tree(root);
        System.out.println(ans.diameter);
    }

    public static Answer_Object diameter_of_tree(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return new Answer_Object(0,0);
        }

        Answer_Object left_ans=diameter_of_tree(root.left);
        Answer_Object right_ans=diameter_of_tree(root.right);

        int path_through_node=left_ans.height+right_ans.height+1;

        int current_diameter=Math.max(Math.max(left_ans.diameter,right_ans.diameter),path_through_node);
        int current_height=Math.max(left_ans.height,right_ans.height)+1;

        return new Answer_Object(current_diameter,current_height);
    }
}
