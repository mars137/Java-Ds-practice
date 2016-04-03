import java.util.*;
public class CountTest 
{     
    public static void main(String... args) {        
        Integer[] array1 = {9, 4, 6, 2, 10, 10};
        Integer[] array2 = {14, 3, 6, 9, 10, 15, 17, 9};                    
        Set hashSet = new HashSet(Arrays.asList(array1)); 
        Set commonElements = new HashSet();        
        for (int i = 0; i < array2.length; i++) 
        {
            if (hashSet.contains(array2[i])) {
                commonElements.add(array2[i]);
            }
        }
        System.out.println("Common elements " + commonElements);
    }    
}