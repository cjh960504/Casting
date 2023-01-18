package casting;

public class Tiger extends Animal{
	int rank;
	String color;
	
	public Tiger(String name, int age, int rank, String color) {
		super(name, age);
		this.rank = rank;
		this.color = color;
	}
	
	@Override
	public void thinking() {
		System.out.println("어떤 동물을 사냥할 지 생각한다.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\trank : " + rank + "\tcolor : " + color;
	}
}
