package 생성자;

public class NewTubeSystem {
    public static void main(String[] args) {
        User steve = new User( email: "s@s.kr", password: "123", nickname: "s", age: 22);
        steve.printInfo();
    }
}
