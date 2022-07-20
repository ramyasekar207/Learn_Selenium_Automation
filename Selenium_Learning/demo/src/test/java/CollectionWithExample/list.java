package CollectionWithExample;

import java.util.ArrayList;
import java.util.List;

public class list {

    public static void main(String[] args) {
        list test = new list();
        test.arrayListExample();
        
        /*  
        1. Maintains insertion order
        2. Allows duplicate
        */
     }


    public void arrayListExample()
    {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        System.out.println(list);

        //Copy the List values into another List
        List<String> list2 = new ArrayList<String>();
        list2.addAll(list);
        System.out.println(list2);

        //Remove particular value in the List
        list2.remove(0);
        System.out.println(list2);
        
        //Null insertion is POSSIBLE
        list.add(null);
        System.out.println(list);

        //Remove all the values in the List
        list2.clear();

    }

    
}
