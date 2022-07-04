package udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {
	byte myByteValue = 2;
    short myShortValue = 3;
    int myIntValue = 10;
    long myLongValue = 50000 + (myByteValue *10) + (myShortValue * 10) + (myIntValue *10);

        System.out.println(myLongValue);
    }
}
