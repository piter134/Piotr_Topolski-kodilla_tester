public class NotebookInitialization {
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
    }
}
