package creationalPatterns.Builder;


public class BuilderTest {
    public static void main(String[] args) {

        Country country = new Country.Builder()
                .name("Armenia")
                .phoneCode(374)
                .build();

        User user = new User.Builder()
                .userName("Hunan")
                .email("hunan@gmail.com")
                .age(19)
                .country(country)
                .build();

        User user1 = new User.Builder()
                .userName("Jon")
                .email("jon@gmail.com")
                .build();

        System.out.println(user.toString());
        System.out.println();
        System.out.println(user1.toString());
    }
}
