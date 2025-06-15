package OOPSpracticePolymorphism;

public class DoctorRobot extends Robot {
	@Override
	public void functioning(){
		System.out.println("It performs operation");
	}
	public void cost(){
		System.out.println("It charges $1000 for operation");
	}
}
