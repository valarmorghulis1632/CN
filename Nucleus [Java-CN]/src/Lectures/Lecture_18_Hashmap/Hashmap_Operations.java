package Lectures.Lecture_18_Hashmap;

import java.util.ArrayList;

public class Hashmap_Operations <K,V> {
    private ArrayList<Map_Node<K,V>> bucket;
    private int bucket_size;
    private int no_of_entries;

    public Hashmap_Operations()
    {
        bucket=new ArrayList<>();
        bucket_size=10;
        no_of_entries=0;
        int i=0;
        while (i<bucket_size)
        {
            bucket.add(null);
            i++;
        }
    }

    public int compress(int hashcode)
    {
        return hashcode%bucket_size;
    }

    public int get_index(K key)
    {
        return compress(key.hashCode());
    }

    public void put(K key,V value)
    {
        int index=get_index(key);
        Map_Node<K,V> head=bucket.get(index);
        while (head!=null)
        {
            if(head.key.equals(key))
            {
                head.value=value;
                return;
            }
            head=head.next;
        }
        Map_Node<K,V> node=new Map_Node<>(key, value);
        node.next=bucket.get(index);
        bucket.set(index,node);
        no_of_entries++;
        if((no_of_entries*(1.0))/bucket_size>(0.7))
        {
            grow();
        }
    }

    public void grow()
    {
        ArrayList<Map_Node<K,V>> temp=bucket;
        bucket=new ArrayList<>();
        bucket_size=bucket_size*2 ;
        int i=0;
        while (i<bucket_size)
        {
            bucket.add(null);
            i++;
        }
        no_of_entries=0;
        i=0;
        while (i<temp.size())
        {
            Map_Node<K,V> head=temp.get(i);
            while (head!=null)
            {
                put(head.key,head.value);
                head=head.next;
            }
            i++;
        }
    }

    public boolean remove(K key)
    {
        if(no_of_entries==0)
        {
            return false;
        }
        int index=get_index(key);
        Map_Node<K,V> head=bucket.get(index);
        if(head==null)
        {
            return false;
        }
        if(head.key.equals(key))
        {
            bucket.set(index,head.next);
            no_of_entries--;
            return true;
        }
        while (head.next!=null)
        {
            if(head.next.key.equals(key))
            {
                head.next=head.next.next;
                no_of_entries--;
                return true;
            }
            head=head.next;
        }
        return false;
    }

    public V get_value_at_key(K key)
    {
        if(no_of_entries==0)
        {
            return null;
        }
        int index=get_index(key);
        Map_Node<K,V> head=bucket.get(index);
        if(head.key.equals(key))
        {
            return head.value;
        }
        while (head.next!=null)
        {
            head=head.next;
            if(head.key.equals(key))
            {
                return head.value;
            }
        }
        return null;
    }

    public ArrayList<K> get_keys()
    {
        ArrayList<K> key_list=new ArrayList<>();
        int i=0;
        while (i<bucket_size)
        {
            Map_Node<K,V> head=bucket.get(i);
            while (head!=null)
            {
                key_list.add(head.key);
                head=head.next;
            }
            i++;
        }
        return key_list;
    }

    public ArrayList<V> get_values()
    {
        ArrayList<V> value_list=new ArrayList<>();
        int i=0;
        while (i<bucket_size)
        {
            Map_Node<K,V> head=bucket.get(i);
            while (head!=null)
            {
                value_list.add(head.value);
                head=head.next;
            }
            i++;
        }
        return value_list;
    }

    public ArrayList<Map_Node<K, V>> getBucket() {
        return bucket;
    }

    public int getNo_of_entries() {
        return no_of_entries;
    }

    public int getBucket_size() {
        return bucket_size;
    }

    public static void main(String[] args) {
        Hashmap_Operations<Integer,String> hashmap=new Hashmap_Operations<>();
        hashmap.put(100,"Ayush");
        hashmap.put(123,"Sahil");
        hashmap.put(323,"Ankit");
        hashmap.put(123,"Anupam");
        System.out.println(hashmap.get_value_at_key(323));
        System.out.println(hashmap.get_value_at_key(123));
        System.out.println(hashmap.remove(323));
        System.out.println(hashmap.remove(101));
        ArrayList<Integer> key_list=hashmap.get_keys();
        ArrayList<String> value_list=hashmap.get_values();
        int i=0;
        while (i<key_list.size())
        {
            System.out.print(key_list.get(i)+" ");
            i++;
        }
        System.out.println("");
        i=0;
        while (i<value_list.size())
        {
            System.out.print(value_list.get(i)+" ");
            i++;
        }
    }
}
