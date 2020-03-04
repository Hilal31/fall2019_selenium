package office_hours;

import java.util.ArrayList;
import java.util.*;

public class seleniumOH1 {
    /*
    iterator/list/set/map and other types of collections can use iterator class over that collection
    >List has indexis(for i,for each, while, iterator)
    >Map(for each,Iterator, to loop throug keys)
    basic selenium navigations

     */
    public static void main(String[] args) {
        //create arraylist iterating
        ArrayList<String>keysToSearch=new ArrayList<>();
        keysToSearch.add("fruits");
        keysToSearch.add("veggies");
        keysToSearch.add("berries");

        Iterator it=keysToSearch.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(keysToSearch);

        Iterator iterator=keysToSearch.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());//String item=iterator.next();>we can use item
            System.out.println("*"+iterator.next());
        }

        //create a map with <string,String>
        HashMap<String,String>personalInfo=new HashMap<>();

        personalInfo.put("name","Bryan");
        personalInfo.put("studentID","13394084");
        personalInfo.put("major","computer science");
        Iterator <String> mapiterator=personalInfo.keySet().iterator();

        while(mapiterator.hasNext()){
            String key=mapiterator.next();
            System.out.println(mapiterator.next()+":"+personalInfo.get(key));
        }
        /*
        SELENIUM
        id=unique and it is not always available,we  always want to use
        class=classname
         */

    }
}
