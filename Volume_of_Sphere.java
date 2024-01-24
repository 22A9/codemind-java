import java.util.*;
public class VolumeofSphere {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int r = obj.nextInt();
        Double volume = (4.0 / 3.0) * 3.14 * r * r * r;
        System.out.format("%.2f",volume);
    }
}
