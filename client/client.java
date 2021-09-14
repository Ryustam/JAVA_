package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
	
	final static int ServerPort = 8787;
	
	public static void main(String[] args)  throws UnknownHostException, IOException{
		Scanner sc = new Scanner(System.in);
		
		InetAddress ip = InetAddress.getByName("192.168.0.3");
		
		Socket s = new Socket(ip, ServerPort);
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		
		Thread sendMessage = new Thread(new Runnable(){
			
			public void run() {
				while(true) {
					String msg = sc.nextLine();
					
					try {
						dos.writeUTF(msg);
					}catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread readMessage = new Thread(new Runnable(){
			
			public void run() {
				while(true) {
					
					try {
						String msg = dis.readUTF();
						System.out.println(msg);
					}catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		sendMessage.start();
		readMessage.start();
	}
		
}
