package dungeon_thread;

class main {

	public static void main(String[] args) {
		
		user user = new user("도도",100);
		monster mon = new monster("악마",50,10,user);
		
		Thread s1= new Thread(new  user("도도",100));
		Thread s2= new Thread(new monster("악마",50,10,user));
		
		s1.start();
		s2.start();
		
	}

}
