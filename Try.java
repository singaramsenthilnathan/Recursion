public class Try {

  public static void main(String[] args) {
    int n=2;
    Try tt = new Try();
    tt.tower(n,'A','B','C');

  }

  private void tower(int n, char start, char inter, char end) 
  {
  if(n==1)
  {
    System.out.println("move disk 1 from rod "+start+" to "+inter);
    return;
  }
  tower(n-1,start,inter,end);
  System.out.println("disk 2 from rod "+start+" to "+end);
  tower(n-1,inter,end,start);
    
  }

}
