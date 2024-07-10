import java.util.Arrays;
class ArrayExample1
{
	public static void main(String[] args) {
		int [][][] a = new int [1][][];
		a[0] = new int [2][2];

		a[0][0][0] = 20;
		a[0][0][1] = 40;
		a[0][1][0] = 60;
		a[0][1][1] = 80;
		System.out.println(Arrays.deepToString(a));
	}
}