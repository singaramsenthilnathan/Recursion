public class FibonacciSeries {
	int f1=0;
	int s1=1;
	int t1;
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FibonacciSeries fb =new FibonacciSeries();
		fb.fibonacci(10);
}
public void fibonacci(int count)
{
if(count>0)
{
t1=f1+s1;//1//2//3
System.out.println(f1+"+"+s1+"="+t1);
f1=s1;//1//1
s1=t1;//1//2
count=count-1;
fibonacci(count);
}
}
}

/*OUTPUT:
 * 0+1=1
1+1=2
1+2=3
2+3=5
3+5=8
5+8=13
8+13=21
13+21=34
21+34=55
34+55=89
*/


