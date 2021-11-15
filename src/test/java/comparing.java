

import java.util.ArrayList;

public class comparing {

	public static void main(String[] args) {
		int a[]= {1,2,5,7,9};
		int b[]= {2,2,4,7,9};
		ArrayList<Integer> ab = new ArrayList<Integer>();
		for(int k=0;k<a.length;k++)
		{
			if(a[k]==b[k])
			{
				ab.add(a[k]);
			}
		}
		Object[] c= ab.toArray();
		for(Object obj : c )
		{
		System.out.println(obj);
		}
	}

}
