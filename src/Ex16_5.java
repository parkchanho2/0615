
class HandPhone{
	protected String model;
	protected String number;
	
	public HandPhone() {}
	public HandPhone(String model, String number) {
		this.model = model;
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public String getNumber() {
		return number;
	}
}

class DicaPhone extends HandPhone{
	protected String pixel;
	public DicaPhone() {}
	public DicaPhone(String model, String number, String pixel) {
		super(model, number);
		
		this.pixel = pixel;
		
	}
	public void prnDicaPhone() {
		System.out.println("모델명: " + model);
		System.out.println("번호: " + number);
		System.out.println("화소수: " + pixel);
	}
}
public class Ex16_5 {
	public static void main(String[] args) {
		DicaPhone dp = new DicaPhone("갤럭시", "010", "1024");
		dp.prnDicaPhone();
	}
}



