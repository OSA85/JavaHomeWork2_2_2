public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.72;
        double weight = 110;
        double bodyMassIndex = service.calculate(height, weight);
        System.out.println("Индекс массы тела : " + bodyMassIndex);
    }
}
