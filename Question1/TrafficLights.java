//Author: Mageza Shalom
//Cohort: 2
//Week: Three
//Queestion 1: Traffic Lights

import java.util.*;

class TrafficLights {
	public static void main(String[] args) throws InterruptedException {
		int rand;
		Queue<String> CAR = new LinkedList<>();
		for (int i = 1; i < 101; i++) {
			CAR.add("CAR " + i);
		}
		// Here I created a color array which has the Traffic Light Colors
		String[] color = { "Red", "Yellow", "Green" };
		// Here then I create a variable to get any random integer starting from 1
		while (CAR.size() > 0) {
			rand = new Random().nextInt(3);
			// Here If the traffic is Red, there is a notice and the cars wont move
			if ("Red" == color[rand]) {
				System.out.print("\n=======================");
				System.out.print("\n!!!RED TRAFFIC LIGHT!!!");
				System.out.print("\n-----------------------");
				System.out.print("\n!VEHICLES CAN NOT MOVE!");
				System.out.print("\n=======================\n");
				Thread.sleep(20000);
			}
			// Here if the color is Yellow it will take 10 seconds, and rests 2 seconds
			// Five cars will movecars
			else if ("Yellow" == color[rand]) {
				System.out.print("\n==========================");
				System.out.print("\n!!!YELLOW TRAFFIC LIGHT!!!");
				System.out.print("\n--------------------------");
				System.out.print("\nVEHICLES CAN MOVE CAREFULY");
				System.out.print("\n==========================\n");

				int k = 1;
				while (k < 6) {
					Thread.sleep(2000);
					System.out.println(CAR.remove() + " Driving Away");
					k++;

				}
				// the remaining color is Green it so now the vehicles can move
			} else {
				System.out.print("\n=========================");
				System.out.print("\n!!!GREEN TRAFFIC LIGHT!!!");
				System.out.print("\n-------------------------");
				System.out.print("\n!!ALL VEHICLES CAN MOVE!!");
				System.out.print("\n=========================\n");

				int j = 1;
				while (j < 31) {
					// Here a car moves every second
					Thread.sleep(1000);
					System.out.println(CAR.remove() + " Driving Away");
					j++;
				}

			}
		}

		System.exit(0);

	}

}
