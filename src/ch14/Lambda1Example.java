package ch14;

import java.util.function.ToDoubleFunction;

public class Lambda1Example {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("버민", 95, 97)
    };

    public static double avg(ToDoubleFunction<Student> function) {
        double sum = 0;
        for(Student student : students) {
            sum += function.applyAsDouble(student);
        }
        double avg = sum / students.length;
        return avg;
    }

    public static void main(String[] args) {
        double englsihAvg = avg(s->s.getEnglishScore());
//        double englsihAvg = avg(Student::getEnglishScore);
        System.out.println("영어 평균 점수: " + englsihAvg);

        double mathAvg = avg(s->s.getMathScore());
//        double mathAvg = avg(Student::getMathScore);
        System.out.println("수학 평균 점수: " + mathAvg);
    }

    public static class Student {
        private String name;
        private int englishScore;
        private int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public String getName() {
            return name;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }
    }
}
