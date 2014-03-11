package collectoin;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                final List<String> listOfStrings = new ArrayList<> ();
		listOfStrings.add ("Str1");
		listOfStrings.add ("Str2");
		listOfStrings.add ("str3");
                listOfStrings.add ("aaa");
		System.out.println ("listOfStrings = " + listOfStrings);
		final Collection<String> stillList = listOfStrings;
                Collections.sort(listOfStrings);
		System.out.println ("stillList = " + stillList);

		final Set<String> setOfStrings = new HashSet<> ();
		setOfStrings.add ("Str1");
		setOfStrings.add ("Str2");
		setOfStrings.add ("Str1");
		setOfStrings.add ("Str3");
		setOfStrings.add ("Str4");
		setOfStrings.add ("str1");
		setOfStrings.add ("Str0");
		setOfStrings.add ("Abc");
		setOfStrings.add ("Ccc");
		setOfStrings.add ("Qwerty");
		System.out.println ("setOfStrings = " + setOfStrings);

		final Set<String> orderedSetOfStrings = new TreeSet<> (setOfStrings);
		System.out.println ("orderedSetOfStrings = " + orderedSetOfStrings);
    }
    
}
