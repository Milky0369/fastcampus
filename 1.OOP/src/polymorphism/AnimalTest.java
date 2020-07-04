package polymorphism;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eatting() {
		
	}

}

class Human extends Animal {
	
	public void move() {
		System.out.println("사람이 두발로 겉습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
	
}

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
//		Eagle eagle = (Eagle)hAnimal; // 형변환 에러
		
//		if(hAnimal instanceof Eagle) { // 다운캐스팅을 통해 검사
//			Eagle eagle = (Eagle)hAnimal;
//		} else if (hAnimal instanceof Human) {
//			Human human = (Human)hAnimal;
//			human.readBooks();
//		}
		
//		Human human = (Human)hAnimal;
//		human.readBooks();
		

		
//		AnimalTest test = new AnimalTest();
//		
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
//		for(Animal a : animalList) {
//			a.move();
//		}
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		
		for(int i = 0; i < list.size(); i++) {
			Animal ani = list.get(i);
			
			if(ani instanceof Human) {
				Human human = (Human)ani;
				human.readBooks();
			} else if (ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
			} else if (ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.flying();
			}
		}
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}