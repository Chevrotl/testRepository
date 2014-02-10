
/** 
 * Represente une lampe, d'un puissance et d'un état donné
 * @author chevrotl
 * 
 */


public class Bulb
{
	// Constante
	
	/** 
	 * Puissance par defaut
	 */
	public final static int DEFAULT_POWER = 100;
	
	//attributs
	
	/**
	 * Puissance
	 */
	private final int power;
	
	/**
	 * Etat de la lampe (allumee/eteinte)
	 */
	private boolean isLit;
	
	//constructeurs
	/**
	 * Renvoi une lampe d'une puissance initiale et eteinte.
	 */
	public Bulb()
	{
		this.power = DEFAULT_POWER;
		this.isLit = false ;
	}
	
	/**
	 * Renvoi une lampe avec une puissance donnee en parametre et eteinte.
	 * @param power0 Puissance de la lampe
	 */
	public Bulb(int power0)
	{
		this.power = power0 ;
		this.isLit = false ;
	}

	/**
	 * Renvoi une lampe avec la puissance par defaut et un etat donnee
	 * @param isLit0 Etat de la lampe
	 */
	public Bulb(boolean isLit0)
	{
		this.power = DEFAULT_POWER  ;
		this.isLit = isLit0 ;
	}
	
	//methodes
	
	/**
	 * Allume une lampe 
	 */
	public void switchOn()
	{
		this.isLit = true ;
	}

	/**
	 * Eteint une lampe
	 */
	public void switchOff()
	{
		this.isLit = false ;
	}
	
	/**
	 * Retourne la puissance de la lampe
	 * @return la puissance de la lampe
	 */
	public int getPower()
	{
		return(this.power);
	}
	
	/**
	 * Retourne l'etat de la lampe
	 * @return l'etat de la lampe
	 */
	
	public boolean isLit()
	{
		return(this.isLit);
	}
	
	
}
