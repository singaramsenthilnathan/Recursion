// Recursion

public class Fact7
{
int total=1;
public static void main(String[]args)
{
Fact7 f = new Fact7();
f.printNumbers(1);
}
public void printNumbers(int i)
{
System.out.print(i+" ");
total=total*i;
i++;
System.out.println();
if(i<6)
printNumbers(i);
else
System.out.print("Factorial of 5 is"+" "+total);
}
}