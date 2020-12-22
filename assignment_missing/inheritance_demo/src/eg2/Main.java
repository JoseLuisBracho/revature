package eg2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		Project p1=new Project(9000, "Abc Corp", "Abc Corp Some Client");
		Employee e1=new  Employee(100, "Sachin", "Manager", 23333.44,p1);
		System.out.println("e1");
		System.out.println(e1);
		
		Employee e2=new Employee(101, "Richard", "Associate", 2000.33,p1);
		System.out.println("e2");
		System.out.println(e2);
		
		Project p2=new Project(9001, "SMS", "Revature");
		Employee e3=new Employee(102, "Tushar", "Manager", 33000.33, p2);
		System.out.println("e3");
		System.out.println(e3);
		
		//Complete Address, Player and Team
		
		Team t1 = new Team(1001, "The wolves", "Jose Bracho");
		
		Address ad1 = new Address(12548, "12A Av.", "Spring city", 47562);
		Address ad2 = new Address(14573, "Carolina st.", "Melbourne", 14528);
		
		Player player1 = new Player(101, "James Albright", 9.8, t1, ad1);
		Player player2 = new Player(121, "Andrew Calvin", 2.8, t1, ad2);
		
		Team t2 = new Team(1425, "The irons", "Juan Valdez");
		Player player3 = new Player(428, "Paul Meridan", 2.8, t2, ad1);
		
		List<Player> players = new ArrayList<>();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		
		System.out.println("\n\nList of players this season");
		System.out.println("=============================");
		for (Player player : players) {
			System.out.println("\n");
			System.out.println(player);
		}

		

	}

} //Complete Address, Player and Team
