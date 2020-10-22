
public class Test {

	public static void main(String[] args) {
		
		
		Motor motor1 = new Motor(120);
		Motor motor2 = new Motor(70);
		Moto moto = new Moto("ASD", 0, motor1);
		
		
		System.out.println(moto.getKmARecorrer(5, true));
		
		moto.setMotor(motor2);
		System.out.println(moto.getKmARecorrer(5, false));
		
		Moto moto2 = new MotoTodoTerreno("ASDASD", 0, motor2.clone());
		
		System.out.println(moto2.getKmARecorrer(5, false));
		
		
		
		
	}

}
