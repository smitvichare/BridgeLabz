package logicalProgramsPractice;

import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		long startTime = 0,endTime;
		boolean running=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Type 'start' to start the stopwatch and 'stop' to stop it.");
		while (true) {
            String command = sc.nextLine().toLowerCase();

            if (command.equals("start")) {
                startTime = System.currentTimeMillis();
                running = true;
                System.out.println("Stopwatch started...");
            } else if (command.equals("stop") && running) {
                endTime = System.currentTimeMillis();
                long elapsedTime = (endTime - startTime) / 1000; // Convert to seconds
                System.out.println("Stopwatch stopped. Elapsed time: " + elapsedTime + " seconds");
                break;
            } else {
                System.out.println("Invalid command or the stopwatch is not running. Type 'start' or 'stop'.");
            }
        }
	}

}
