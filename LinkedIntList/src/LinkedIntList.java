import java.util.*;
/**
 * Uses ListNode class to create an int Linked List
 * 
 * @author Daniel Svirida
 * @version 1
 */
public class LinkedIntList {
	
	/** Front of the list */
	private ListNode front;
	
	/** Constructs an empty LinkedIntList */
	public LinkedIntList() {
		front = null;
	}
	
	/**
	 * Adds an integer to the end of the LinkedIntList
	 * 
	 * @param Int - The int desired to be added to the list
	 */
	public void add(int Int) {
		if(front != null) {                                  //Runs if the ListNode is null
			ListNode current = front;                        //First ListNode looked at is front
			while(current != null) {                         //Iterates while the current ListNode looked at is not null
				if(current.next == null) {                   //If the next ListNode that the current ListNode is pointing to is null
					current.next = new ListNode(Int);        //Desired int is put into the data field of a new ListNode
					                                         //last ListNode in list points to new ListNode
					current = current.next;                  //Updates current looked at ListNode, next update causes the current
				}                                            //looked at ListNode to be null, causing the while loop to end
				current = current.next;                      //Updates the current looked at ListNode
			}
		}
		
		if(front == null) {                                  //Runs if the front int has not been set yet
			front = new ListNode(0, new ListNode(Int));      //The front's next field points at the desired int in data field
		}	                                                 //(0 is a placeholder for the fronts data field)
	}
	
	/**
	 * Converts the list into a string
	 * 
	 * @return "[]" if the list is empty
	 * <p>     Otherwise the ListNodes are returned, 
	 *         with arrows pointing to the next ListNode
	 */
	public String toString() {
		if(front == null) {
			return "[]";
		}
		else {
			String list = "front -> ";
			ListNode current = front;
			while(current.next != null) {                    //Iterates until the ListNode in the next field of the current looked at ListNode is null
				current = current.next;                      //Updates current looked at ListNode
				list += current.data + " -> ";               //int from the current nodes data field added with arrow
			}
			list += "null";                                  //null added to the end to represent end of list 
			                                                 //and that the last node doesn't point to any node
			return list;                                     //Returns the constructed String representing the list
		}
	}
	
	/**
	 * Deletes the second to last int in the list
	 * 
	 * @return deleted - the number that was deleted from the list
	 * 
	 * @exception NoSuchElementException If the list is null
	 * @exception NoSuchElementException If the list size is less than 2
	 */
	public int delete2ndBack() {
		if(front == null) throw new NoSuchElementException("List is null");
		
		int size = -1;
		ListNode current = front;
		while(current != null) {                             //Counts how many nodes the list has, excluding the front node
			size++;
			current = current.next;
		}
		if(size < 2) throw new NoSuchElementException("List size is less than 2");
		
		current = front;
		for(int index = 0; index < (size - 2); index++) {    //Sets the currently looked at ListNode to the one 
			current = current.next;                          //before the node we want to remove
		}
		int deleted = current.next.data;                     //Stores the value of the node we are about to remove from the list
		current.next = current.next.next;                    //The ListNode before the node we want to remove is set 
		                                                     //to point at the node after the one we want to remove
		return deleted;
	}
}
