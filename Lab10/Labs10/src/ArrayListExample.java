import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arlist=new ArrayList<String>();
//<E> it is return type of ArrayList
        arlist.add("First Element"); // adding element in ArrayList
        arlist.add("Second Element");
        arlist.add("Third Element");
        arlist.add("forth Element");
        arlist.add("fifth Element");
// add element with index for fix order
        arlist.add(2, "Fixed Order of Element");
// arlist.size() inform number of elements in ArrayList
        System.out.println("ArrayList Size :"+arlist.size());
// get elements of ArrayList
        for(int i=0;i<arlist.size();i++)
        {
            System.out.println("ArrayList Element "+i+" :"+arlist.get(i));
        }
    }
}