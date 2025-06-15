package OOPSpracticePolymorphism;

public class App {
	
	public static void Refer(Robot r){
		r.machine();
		r.functioning();
		if(r instanceof ChefRobot){
			((ChefRobot)r).tools();
		}
		else{
			((DoctorRobot)r).cost();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChefRobot ch=new ChefRobot();
		DoctorRobot dr=new DoctorRobot();
		Refer(ch);
		Refer(dr);
	}

}
