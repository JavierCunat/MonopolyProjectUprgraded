//Groups related methods with empty bodys, hides certain details and only shows the important details of the object - Acts like an API by grabbing the data
public interface BoardAPI {

	
	public Square getSquare (int index);
	public Property getProperty (int index);
	public Property getProperty (String shortName);
	public boolean isProperty (int index); 
	public boolean isProperty (String shortName);
	public boolean isSite (String shortName);
	public boolean isStation (String shortName);
	public boolean isUtility (String shortName);
	
}
