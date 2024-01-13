import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        //creating offsets
        OffsetDateTime offsetDateTime1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime offsetDateTime2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        //checking dates methods
        boolean time1BeforeTime2 = offsetDateTime1.isBefore(offsetDateTime2);
        boolean time2AfterTime1 = offsetDateTime2.isAfter(offsetDateTime1);
        boolean areTimeEquals = offsetDateTime1.isEqual(OffsetDateTime.now()) && offsetDateTime2.isEqual(OffsetDateTime.now());

        //printing
        System.out.println("Date1 is before date2: " + time1BeforeTime2);
        System.out.println("Date2 is after date1: " + time2AfterTime1);
        System.out.println("Date1 and Date2 are equal to current date: " + areTimeEquals);
    }
}
