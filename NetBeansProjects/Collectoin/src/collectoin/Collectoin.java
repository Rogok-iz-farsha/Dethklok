package collectoin;

//import com.sun.org.apache.xalan.internal.lib.Extensions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Александр
 */
public class Collectoin {

   
    public static void main(String[] args) {
        final List<String> list1 = new ArrayList<>();
        final List<String> list2 = new ArrayList<>();
        Time(list1,list2);   //
        

        final Set<String> setOfStrings1 = new HashSet<>();
        final Set<String> setOfStrings2 = new HashSet<>();
        Time(setOfStrings1,setOfStrings2);
        
        
        final Set<String> ordered1 = new TreeSet<>(setOfStrings1);
        final Set<String> ordered2 = new TreeSet<>(setOfStrings2);
        Time(ordered1,ordered2);
         
        

    }


    

}
