package 객체지향프로그래밍;

public class User {
    private String email;
    private String password;
    private String nickname;
    private int age;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;// 검증로직 추가가능
        if (age < 0) {
            age = 0;
        } else if (age > 120) {
            age = 120;
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public boolean isOver20() {
        return age >= 20;
    }

}//return 문은 적게 유지하는것이 좋다 why 종료조건을 이해하기 쉽지 않기 때문에
//        if (age < 20) {
//            System.out.println("\n" + nickname + " is under 20");
//        } else {
//            System.out.println("\n" + nickname + "is over 20");
//        }


    //    public void setEmail(String email) {
//        this.email = email;->code generate setter 자동생성
//    }
//    public void printInfo(){
//        System.out.println(); {
//            System.out.println("UserInfo" +
//                    "\nemail: " +email +
//                    "\nnickname: " + nickname +
//                    "\nage " + age);
//        }

//        public String getEmail() {
//            return email;->code generate getter
//        } steve. ->setter4 getter4 - 접근가능



