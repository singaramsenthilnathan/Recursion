public class RecursionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
print(1);
}
static void print(int n)
{
	if(n<=10)
	{
		
		System.out.print(n+" ");
		n++;
		print(n);
	}
}

}
