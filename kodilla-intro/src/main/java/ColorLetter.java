public class ColorLetter {
    public static void main(String[] args) {
        String letter = UserDialogs.getFirstLetter();

        switch(letter) {
            case "Y":
                System.out.println("Yellow");
                break;
            case "R":
                System.out.println("Red");
                break;
            case "B":
                System.out.println("Blue");
                break;
            case "O":
                System.out.println("Orange");
                break;
            default:
                System.out.println("We didn't find this color");
        }
    }
}
