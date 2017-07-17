
public class queueTan {
	private int maxSize, front, rear, nItems;
	private starbucksTan[] queArray;
		
	
	/**
	 * initialize variables
	 * @param s 
	 */
	public queueTan(int s)
	{
		maxSize = s;
		queArray = new starbucksTan [maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	
	/**
	 * enqueue adds a new item to the queue, queue is modified
	 * @param myOrders 
	 */
	public void enqueue(starbucksTan myOrders)
	{
	
				
		//item can not be entered as it exceed the maximum limit of the queue
		if(nItems == maxSize){
			System.out.println("Data could not enter. Queue overflow.");
			return;
		}
		
		//deal with wraparound
		//moves the queue to the start of the array whenever 
		//it reaches the end
		if (rear == maxSize-1)
			rear = -1;
		//increment rear and insert
		queArray[++rear] = myOrders;
		nItems++;	
		System.out.println(myOrders);
	}

	
	/**
	 * dequeue removes and returns an item, queue is modified
	 * @return the deleted item starting from the front of queue
	 */
	public starbucksTan dequeue()
	{
		if(nItems == 0)
			return null; 
		
		//get value and incr front
		starbucksTan temp = queArray[front++];
		//deal with wrap around
		if (front == maxSize)
			front = 0;
		nItems--;
		System.out.println(temp);
		return temp;
	}
	
	/**
	 * display the item at the front of the queue, queue is not modified
	 * @return the item at the front of the queue
	 */
	public starbucksTan peekFront()
	{
		System.out.print("Front of the queue: ");
		System.out.println(queArray[front]);
		return queArray[front];
	}
	
	/**
	 * Is the queue empty?
	 * @return true if this queue is empty; false otherwise
	 */
	public boolean isEmpty()
	{
		System.out.print("Is my queue empty? ");
		if(nItems ==0)
			return true;
		else
			return false;
	}
	
	/**
	 * Is the queue full?
	 * @return true if this queue is full; false otherwise
	 */
	public boolean isFull()
	{
		System.out.print("Is my queue full? ");
		if(nItems == maxSize)
			return true;
		else
			return false;
	}
	
	/**
	 * display the size of the queue
	 * @return the current size of the queue
	 */
	public int size()
	{
		System.out.print("Queue size: ");
		System.out.println(nItems);
		System.out.println(" ");
		return nItems;
	}
	
}	//end class queue
