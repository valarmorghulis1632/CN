package Practice_Quests.Generic_Tree;

public class Largest_Node {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=Number_of_Nodes.create_generic_tree();
        System.out.println("\nLARGEST NODE IS: "+largest_node(root));
    }

    public static int largest_node(Generic_Tree_Node<Integer> root)
    {
        int large=root.data;
        int i=0,ans;
        while (i<root.children.size())
        {
            ans=largest_node(root.children.get(i));
            if(large<ans)
            {
                large=ans;
            }
            i++;
        }
        return large;

    }
}
