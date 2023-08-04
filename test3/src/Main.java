import java.util.Scanner;

public class Main {
    enum Weekdays {monday, tuesday, wednesday, thursday, friday, saturday, sunday}

    public static void main(String[] args) {
        Weekdays weekDays = Weekdays.saturday;
        System.out.println("Give me a weekday and I sing you a song");
        switch (weekDays) {
            case monday:
                System.out.println("Monday, monday, so good to me, it was all I hope it would be");
                break;
            case tuesday:
                System.out.println("Tuesday! something, something, Tuesday!");
                break;
            case wednesday:
                System.out.println("tip: the Adams Family. Ok, not actually a song");
                break;
            case thursday:
                System.out.println("Sorry, no song");
                break;
            case friday:
                System.out.println("I go out on ... night");
                break;
            case saturday:
                System.out.println("And I get home ... morning");
                break;
            case sunday:
                System.out.println("Quite easy, easy like a ... morning");
                break;
        }

    }
}