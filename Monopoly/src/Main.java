//Creates new game, first name function, starting money, starting play, starts game, checks if game is over, and decides winner
public class Main {

	public static void main (String args[]) {	
		
		Monopoly monopoly = new Monopoly(args);		
		monopoly.inputNames();
		monopoly.giveStartMoney();
		monopoly.decideStarter();
		do {
			monopoly.processTurn();
			if (!monopoly.isGameOver()) {
				monopoly.nextPlayer();
			}
		} while (!monopoly.isGameOver());
		monopoly.decideWinner();
		monopoly.displayGameOver();
		return;
	}
	
}
