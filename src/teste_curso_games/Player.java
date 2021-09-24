package teste_curso_games;

public class Player {
	
	public int vida = 10;
	public String nome = "André";

	public void perderVida() {
		
		vida--; // ou vida-=1
		
	}
	
	public void ganharVida() {
		
		vida++; // ou vida +=1
		
	}
	
}
