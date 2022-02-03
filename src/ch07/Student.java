package ch07;

public class Student extends People{
    public int studentNo;

    public Student(String name, String ssn, int studentNo) {
        // 부모 생성자를 호출해줘야 함
        super(name, ssn);
        this.studentNo = studentNo;
    }
}
