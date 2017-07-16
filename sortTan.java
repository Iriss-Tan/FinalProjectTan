
class sortTan {
	private starbucksTan[] a; // ref to array a
	private int nElems; // number of data items
	
	/**
	 * constructor
	 * @param max
	 */
	public sortTan(int max) 
	{
		a = new starbucksTan[max]; // create the array
		nElems = 0; // no items yet
	}

	
	/**
	 * entering orders made in Starbucks today
	 * @param value
	 */
	public void insert(starbucksTan value) 
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

	
	/**
	 * display orders made in Starbucks today
	 */
	public void display() 
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.println(a[j] + " "); // display it
		System.out.println("");
	}

	
	/**
	 * Sort my orders based on ticket number using insertion sort
	 */
	public void insertionSort() {
		int in, out;
		for (out = 1; out < nElems; out++) // out is dividing line
		{
			starbucksTan temp = a[out]; // remove marked item
			in = out; // start shifts at out
			while (in > 0 && a[in - 1].getTicket() > temp.getTicket()) // until one is smaller,
			{
				a[in] = a[in - 1]; // shift item to right
				--in; // go left one position
			}

			a[in] = temp; // insert marked item
		} 
	} 
	
	
	/**
	 * find ticket number
	 * @param driverKey
	 * @return receipt 
	 */
	public boolean findTicket(int ft)
	{
		for (int i=0; i<nElems; i++)
		{
			if(a[i].getTicket() == ft)
				return true;
		}
		return false;
		
	}
	
	/**
	 * get the index of ticket number
	 * @param driverKey
	 * @return index of the ticket number that you are looking for
	 */
	public int getIndex(int gi)
	{
		for(int i=0; i<nElems-1; i++)
		{
			if(a[i].getTicket() == gi)
				return i;
		}
		return -1;
	}
	
	/**
	 * remove ticket when customer's order being canceled, given if ticket number exists
	 * @param driverKey
	 * @return the deleted receipt
	 */
	public starbucksTan removeTicket(int rt)
	{
		if(findTicket(rt))
		{
			int index = getIndex(rt); 
			starbucksTan tempR = a[index];
			for (int i=index; i<nElems-1; i++)
			{
				a[i] = a[i+1];
			}
			nElems--;
			return tempR;
		}
		else
			return null;
	}
	
		
} 

class InsertSortApp {
	public static void main(String[] args) {
		int maxSize = 100; // array size
		sortTan arr; // reference to array
		arr = new sortTan(maxSize); // create the array
		
				 
		starbucksTan drink1 = new starbucksTan(1, "Shelly", "Ice Latte");
		starbucksTan drink6 = new starbucksTan(6, "Mike", "Chai Latte");
		starbucksTan drink7 = new starbucksTan(7, "Belle", "White Chocolate Mocha");
		starbucksTan drink10 = new starbucksTan(10, "Shikin", "Java Chip Frappuccino");
		starbucksTan drink12 = new starbucksTan(12, "Lopez", "Iced Americano");
		starbucksTan drink18 = new starbucksTan(18, "Nathan", "Midnight Mint Mocha");
		starbucksTan drink11 = new starbucksTan (2, "Evelyn", "S'mores Frappuccino");
		starbucksTan drink2 = new starbucksTan (4, "Lucy", "Iced Americano");
		starbucksTan drink9 = new starbucksTan (9, "Jack", "Chai Latte");
		starbucksTan drink4 = new starbucksTan (11, "Gebissa", "Iced Latte");
		starbucksTan drink20 = new starbucksTan (20, "Helen", "Java Chip Frappuccino");
				
		//insert orders made in Starbucks today
		arr.insert(drink1);
		arr.insert(drink6);
		arr.insert(drink7);
		arr.insert(drink10);
		arr.insert(drink12);
		arr.insert(drink18);
		arr.insert(drink11);
		arr.insert(drink2);
		arr.insert(drink9);
		arr.insert(drink4);
		arr.insert(drink20);

		// display items before sort
		System.out.println("Before insertion sort:");
		arr.display(); 
		
		//display items after sort based on ticket number
		System.out.println("After insertion sort:");		
		arr.insertionSort(); 
		arr.display(); 
		
		//check if ticket number exists
		System.out.print("Is ticket number 20 in my queue? ");
		System.out.println(arr.findTicket(20));
		
		System.out.print("Is ticket number 11 in my queue? ");
		System.out.println(arr.findTicket(11));
		
		//ticket number 30 is invalid, it will display FALSE
		System.out.print("Is ticket number 30 in my queue? ");
		System.out.println(arr.findTicket(30));
		
		//removing tickets due to orders being canceled
		arr.removeTicket(1);
		arr.removeTicket(11);
		arr.removeTicket(9);		
		
		System.out.println(" ");
		
		System.out.print("After removing ticket number 1, 9, and 11 ");
		System.out.println("due to customer's order being canceled: ");
		arr.display();
		
	} 
}