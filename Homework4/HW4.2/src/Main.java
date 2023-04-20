public class Main {
    public static void main(String[] args) {
        BmiService  service = new BmiService ();
        double height = 1.75;
        int weight = 92;
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}