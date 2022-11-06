package 객체지향프로그래밍;

public class NewTubeSystem {
    public static void main(String[] arg) {

        User steve = new User();

        steve.setEmail("steve@codepresso.kr");
        steve.setPassword("123");
        steve.setNickname("steve");
        steve.setAge(22);

//    steve.printInfo();;

        if (steve.isOver20()) {
            System.out.println(("You can pay for subscription"));
        } else {
            System.out.println("you caannot payfor subscription");

        }
    }
}
