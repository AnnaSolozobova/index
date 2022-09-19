public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weight = 54;

        double height = 1.58;

        double bodyMassIndex = service.calculate(weight,height);

        System.out.println("Индекс массы тела: " + bodyMassIndex);

    }
}
