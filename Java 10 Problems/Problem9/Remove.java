/*Write a Java program to remove elements from an ArrayList */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(23);
        arr.add(42);
        arr.add(656);
        arr.add(6);

        System.out.println("ArrayList: " + arr);

        Iterator itr = arr.iterator();

        while(itr.hasNext()) {
            int x = (Integer)itr.next();
            if(x%2 == 0)
                itr.remove();
        }
        System.out.println("ArrayList after removing even elements: " + arr);
    }    
}
