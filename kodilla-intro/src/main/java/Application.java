public class Application {
    public static void main(String[] args) {
    User user = new User("adam", 40.5, 178);
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.height);
        user.userInformation();
}
}
