package casting;

public class Main {

	public static void main(String[] args) {
		//오버라이딩
		//Casting 예 https://docs.oracle.com/javase/8/docs/api/   => ArrayList
		//instanceOf
		
		upCasting();
		downCasting();
		
		castingPlay();
		instaceOfCheck(); 
	}
	
	public static void upCasting() {
		//업캐스팅 : Up, 위(부모)로 변형
		Animal castedAnimal = new Human("최준혁", 28, false, 0);
		castedAnimal.thinking();
		System.out.println(castedAnimal.toString());
		
		//주석을 풀면?
		//castedAnimal.working(); 
	}
	
	public static void downCasting() {
		//다운캐스팅 : Down, 아래(자식)로 변형
		//자신의 고유한 특성을 잃은 서브클래스의 객체를 다시 복구시켜주는 것을 말함.
		//다운캐스팅이 되려면 업캐스팅이 한번 이루어진 부모 객체만이 가능하다.
		Animal animal = new Tiger("춘식이", 5, 3, "백색");
		Tiger castedTiger = (Tiger) animal; 
		castedTiger.thinking();
		System.out.println(castedTiger.toString());
		
		//같은 자식들끼리 형변환은?
//		Human castedHuman = (Human) animal; 
//		castedHuman.thinking();
//		castedHuman.toString();
	}
	
	public static void castingPlay() {
		Animal[] animals = new Animal[3];
//		Animal[] animals = {};
		
		animals[0] = new Human("최준혁", 28, false, 0);
		animals[1] = new Tiger("춘식이", 5, 3, "백색");
		animals[2] = new Animal("그냥동물", 999);
		
		
		System.out.println("##########Casting Start##########");
		for(Animal animal : animals) {
			//부모의 자료형만 알아도 자식 클래스의 오버라이드된 메서드들을 그냥 사용할 수 있다!! 다형성!!
			animal.thinking();
			System.out.println(animal.toString());
		}
		System.out.println("##########Casting End##########");
	}
	
	public static void instaceOfCheck() {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Human("최준혁", 28, false, 0);
		animals[1] = new Tiger("춘식이", 5, 3, "백색");
		animals[2] = new Animal("그냥동물", 999);
		
		
		System.out.println("##########instaceOf Start##########");
		for(Animal animal : animals) {
			if(animal instanceof Animal) {
				System.out.println(animal.getName() + "is Animal");
			}
			if(animal instanceof Human) {
				System.out.println(animal.getName() + "is Human");
			}
			if(animal instanceof Tiger) {
				System.out.println(animal.getName() + "is Tiger");
			}
		}
		System.out.println("##########instaceOf End##########");
	}
}
