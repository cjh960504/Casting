package casting;

public class Human extends Animal implements Job{
	boolean isMarried;
	int money;
	
	public Human(String name, int age, boolean isMarried, int money) {
		super(name, age);
		this.isMarried = isMarried;
		this.money = money;
	}
	
	@Override
	public void thinking() {
		System.out.println("나는 인간이라 높은 수준의 생각을 한다.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\tisMarried : " + this.isMarried + "\tmoney : " + this.money;
	}
	
	@Override
	public void working() {
		System.out.println("프로그래밍을 한다.");
	}
}
