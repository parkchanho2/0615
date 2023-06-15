
class Animal{
	protected String kind;
	protected int leg;
	
	public Animal() {}
	
	public Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	}
	public void getKind() {
		if(kind.equals("강아지")) {
			System.out.println(kind + " 는 동물 이다.");
		}else {
			System.out.println(kind + " 는 사람 이다.");
		}
	}
	public void walk() {
		if(leg == 4) {
			System.out.println(kind + " 는 " + leg + "발로 걷는다.");
		}else {
			System.out.println(kind + " 는 " + leg + "발로 걷는다.");
		}
	}
}
class Human extends Animal{
	public Human() {}
	
	public Human(String kind, int leg) {
		super(kind,leg);
	}
}
class Dog extends Animal{
	public Dog() {}
	
	public Dog(String kind, int leg) {
		super(kind,leg);
		
	}
}
public class Ex16_4 {
	public static void main(String[] args) {
		Dog d = new Dog("강아지", 4);
		Human h = new Human("소녀", 2);
		
		d.getKind();
		d.walk();
		
		h.getKind();
		h.walk();
	}
}




















