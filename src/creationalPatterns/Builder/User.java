package creationalPatterns.Builder;

public class User {

    private String username;
    private String email;
    private int age;
    private Country country;

    public User(String username, String email, int age, Country country) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.country = country;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", country=" + country +
                '}';
    }

    public static class Builder {
        private String username;
        private String email;
        private int age;
        private Country country;

        public Builder userName(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder country(Country country) {
            this.country = country;
            return this;
        }

        public User build() {
            return new User(username, email, age, country);
        }
    }
}
