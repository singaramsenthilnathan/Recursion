public class Fact5
{
public static void main(String[]args)
{
Fact5 f = new Fact5();
f.printNumbers(1);

}
public void printNumbers(int i)
{
	System.out.print(i+" ");
	i++;
	if(i<6)
	printNumbers(i);
}

}