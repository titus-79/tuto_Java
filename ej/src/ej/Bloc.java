package ej;

public class Bloc {
	
	private String description;
	
	
//	Bloc() {
//		this.description = "Ceci est un bloc du jeu Epicraft's Journey";
//	}
	
	public Bloc(final String description){
		this.description = description;
	}
	
	public void afficherDescription() {
		System.out.println(this.description);
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

}
