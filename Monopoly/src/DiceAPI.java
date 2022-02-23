//Interface class to ignore some content and emphasize dices rolls
public interface DiceAPI {
	
	public int[] getDice ();
	public int getTotal ();
	public boolean isDouble ();
	public String toString ();

}
