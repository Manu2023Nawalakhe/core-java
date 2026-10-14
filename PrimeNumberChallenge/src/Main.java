public class Main {
    public static void main(String[] args){
//        System.out.println("0 is " + ((isPrime(0) ? "" : "Not") + " a prime number"));
//        System.out.println("1 is " + ((isPrime(1) ? "" : "Not") + " a prime number"));
//        System.out.println("2 is " + ((isPrime(2) ? "" : "Not") + " a prime number"));
//        System.out.println("3 is " + ((isPrime(3) ? "" : "Not") + " a prime number"));

        int counter = 0;
//        for(int i = 0; counter<3 && i<=50;i++)// without break statements
        
        for(int i = 0; i<50;i++){
            isPrime(i);
            System.out.println("number " + i + " is a prime number");
            counter ++;
//            if (counter == 3){
//                System.out.println("Found 3 - Exiting for loop");
//                break;
//            }
        }
//System.out.println("Total number of prime numbers between 10 and 50 is " + counter);
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if(wholeNumber % divisor ==0){
                return false;
            }
        }
        return true;
    }
}
