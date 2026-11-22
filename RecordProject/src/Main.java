public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
//            Student s = new Student;
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Marry";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";

                    }, "5/5/1998",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S92300", "Marry", "5/5/1998", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S92301", "Carol", "5/5/1998", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);



        System.out.println(pojoStudent.getClassList() + "Java OCP Exam 829");
//        System.out.println(recordStudent.getClassList() + "Java OCP Exam 829");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());

        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
