package Webserver;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("------Create a server--------");
		System.out.println("Enter Server Name:");
		String Servername=scn.next();
		System.out.println("Enter Server IP:");
		String serverip=scn.next();
		System.out.println("Enter Server Space:");
		String serverspace=scn.next();
		System.out.println("Enter Server CPU:");
		String servercpu=scn.next();
		System.out.println("Enter Server RAM:");
		String serverram=scn.next();
		
		Server s1=new Server(Servername,serverip,serverspace,servercpu,serverram);
		
		String name= s1.getServername();
		String ip=s1.getServerip();
		String space=s1.getServerspace();
		String cpu=s1.getServercpu();
		String ram=s1.getServerram();
		while(true) {
		System.out.println("1 To Deploy\n2 to ReDeploy\n3 to Stop");
		System.out.println("Enter your Choice: ");
		int choice=scn.nextInt();
		if(choice==1) {
			s1.Deploy(name, ip, space, cpu, ram);
		}
		else if(choice==2) {
			s1.ReDeploy(name, ip, space, cpu, ram);
		}
		else if(choice==3) {
			s1.Stop(name, ip, space, cpu, ram);
			break;
		}else {
			System.out.println("Invaild Operation !!!");
		}
		
		}

	}

}
