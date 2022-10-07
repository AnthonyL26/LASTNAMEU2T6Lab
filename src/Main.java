public class Main {
    public static void main(String[] args) {
        Student student = new Student("Abby", "Smith", 2023);
        student.addTestScore(95);
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());
        int a = 1988;

        int b = 1990;



        String claim = " that the world’s athletes " +

                "competed in Olympic Games in ";



        String s = "It is " + true + claim + a +

                " but " + false + claim + b + ".";



        System.out.println(s);
    }
}
