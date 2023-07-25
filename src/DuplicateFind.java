
public class DuplicateFind {
	
	public static void main(String[] args) {
		
		int []arr=new int[] {1,2,3,1,2,3,4,5,6};
		
		System.out.println("Duplicate In Array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");
				}
			}
		}
	}

}
