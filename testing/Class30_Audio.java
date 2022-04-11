import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Class30_Audio {

	public static void main(String[] args) throws  UnsupportedAudioFileException, IOException, LineUnavailableException  {
   	    Scanner scanner=new Scanner(System.in);
		File file =new File("test2.wav");
		AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();
		System.out.println(1);
		
		String response="";
		while(!response.equals("Q")) {
			System.out.println("P=Play, S=Stop, R=Reset, Q=Quit");
			System.out.print("Enter your choice：");
			response=scanner.next(); //有這行才能有聲音 讓程式跑在背景端
			response=response.toUpperCase();
			switch(response) {
			case ("P"):
				clip.start();
				break;
			case ("S"):
				clip.stop();
				break;
			case ("R"):
				clip.setMicrosecondPosition(0);
			case ("Q"):
				clip.close();
			default:
				System.out.println("Not a valid response");
			}
			}
		}
	}


