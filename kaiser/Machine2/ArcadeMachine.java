package Machine2;

public class ArcadeMachine implements Coinable, Dispensable {
int coins;
public ArcadeMachine() {
	this.coins = 0;
}
	@Override
	public void dispense() {
		
		System.out.println("1 coin inserted\n [Ready to Play]");
		System.out.println("GAME OVER!");
		coins++;
		
	}
	
	@Override
	public boolean insertCoin() {
		// TODO Auto-generated method stub
		this.dispense();
		
		return true;
	}

}
