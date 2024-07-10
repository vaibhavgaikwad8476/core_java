import java.util.Arrays;
class ArrayExample4
{
	public static void main(String[] args) {
		int [] a = {16,17,4,3,5,2};
		System.out.println(Arrays.toString(a));

		int max = Integer.MIN_VALUE;
		int indx = 0;
		for(int i = 0;i<a.length;i++)
		{
			if(max<a[i])
			{
				indx = i;
				max = a[i];
			}
		}
		 System.out.println(max+  " " +indx);
	}
}