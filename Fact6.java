// Recursion

public class Fact6
{
int total=0;
public static void main(String[]args)
{
Fact6 f = new Fact6();
f.printNumbers(1);

}
public void printNumbers(int i)
{

System.out.print(i+" ");
total=total+i;
i++;
System.out.println();
if(i<6)
printNumbers(i);
else
System.out.print(total);
}
}