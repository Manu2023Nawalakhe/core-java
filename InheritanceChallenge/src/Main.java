public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim","11/11/1985",77001,"01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+ tim.getAge());
        System.out.println("pay = " + tim.collectPay());


        SalariedEmployee joe = new SalariedEmployee("Joe","11/11/1985",12345,"01/01/2020",3500);
        System.out.println(joe);

        System.out.println("joe's Paycheck = $ "+ joe.collectPay());

        joe.retire();
        System.out.println("joe's pension check = $ "+ joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1998",1452,"03/03/2021",15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $ " + mary.collectPay());
        System.out.println("Mary's Holiday pay = $ " + mary.getDoublepay());
    }
}
