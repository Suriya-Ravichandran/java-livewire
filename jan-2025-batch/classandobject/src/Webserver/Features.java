package Webserver;

public abstract class Features {
	abstract void Deploy(String servername,String serverip,String serverspace,String servercpu,String serverram);
	abstract void ReDeploy(String servername,String serverip,String serverspace,String servercpu,String serverram);
	abstract void Stop(String servername,String serverip,String serverspace,String servercpu,String serverram);
}
