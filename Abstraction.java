package codes;

abstract class Abstract
{
	public String game_Name;
	public int game_Rounds;
	abstract void play();
	
	Abstract(String game_Name,int game_Rounds)
	{
		this.game_Name = game_Name;
		this.game_Rounds = game_Rounds;
	}
}

public class Abstraction extends Abstract{
	
	Abstraction(String game_Name, int game_Rounds) 
	{
		super(game_Name, game_Rounds);
	}

	public void play()
	{
		System.out.println("Game_Name : " + game_Name);
		System.out.println("Game_Rounds : "+ game_Rounds);
	}
	
	public static void main(String[] args)
	{
		Abstraction abs = new Abstraction("TicTac",5);
		abs.play();
	}
}