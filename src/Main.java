public class Main {

    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double heightInMeters = 1.87;
        double weightInKilograms = 98.0;

        int bmi = bmiService.calculate(heightInMeters, weightInKilograms);

        System.out.println("Ваш ИМТ: " + bmi);
    }
}
