package headFirst;


/*@title: clicker program
*@author Ben Hunkin
*@date 3/3/2021
*/


import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.*;

public class clicker2 implements KeyListener{
	

public static void main(String args[]) {
looper();
}


public static void looper() {
	float start = System.nanoTime();
	boolean loop = true;	
	int count = 0;

	Robot bot = null;
	try {
		bot = new Robot();
	} catch (Exception failed) {
		System.err.println("Failed instantiating Robot: " + failed);
	} 
	
	 long setcurrentTime = System.currentTimeMillis();
	 System.out.println("Setting the time " + setcurrentTime);

try {
	System.out.println("how many click would you like");
	Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
	 while (count < input ) {

		 
	 int mask = InputEvent.BUTTON1_DOWN_MASK;
	 bot.mouseMove(300, 400);
	 bot.mousePress(mask);
	 bot.mouseRelease(mask);
	 count ++;
	 System.out.println(count);

	 Thread.sleep(10);
	 System.out.println("current time loop started: " + setcurrentTime);
	 
	 long runTime = System.currentTimeMillis();
	 System.out.println("running:                  " + runTime);
	 long exitTime = runTime - setcurrentTime;
	 System.out.println("how long i've ran for: " + exitTime + " ms");
	 
	 	//exit loop after running for about 4.2 seconds 
	 	 if (exitTime>4000) {
		 float end = System.nanoTime();
		 float total = end - start;
		 System.out.println("Current Run time: " + total / 1_000_000_000 + " seconds" ); //seconds
		 System.out.println("EXIT CODE!!!!");
		 System.exit(1);
		
	 }
	 
	 float end = System.nanoTime();
	 float total = end - start;
	 System.out.println("Total Run time " + total / 1_000_000_000 + " seconds" );
	 
	  }
	} catch (InterruptedException e1) {

	e1.printStackTrace();
	}
  }



@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
