public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 500, 1992);
        System.out.println(notebook.weight + "g");
        notebook.checkWeight();
        System.out.println(notebook.price);
        notebook.checkPrice();
        System.out.println(notebook.year + "r");

        Notebook heavyNotebook = new Notebook(2000, 900, 2009);
        System.out.println(heavyNotebook.weight + "g");
        heavyNotebook.checkPrice();
        System.out.println(heavyNotebook.price);
        heavyNotebook.checkWeight();
        System.out.println(heavyNotebook.year + "r");

        Notebook oldNotebook = new Notebook(1000, 1600, 2019);
        System.out.println(oldNotebook.price);
        oldNotebook.checkPrice();
        System.out.println(oldNotebook.weight + "g");
        oldNotebook.checkWeight();
        System.out.println(oldNotebook.year + "r");

        Grades grades = new Grades();
        grades.add(5);
        grades.add(2);
        grades.add(3);
        grades.add(1);
        System.out.println(grades.showLastGrade());
        System.out.println(grades.gradesAverage());

        Person userOne = new Person("Mateusz", 20);
        Person userTwo = new Person("Tomek", 35);
        Person userThree = new Person("Olivia", 18);
        Person userFour = new Person("Kazimiera", 58);
        Person userFive = new Person("Stanisława", 72);
        Person userSix = new Person("Patryk",42);
        Person userSeven = new Person("Marcel", 4);
        Person userEight = new Person("Dawid", 12);
        Person[] listOfPersons = {
                userOne,
                userTwo,
                userThree,
                userFour,
                userFive,
                userSix,
                userSeven,
                userEight
        };
        double ageAverage = countAverage(listOfPersons);
        System.out.println("Srednia wieku to " + ageAverage);
        for (int i = 0; i < listOfPersons.length; i++) {
            if (ageAverage > listOfPersons[i].age){
                System.out.println(listOfPersons[i].name);
            }
        }
    }

    public static double countAverage(Person[] listOfPersons) {
        double average = 0;
            for (int i = 0; i < listOfPersons.length; i++){
                average = average + listOfPersons[i].age / listOfPersons.length;
            }
        return average;
    }
}

