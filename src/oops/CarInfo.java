package oops;

public class CarInfo {

	public static void main(String[] args) {
		Car modify=new Car();
		modify.carcompony="Tesla";
		modify.carname="Tesla Model 3";
		modify.price=60;
		modify.validate=18;
		modify.getCarInfo();
		modify.carSpecification();
	}

}
