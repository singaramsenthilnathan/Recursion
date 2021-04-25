/*
1
23
456
78910  */

public class RecursionNum 
{
public static void main(String[] args) 
{
RecursionNum rn = new RecursionNum();
rn.printnum(1);
rn.printavoid(7);
}
private void printavoid(int j) {
	// TODO Auto-generated method stub
	if(j<=10)
	{
		System.out.print(j+" ");
		printavoid(j+1);
	}
	}

private void printnum(int i) 
{
if(i<=7)
{
	if(i==1)
	{
		System.out.println(i);
	}
	else 
	{
System.out.println(i+" "+(i+1)); 
i=4;
System.out.println(i+" "+(i+1)+" "+(i+2));
}
printnum(2*i);
}
}

}
