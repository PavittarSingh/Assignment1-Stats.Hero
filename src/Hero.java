/***
 * @author: Pavittar Singh
 * @version: 2015/01/29
 * @assignment: 1st
 * @purpose: Used Mathods to find out the hero's status while fighting there is a 20% chance the Hero will hit their
 *           target. Display the result about damage happend and missed the attacks.
 *
 */
public class Hero {
	// PRIVATE PROPERTIES 
	protected int strength;
	protected int speed;
	private int health;
	
	
	// PUBLIC PROPERTIES 
	public String name;
	
	
	/***
	 *  CONSTRUCTOR 
	 * @param name
	 * Purpose: Initite the name of the hero .
	 */
	public Hero(String name) 
	{
		this.name = name;
		generateAbilties();
	}
	
	
	
	/***
	 * Private Mathod
	 * purpose: used to display the hero's abilities which are the random numbers. 
	 */
	private void generateAbilties() {
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	
	/***
	 *  FIGHT METHODS
	 *  purpose: Used to figureout, Hero attacked or not as based on hit attempt. 
	 *  display the missed attack.
	 */
		public void fight()
		{
			if(hitAttempt()==true){
			System.out.println(this.name + " Attacked !!! ");
			System.out.println(this.name +" Did the Damage of " + hitDamage());
				
			}
			
			else{
			System.out.println(this.name + " Missed the Attack");
			}
		}
		
		/***
		 * HIT ATTEMPT METHOD 
		 * purpose: Used for figure out hero gonna be hit or not as per based on the possibilites 20%
		 * @return ture or false
		 */
		private boolean hitAttempt()
		{
			if(Math.random()*10 >= 2){
				return false;
			}else{
				return true;
			}
		}
		
		/***
		 * HIT DAMAGED METHOD
		 * purpose: Used to identify the attempted damage on hero.
		 * @return: 
		 */
		private int hitDamage()
		{
			int damage = (int)(Math.random() * 6 + 1);
			int damageDid = damage * strength;
			return damageDid;
		}
		
		/***
		 * SHOW METHOD 
		 * Used for display the value of the hero's abilities with proper stats.
		 */
		
		public void show()
		{
			System.out.println ("Strength: " + this.strength);
			System.out.println ("Speed: " + this.speed);
			System.out.println ("health: " + this.health);
		}

	}


