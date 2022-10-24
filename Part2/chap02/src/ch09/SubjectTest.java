package ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        studentLee.setMathSubject("수학", 99);
        studentLee.setKoreaSubject("국어", 100);

        Student studentKim = new Student(100, "Kim");
        studentKim.setMathSubject("수학", 50);
        studentKim.setKoreaSubject("국어", 65);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
