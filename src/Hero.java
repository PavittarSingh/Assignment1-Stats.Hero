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
	
	
	// CONSTRUCTOR 
	public Hero(String name) 
	{
		this.name = name;
		generateAbilties();
	}
	
	
	
	// PRIVATE METHODS 
	private void generateAbilties() {
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	
	// FIGHT METHODS
		public void fight()
		{
			if(hitAttempt()==true){
			System.out.println(this.name + " did damage "+ hitDamage() );
				
			}
			
			else{
			System.out.println(this.name + "Missed the Attack");
			}
		}
		
		//HIT ATTEMPT METHOD
		private boolean hitAttempt()
		{
			if(Math.random()*10 >= 2){
				return false;
			}else{
				return true;
			}
		}
		
		//HIT DAMAGED METHOD
		private int hitDamage()
		{
			int damage = (int)(Math.random() * 6 + 1);
			int damageDid = damage * strength;
			return damageDid;
		}
		
		//SHOW METHOD
		public void show()
		{
			System.out.println ("Strength: " + this.strength);
			System.out.println ("Speed: " + this.speed);
			System.out.println ("health: " + this.health);
		}

	}


