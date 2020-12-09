public class Person {
    public static void main(String[] args) {
        // zmienne
        String myName = "Piotr Topolski";
        String partnerName = "Aleksandra Skindzier";
        int myAge = 28;
        int partnerAge = 28;
        String mySex = "męższczyzna";
        boolean isAdoult = true;
        double myWeight = 68.5;

        // kod
        sayHello();
        System.out.println("Roznica wieku: " + ageDiffrence(myAge, partnerAge));

        // 1. jesli ty jestes starszy, wyswietl:
        // [Imie], jest starszy niz [imie]
        // 2. Jesli ty jestes mlodszy, wyswietl:
        // [Imie], jest mlodszy niz [imie]
        // 3. W innym wypadku wyswietl:
        // [Imie] i [imie], sa rowiesnikami.
        if (myAge > partnerAge){
            System.out.println(myName + " Is older then " + partnerName);
        } else if (myAge < partnerAge){
            System.out.println(myName + " Is younger then " + partnerName);
        } else {
            System.out.println(myName + " And " + partnerName + " Are equal ");
        }
    }
    private static void sayHello() {
        System.out.println("Hello");
    };
    private static int ageDiffrence(int ageA,int ageB ) {
        int diffrence = ageA - ageB;

        return diffrence;
    }


};

