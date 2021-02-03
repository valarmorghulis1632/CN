package Practice_Quests.Generic_Tree;

public class Height_of_Tree {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=Number_of_Nodes.create_generic_tree();
        System.out.println("\nHEIGHT IS: "+height_of_tree(root));
    }

    public static int height_of_tree(Generic_Tree_Node<Integer> root)
    {
        int height =0;
        int i=0,ans;
        while (i<root.children.size())
        {
            ans=height_of_tree(root.children.get(i));
            if(height<ans)
            {
                height=ans;
            }
            i++;
        }
        return height+1;
    }

}
