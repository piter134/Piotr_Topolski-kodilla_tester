public class Application {
    public static void main(String[] args) {
    User user = new User("adam", 40.5, 178);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getHeight());
        user.userInformation();
}
}
