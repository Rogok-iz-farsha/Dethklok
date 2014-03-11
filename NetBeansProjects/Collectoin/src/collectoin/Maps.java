package collectoin;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author Александр
 */
public class Maps {
   public static void main (String[] params)
	{
		final Map<String, String> mapOfStrings = new HashMap<> ();
		mapOfStrings.put ("key1", "value1");
		mapOfStrings.put ("key2", "value2");
		mapOfStrings.put ("key0", "value0");
		mapOfStrings.put ("key2", "value2-new");
		mapOfStrings.put ("Aaa", "AAA");
		mapOfStrings.put ("q", "Qwerty");
		System.out.println ("mapOfStrings = " + mapOfStrings);
		System.out.println ("mapOfStrings[key0] = " + mapOfStrings.get ("key0"));
		System.out.println ("mapOfStrings[key2] = " + mapOfStrings.get ("key2"));
		System.out.println ("mapOfStrings[unknownKey] = " + mapOfStrings.get ("unknownKey"));

		final Map<String, String> orderedMapOfStrings = new TreeMap<> (mapOfStrings);
		System.out.println ("orderedMap = " + orderedMapOfStrings);

		final Map<Index, Long> map = new HashMap<> ();
		map.put (new Index (4, "Qwerty"), 1L);
		map.put (new Index (1, null), 2L);
		map.put (new Index (56, "Last1"), 3L);
		map.put (new Index (56, "Last2"), 4L);
		map.put (new Index (7, "Bbb"), 4L);
		map.put (new Index (-6, "Yyy"), 5L);
		map.put (new Index (0, "---"), 6L);
		map.put (new Index (1, "NotEmpty"), 7L);
		map.put (new Index (0, "---"), 9L);
		map.put (new Index (7, "Aaa"), 8L);
		System.out.println ("map = " + map);
		System.out.println ("map[0, ---] = " + map.get (new Index (0, "---")));
                
		final Map<Index, Long> orderedMap = new TreeMap<> (map);
		System.out.println ("orderedMap = " + orderedMap); 
}
}