package CollectionWithExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.assertj.core.util.Arrays;

public class removeDuplicates_Set {
    public static void main(String[] args) {
        Set<String> list = new TreeSet<String>();
        //ArrayList<String> newlist = new ArrayList<>();
        for(int i=0;i<10; i++)
        {
            list.add(String.valueOf(i));
        }
        for(int i=0;i<3; i++)
        {
            list.add(String.valueOf(i));
        }
        System.out.println(list);
    //     for(int i=0;i<10; i++)
    //     {
                      
    //             if(!list.contains(list.get(i+1)))
    //             {
    //                 newlist.remove(list.get(i+1));
    //             }

    //             else
    //             newlist.add(list.get(i));
           
    //     }
    //    System.out.println(newlist); 
    }

}
