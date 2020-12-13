public class FirstClass {
    public static void main(String[] args) {
//        Notebook notebook = new Notebook(600, 500, 1992);
//        System.out.println(notebook.weight + "g");
//        notebook.checkWeight();
//        System.out.println(notebook.price);
//        notebook.checkPrice();
//        System.out.println(notebook.year + "r");
//
//        Notebook heavyNotebook = new Notebook(2000, 900, 2009);
//        System.out.println(heavyNotebook.weight + "g");
//        heavyNotebook.checkPrice();
//        System.out.println(heavyNotebook.price);
//        heavyNotebook.checkWeight();
//        System.out.println(heavyNotebook.year + "r");
//
//        Notebook oldNotebook = new Notebook(1000, 1600, 2019);
//        System.out.println(oldNotebook.price);
//        oldNotebook.checkPrice();
//        System.out.println(oldNotebook.weight + "g");
//        oldNotebook.checkWeight();
//        System.out.println(oldNotebook.year + "r");
//
//        Grades grades = new Grades();
//        grades.add(5);
//        grades.add(2);
//        grades.add(3);
//        grades.add(1);
//        System.out.println(grades.showLastGrade());
//        System.out.println(grades.gradesAverage());

//        User userOne = new User("Mateusz", 20);
//        User userTwo = new User("Tomek", 35);
//        User userThree = new User("Olivia", 18);
//        User userFour = new User("Kazimiera", 58);
//        User userFive = new User("Stanisława", 72);
//        User userSix = new User("Patryk",42);
//        User userSeven = new User("Marcel", 4);
//        User userEight = new User("Dawid", 12);
//        User[] listOfUsers = {
//                userOne,
//                userTwo,
//                userThree,
//                userFour,
//                userFive,
//                userSix,
//                userSeven,
//                userEight
//        };
//        double ageAverage = countAverage(listOfUsers);
//        System.out.println("Srednia wieku to " + ageAverage);
//        for (int i = 0; i < listOfUsers.length; i++) {
//            if (ageAverage > listOfUsers[i].age){
//                System.out.println(listOfUsers[i].name);
//            }
//        }
//    }
//
//    public static double countAverage(User[] listOfUsers) {
//        double average = 0;
//            for (int i = 0; i < listOfUsers.length; i++){
//                average = average + listOfUsers[i].age / listOfUsers.length;
//            }
//        return average;}

        Application application = new Application("adam", 40.5, 178);
        System.out.println(application.name);
        System.out.println(application.age);
        System.out.println(application.height);
        application.applicationResoult();
    }
}

