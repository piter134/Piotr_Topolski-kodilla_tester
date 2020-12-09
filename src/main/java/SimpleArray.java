public class SimpleArray {
    public static void main(String[] args) {
        String[] plants = new String[6];
        plants[0] = "Pogostemon erectus";
        plants[1] = "Rotala Yao Yai";
        plants[2] = "Rotala hr'a";
        plants[3] = "Eleocharis Parvula";
        plants[4] = "Bucephalandra sp.";
        plants[5] = "Myriophyllum sp. guyana";
        String plant = plants[3];
        System.out.println(plant);
        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }
    }
}