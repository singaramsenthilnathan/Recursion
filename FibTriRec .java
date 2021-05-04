public class FibTriRec 
{
	static int n=1;
public static void main(String[] args) 
{
FibTriRec ftr = new FibTriRec();
ftr.triangle(1);
}

private static void triangle(int b) 
{
if(b<=4)
{
FibTriRec.tri(b);
}
}
public static void tri(int c)
{
if(c>=1)
{
	System.out.print("*"+" ");
	c--;
	tri(c);
}
else
{
	System.out.println();
	n++;
	triangle(n);
}
}
}
/* OUTPUT:
 
* 
* * 
* * * 
* * * * 

*/
