import java.math.BigInteger;


public class FactorialCalculator {

	
	
	public static void main(String [] args) {
		
		calculateFactorial(1000);
		
	}
	private static void calculateFactorial(int uptoValue) {
        BigInteger answer=BigInteger.ONE;
        boolean oddUptoValue=((uptoValue&1)==1);
        int tempUptoValue=uptoValue;
        if(oddUptoValue){
            tempUptoValue=uptoValue-1;
            }

        int nextSum = tempUptoValue;
        int nextMulti = tempUptoValue;
        while (nextSum >= 2){
            answer=answer.multiply(BigInteger.valueOf(nextMulti));
            nextSum -= 2;
            nextMulti += nextSum;
        //  long product=(tempUptoValue-i+1L)*i;

        }
        if(oddUptoValue){
            answer=answer.multiply(BigInteger.valueOf(uptoValue));
        }
        System.out.println(answer);
    }	
}
