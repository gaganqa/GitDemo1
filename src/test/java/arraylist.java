

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("12");
		list.add("d");
		list.add("hjhhj");
		list.add("12.88");
		//list.remove(0);
		/*System.out.println(list);
		System.out.println(list.size());
		for(String var : list) {
			System.out.println(var);
		}*/
	
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
