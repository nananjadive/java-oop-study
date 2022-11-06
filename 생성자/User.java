package 생성자;

public class User {
    private String email;
    private String password;
    private String nickname;
    private int age;

    public User(String email, String password, String nickname, int age) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.age =age;
    }
}

