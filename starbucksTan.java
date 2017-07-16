
public class starbucksTan 
{
	public static Object value;
	private String Name, Drink;
	private int Ticket;
	
		
	/**
	 * constructor
	 * @param ticket
	 * @param name
	 * @param drink
	 */
	public starbucksTan(int ticket, String name, String drink) 
	{
		super();
		Ticket = ticket;
		Name = name;
		Drink = drink;
	}

	/**
	 * @return ticket number
	 */
	public int getTicket() {
		return Ticket;
	}

	/**
	 * @param ticket
	 */
	public void setTicket(int ticket) {
		Ticket = ticket;
	}

	/**
	 * @return customer's name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return orders made
	 */
	public String getDrink() {
		return Drink;
	}

	/**
	 * @param drink
	 */
	public void setDrink(String drink) {
		Drink = drink;
	}

	public String toString() {
		return "starbucksTan [Ticket=" + Ticket + ", Name=" + Name + ", Drink="
				+ Drink + "]";
	}
	
	
}
