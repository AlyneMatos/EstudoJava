public class Quarto {
    private  String email;
    private String name;

    public Quarto(String email, String name) {
        this.email = email;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
