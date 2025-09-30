public class grilFriend {
    private int age;
    private String name;

    public grilFriend(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public grilFriend() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18||age>40) {
            throw new RuntimeException();
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <2 || name.length() > 10) {
            throw new RuntimeException();
        }
        this.name = name;
    }

    public String toString() {
        return "age: " + age + ", name: " + name;
    }
}
