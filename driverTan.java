
public class driverTan 
{
	public static void main(String[] args)
	{
		//create a queue of size 100
		queueTan myDriver = new queueTan(100);
		
		starbucksTan drink1 = new starbucksTan(1, "Shelly", "Ice Latte");
		starbucksTan drink6 = new starbucksTan(6, "Mike", "Chai Latte");
		starbucksTan drink7 = new starbucksTan(7, "Belle", "White Chocolate Mocha");
		starbucksTan drink10 = new starbucksTan(10, "Shikin", "Java Chip Frappuccino");
				
		//entering all my orders 
		System.out.println("Entering orders:");
		myDriver.enqueue(drink1);
		myDriver.enqueue(drink6);
		myDriver.enqueue(drink7);
		myDriver.enqueue(drink10);
				
		System.out.println(" ");
		
		//display current size of queue
		myDriver.size();
		
		//is my queue full?
		//displays FASLE because my queue size is 100, but only 6 items entered
		System.out.println(myDriver.isFull());
		System.out.println(" ");
		
		//remove several items from queue after orders being processed
		System.out.println("Orders being processed: ");
		myDriver.dequeue();
		myDriver.dequeue();
		System.out.println(" ");
		
		//display current size of queue
		myDriver.size();
		
		starbucksTan drink12 = new starbucksTan(12, "Lopez", "Iced Americano");
		starbucksTan drink18 = new starbucksTan(18, "Nathan", "Midnight Mint Mocha");
		myDriver.enqueue(drink12);
		myDriver.enqueue(drink18);
				
		//display current size of queue
		myDriver.size();
				
		//display orders first in line in my remaining queue
		myDriver.peekFront();
		System.out.println(" ");
		
		//remove several items from queue after orders being processed
		System.out.println("Orders being processed: ");
		myDriver.dequeue();
		System.out.println(" ");
		
		//display orders first in line in my remaining queue
		myDriver.peekFront();
		System.out.println(" ");
		
		//display current size of queue
		myDriver.size();
				
		//is my queue empty?
		//displays FASLE because my queue size is 100, but only 6 items entered
		System.out.println(myDriver.isEmpty());
	
	}
}




