
public class Asending {
	
	public static void main(String[] args) {
		
		int [] arr=new int[] {5,8,9,2,4};
		int temp=0;
		System.out.println("Original Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println();
		System.out.println("Array in Asending Order");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
