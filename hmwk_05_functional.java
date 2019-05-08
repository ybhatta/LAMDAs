// Bhatta, Yubaraj
// yxb4124
// 2019-04-22

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class hmwk_05_functional {
  //----------------------------------------------------------
  // sumOfSquares lambda goes here.
  static UnaryOperator<Long>
  sumOfSquares= (Long n) -> n==0 ? 0:(n*n+hmwk_05_functional.sumOfSquares.apply(n-1));
  // pell lambda goes here.
  static UnaryOperator<Long>
  pell=(Long n) -> n<=1 ? n:(2*hmwk_05_functional.pell.apply(n-1) + hmwk_05_functional.pell.apply(n-2));
  // powers lambda goes here.
  static BinaryOperator<Long>
  powers= (Long m, Long n) -> n==0 ? m-1 :(m-1)+(m*hmwk_05_functional.powers.apply(m,n-1));

  //----------------------------------------------------------
  public static void main( String[] args )
  {
    // Put for loop here that applies the sumOfSquares lambda.
    for (long n=0; n<=15;n++)
    {
   System.out.format("sumOfSquares(%d) is %d\n",n,sumOfSquares.apply(n));
   }
    // Put for loop here that applies the pell lambda.
    for (long n=0;n<=15;n++)
    {
    System.out.format("pell(%d) is %d\n",n,pell.apply(n));
    }
    // Put for loop here that applies the powers lambda.
    for(long m=2; m<=10;m++) {
      for (long n=1; n<=10;n++){
        System.out.format("powers(%d, %d) is %d\n",m,n,powers.apply(m,n));
      }
    }
  }
}
