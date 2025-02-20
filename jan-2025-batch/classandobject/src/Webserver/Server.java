package Webserver;

public class Server extends Features {
//	private variables
	private String servername;
	private String serverip;
	private String serverspace;
	private String servercpu;
	private String serverram;
	
//	constructor
	
	public Server(String servername, String serverip, String serverspace, String servercpu, String serverram) {
	super();
	this.servername = servername;
	this.serverip = serverip;
	this.serverspace = serverspace;
	this.servercpu = servercpu;
	this.serverram = serverram;
}
	
	
	
//	getter setter
	public String getServername() {
		return servername;
	}
	public void setServername(String servername) {
		this.servername = servername;
	}
	public String getServerip() {
		return serverip;
	}
	public void setServerip(String serverip) {
		this.serverip = serverip;
	}
	public String getServerspace() {
		return serverspace;
	}
	public void setServerspace(String serverspace) {
		this.serverspace = serverspace;
	}
	public String getServercpu() {
		return servercpu;
	}
	public void setServercpu(String servercpu) {
		this.servercpu = servercpu;
	}
	public String getServerram() {
		return serverram;
	}
	public void setServerram(String serverram) {
		this.serverram = serverram;
	}



	@Override
	void Deploy(String servername,String serverip,String serverspace,String servercpu,String serverram) {
		System.out.println("Server Name: "+servername);
		System.out.println("Server Ip: "+serverip);
		System.out.println("Server Space: "+serverspace);
		System.out.println("Server CPU: "+servercpu);
		System.out.println("Server RAM: "+serverram);
		System.out.println("Deploying .....");
		
	}



	@Override
	void ReDeploy(String servername,String serverip,String serverspace,String servercpu,String serverram) {
		
		System.out.println("Server Name: "+servername);
		System.out.println("Server Ip: "+serverip);
		System.out.println("Server Space: "+serverspace);
		System.out.println("Server CPU: "+servercpu);
		System.out.println("Server RAM: "+serverram);
		System.out.println("ReDeploying .....");
	}



	@Override
	void Stop(String servername,String serverip,String serverspace,String servercpu,String serverram) {
		System.out.println("Server Name: "+servername);
		System.out.println("Server Ip: "+serverip);
		System.out.println("Server Space: "+serverspace);
		System.out.println("Server CPU: "+servercpu);
		System.out.println("Server RAM: "+serverram);
		System.out.println("Stoping .....");
		
	}
	
 	
}
