
public class BMICalculator {
	public static void main(String[] args) {
		double height = 5.4;
		double weight = 60;

		double heightinMeters = height * 0.4536;

		double BMI = weight / (heightinMeters * heightinMeters);

		System.out.println("BMI : " + BMI);

	}
}
