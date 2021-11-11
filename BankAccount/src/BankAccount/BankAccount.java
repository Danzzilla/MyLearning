package BankAccount;

public class BankAccount{
	   
	private int ID;                                                    //User's ID
	private String Name;                                               //User's name
	private double balance;                                            //User's bank balance
	   
	public BankAccount(){                                              //create default user's bank account
		ID = 0;
		Name = "Unknown";
		balance = 0;
	}	
	   
	public BankAccount(int IdIn, double BalanceIn, String NameIn){     //create user's bank account with the inputed
		ID = IdIn; 
		Name = NameIn;
		balance = BalanceIn;
	}
	   
	public String toString(){                                          //converts the bank account into a printable string
		return Name + " ["+ID+"] = $" + balance;
	}
	   
	public String getName(){                                           //returns the name of the user
		return Name;
	}
	   
	public double getBalance(){                                        //returns the balance of the user
		return balance;
	}
	   
	public int getID(){                                                //returns the ID of the user
		return ID;
	}
	   
	public void setName(String NewName){                               //sets the inputed name to the user
		Name = NewName;
	}
	   
	public void changeBalance(double change){                          //changes the users balance by a positive (to add)
		balance = balance + change;                                    //or negative (to subtract) number
	}
}   