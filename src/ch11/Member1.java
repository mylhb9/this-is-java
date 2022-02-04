package ch11;

public class Member1 implements Cloneable{
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Member1(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    public Member1 getMember() {
        Member1 cloned = null;
        try {
            cloned = (Member1) clone();
        } catch (CloneNotSupportedException e) { }
        return cloned;
    }
}
