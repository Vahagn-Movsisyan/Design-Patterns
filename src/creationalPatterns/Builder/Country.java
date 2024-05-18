package creationalPatterns.Builder;

public class Country {

    private String name;
    private int phoneCode;

    public Country(String name, int phoneCode) {
        this.name = name;
        this.phoneCode = phoneCode;
    }

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", phoneCode=" + phoneCode +
                '}';
    }

    public static class Builder {

        private String name;
        private int phoneCode;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder phoneCode(int phoneCode) {
            this.phoneCode = phoneCode;
            return this;
        }

        public Country build() {
            return new Country(name, phoneCode);
        }
    }
}
