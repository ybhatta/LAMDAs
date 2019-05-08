// Bhatta, Yubaraj
// yxb4124
// 2019-04-18

public class hmwk_05_imperative {
  //----------------------------------------------------------
  // Sum of squares
  static Long sumOfSquares( Long n ) {
    // Put something here
    
    if ( n==0) {
      return 0L;
    }
    else
    {
       return n*n+sumOfSquares(n-1);
    }
  }
  // Pell numbers
  static Long pell( Long n ) {
    // Put something here
    if( n==0){
      return 0L;
    }
    else if( n==1){
      return 1L;
    }
    else
    {
    return (2*pell(n-1)+pell(n-2));
      }
  }
  // Powers
  static Long powers( Long m, Long n ) {
    if(n==0)
    {
      return m-1;

    }
    else{
      return (m-1)+(m*powers(m,n-1));
    }
  
  }

  //----------------------------------------------------------
  public static void main( String[] args )
  {
    // Put for loop here that calls sumOfSquares().

  
    for (long n=0; n<=15;n++)
     {
    System.out.format("sumOfSquares(%d) is %d\n",n,sumOfSquares(n));
    }
    
    // Put for loop here that calls pell().
    
    for (long n=0;n<=15;n++)
    {
    System.out.format("pell(%d) is %d\n",n,pell(n));
    }
   // Put nested for loops here that call powers().
    for(long m= 2; m<=10;m++) {
      for (long n=1; n<=10;n++){
        System.out.format("powers(%d, %d) is %d\n",m,n,powers(m,n));
      }
    }
  }
  
}
