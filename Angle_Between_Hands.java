import java.util.Scanner;

public class ClockAngle { // Corrected class name
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String time = obj.next();

    String[] timeParts = time.split(":");
    int hour = Integer.parseInt(timeParts[0]);
    int minute = Integer.parseInt(timeParts[1]);

    int minutesAngle = minute * 6;

    // Traditional clock calculation (adjust if needed)
    double hourAngle = (hour * 30) + (minute * 0.5); // 0.5 degrees per minute contribution

    double angle = Math.abs(hourAngle - minutesAngle);
    double minAngle = Math.min(angle, 360 - angle);

    System.out.print(minAngle);
  }
}
