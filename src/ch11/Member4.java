package ch11;

public class Member4 {
    private String id;
    private String name;

    public Member4(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
}
