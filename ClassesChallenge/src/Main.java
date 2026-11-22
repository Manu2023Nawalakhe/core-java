public class Main {
    public static void main(String[] args) {

//        Account bobsAccount = new Account();
      //  Account bobsAccount = new Account("12345",1000.00,"Dhanu","dhanu@gmail.com","1234567895");

        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getNumber());
//        bobsAccount.setNumber("123");
//        bobsAccount.setBalance(500);
//        bobsAccount.setCustomerName("Manisha");
//        bobsAccount.setCustomerEmail("manu@gmail.com");
//        bobsAccount.setNumber("7412589325");

        
        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(50);


        Account timsAccount = new Account("Tim","tim@gmail.com","12345");
        System.out.println("AccountNo:" + timsAccount.getNumber() + "; name " + timsAccount.getCustomerName());

    }
}
