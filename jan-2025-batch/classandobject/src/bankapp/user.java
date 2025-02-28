package bankapp;


public class user extends Features {
	
//	user data variable
	private String username;
	private String Accounttype;
	private double balance;
	private String password;
	private String saltKey="adfghjtyrtfvfvhfjhgjdfndffhfdbfdvdxvhf";
	
	
//	getters and setters
	public String getsaltKey() {
		return saltKey;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAccounttype() {
		return Accounttype;
	}
	public void setAccounttype(String accounttype) {
		Accounttype = accounttype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String signin(String username,String Accounttype,double balance,String password) {
		String hash=getsaltKey();
		String saltedpassword=hash+hash+password+hash+hash;
		if(username!=null && password !=null && Accounttype!=null) {
			setUsername(username);
			setAccounttype(Accounttype);
			setBalance(balance);
			setPassword(saltedpassword);
			return "Signin Success";
		}else {
			return "Signin Failed";
		}
		
	}
	@Override
	public 	String login(String username,String password) {
		String hash=getsaltKey();
		String saltedpassword=hash+hash+password+hash+hash;
		String verifyuser=getUsername();
		String verifypassword=getPassword();
		if(verifyuser.equals(username)) {
			if(saltedpassword.equals(verifypassword)) {
				return "Login sucess";
			}
			else {
				return "Incorrect password";
			}
		}else {
			return "User not found";
		}
	}
	@Override
	public double creadit(double addamount) {
		double balance =getBalance();
		double totalamount=balance+addamount;
		return totalamount;
		
		
	}
	@Override
	public double debit(double addamount) {
		double balance =getBalance();
		double totalamount=balance-addamount;
		return totalamount;
		
	}
	@Override
	public double checkbalance() {
		double balance =getBalance();
		return balance;
		
	}
	@Override
	public String Forgotpassword(String NewPassword) {
		setPassword(NewPassword);
		return "password change success";
		
		
	}
	
}
