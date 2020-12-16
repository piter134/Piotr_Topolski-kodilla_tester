public class GradesInitialization {
    public static void main(String[] args) {
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
