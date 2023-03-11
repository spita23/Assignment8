public class Author {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    Author(String name) {
        this.name = name;
    }
}
