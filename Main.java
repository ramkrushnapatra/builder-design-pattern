public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Alice", "alice@example.com")
                .age(25)
                .address("New York")
                .build();

        user.display();
    }
}
