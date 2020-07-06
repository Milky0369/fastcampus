package gamelevel;

public class PlayerLevelTest {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		p1.upGradeLevel(aLevel);
		p1.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		p1.upGradeLevel(sLevel);
		p1.play(3);
		
	}
	
}
