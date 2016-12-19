
public class SaadAli {

	  public void listOfPrime(int startPoint, int endPoint) {
	        int n = 0;
	        if (startPoint < endPoint) {
	            int i = startPoint;
	            while (i <= endPoint) {
	                if (this.isPrime(i)) {
	                    ++n;
	                }
	                ++i;
	            }
	            System.out.println(n);
	        } else {
	            System.out.println("Start Point must be smaller than End Point");
	        }
	    }

	    public boolean isPrime(int checkNumber) {
	        if (checkNumber == 2 || checkNumber == -2) {
	            return true;
	        }
	        if (checkNumber == 1 || checkNumber == 0) {
	            return false;
	        }
	        if (checkNumber % 2 == 0) {
	            return false;
	        }
	        int i = 3;
	        while (i * i <= checkNumber) {
	            if (checkNumber % i == 0) {
	                return false;
	            }
	            i += 2;
	        }
	        return true;
	    }

	    public void listOfPairs(int firstPoint, int lastPoint) {
	        boolean z = false;
	        if (firstPoint < lastPoint) {
	            int i = firstPoint;
	            while (i <= lastPoint) {
	                if (this.isPrime(i)) {
	                    int a = i;
	                    System.out.println(i);
	                }
	                ++i;
	            }
	        } else {
	            System.out.println("First Point must be smaller than Last Point");
	        }
	    }

}
