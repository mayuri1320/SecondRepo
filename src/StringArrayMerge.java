import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayMerge {
	
	public static void main(String[] args) {
		
		String []a= {"A","B","C"};
		String []b= {"D","E","F"};
		
		List list=new ArrayList(Arrays.asList(a));
		
		list.addAll(Arrays.asList(b));
		
		Object[] c=list.toArray();
		System.out.println(Arrays.toString(c));
		
	}

}
