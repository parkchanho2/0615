//업캐스팅,다운캐스팅을 할 수 있는지 판단하는 연산자가 instanceof 이다. 주로 if조건문과 함꼐 사용한다.

// 사용형식)
// if(참조변수 instanceof타입){
// 참조변수가 주어진 타입으로 업캐스팅/ 다운캐스팅이 가능한가 유무에서 참이면 업캐스팅, 다운캐스팅을 한다.
// }
// 결국 instanceof는 업캐스팅/ 다운캐스팅 유무 판단 연산자이다. 즉 형변환 유무 판단연산자.

class HandPhone1{
	String model;
	String number;
	
	public HandPhone1() {}
	
	public HandPhone1(String model, String number) {
		this.model = model;
		this.number = number;
		
	}
}

class DicaPhone1 extends HandPhone1{
	String pixel;
	
	public DicaPhone1() {}
	
	public DicaPhone1(String model, String number, String pixel) {
		super(model, number);
		this.pixel = pixel;
	}
	
	public void pr() {
		System.out.println("폰모델: " + model);
		System.out.println("폰번호: " + number);
		System.out.println("화소수: " + pixel);
	}
}

public class CastingEx15 {
	public static void main(String[] args) {
		DicaPhone1 d = new DicaPhone1("갤럭시","010","1004");
		d.pr();
		
		if(d instanceof HandPhone1) { // dp가 업캐스팅이 가능한가 
			System.out.println("업캐스팅 가능");
			
			HandPhone1 hp = d;// 업캐스팅
		}else {
			System.out.println("업캐스팅 불가능");
		}
		System.out.println("==========================================");
		
		HandPhone1 hp = new HandPhone1(); // 사전에 업캐스팅을 안함 -> instanceof 연산자를 사용하는 목적
		if(hp instanceof DicaPhone1) { // hp 다운캐스팅이 가능한가 ? 불가능함 사전에 업캐스팅을 안해서
			System.out.println("업캐스팅 안해서 다운캐스팅 불가");
			DicaPhone1 dp = (DicaPhone1) hp; // 명시적인 다운캐스팅
		}else {
			System.out.println("다운캐스팅 불가"); // if else => instanceof 연산자를 잘 사용하면 캐스팅 연산 예외 오류 방지 가능
		}
	}
}















