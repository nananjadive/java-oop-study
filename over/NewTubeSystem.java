
public class NewTubeSystem {
    public static void main(String[] args) {
        User steve = new User(email: "s@s.kr",
            password: "123",
            nickname: "steve",
            age: 19);
    }
    System.out.println(steve.isAdult());
    System.out.prinln(steve.isAdult(age:18))
}
}