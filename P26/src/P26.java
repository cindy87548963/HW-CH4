
public class P26 {

	public static void main(String[] args) {
		Car cars[];
		cars=new Car[2];
		cars[0]=new Car();
		cars[1]=new RacingCar();
		for(int i=0;i<cars.length;i++) {
			Class c1=cars[i].getClass();
			System.out.println("��"+(i+1)+"�Ӫ������O�O"+c1);
		}
	}
}
class Car{
	protected int num;
	protected double gas;
	public Car() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
}
class RacingCar extends Car{
	public RacingCar() {
		System.out.println("�Ͳ��F�ɨ�");
	}
}