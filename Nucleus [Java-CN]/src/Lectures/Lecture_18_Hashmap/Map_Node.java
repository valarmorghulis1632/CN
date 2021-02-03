package Lectures.Lecture_18_Hashmap;

public class Map_Node <K,V> {
    K key;
    V value;
    Map_Node<K,V> next;

    Map_Node(K key,V value)
    {
        this.key=key;
        this.value=value;
    }
}
