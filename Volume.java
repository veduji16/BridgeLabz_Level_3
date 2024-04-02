public class Volume {
    public static double calculateVolume() {
        double length = 10.0;
        double breadth = 8.0;
        double height = 15.0;

        double volume = length * breadth * height;
        return volume;
    }

    public static void main(String[] args) {
        double result = calculateVolume();
        System.out.println("Volume: " + result);
    }
}
