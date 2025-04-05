public class User {

    private String name;
    private String email;

    private int age;
    private String address;


    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.address = builder.address;
    }

    public void display() {
        System.out.println("Name: " + name + ", Email: " + email + ", Age: " + age + ", Address: " + address);
    }

    // Static nested Builder class
    public static class UserBuilder {
        private String name;
        private String email;
        private int age;
        private String address;

        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
