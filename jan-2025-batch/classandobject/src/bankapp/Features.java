package bankapp;

abstract class Features {
	
	public abstract String signin(String username,String Accounttype,double balance,String password);
	
	public abstract String login(String username,String password);
	
	public abstract double creadit(double addamount);
	
	public abstract double debit(double addamount);
	
	public abstract double checkbalance();
	
	public abstract String Forgotpassword(String NewPassword);


}
