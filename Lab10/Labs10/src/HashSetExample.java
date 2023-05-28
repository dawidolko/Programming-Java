import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
// duplicate element is not permitted
        hs.add("b");
        hs.add("a");
        hs.add("c");
        hs.add("d");
        hs.add("d");
        Iterator it=hs.iterator();
        while(it.hasNext())
        {
            String value =(String)it.next();
            System.out.println("Value :"+value);
        }
//find size of hashSet
        System.out.println("Size :"+hs.size());
// Remove element from hashSet : hs.remove("d");
// To remove all object from hashSet hs.clear();
    }
}