public class RecursionFact {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionFact rf = new RecursionFact();
	
rf.printfact(1);
	}
	int num=1;
public void printfact(int i)
{
	num = num*i;
if(i<5)
{
	printfact(i+1);
}
else
{
	System.out.println(num);
}
}
}
