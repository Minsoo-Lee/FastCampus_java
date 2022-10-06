package ch08;

public class Person {
    int height;
    int weight;
    String name;
    String gender;
    int age;

    public Person(int height, int weight, String name, String gender, int age) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("키가 " + height + "이고 몸무게가 " + weight + "인 " + gender + "이 있습니다. "
         + "이름은 " + name + "이고 나이는 " + age + "세입니다.");
    }
}
