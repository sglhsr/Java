import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Class29_FileReader {

	public static void main(String[] args) {
	
		// FileReader- read the contents of a file as a stream of characters. One by one
		//         	   read() reaturns an int value which contains the byte value
		//             when read() returns -1, there is no more data to read
	
		try {
//			File obj =new File("art.txt");
//			Scanner reader = new Scanner(obj);
//			while (reader.hasNextLine()) {
//				String data=reader.nextLine();
//				System.out.println(data);
//			}
			
			FileReader fr=new FileReader("art.txt");
			BufferedReader br=new BufferedReader(fr);
			while (br.ready()) {
				System.out.println(br.readLine());
			}
			fr.close();
			
//		    FileReader reader = new FileReader("art.txt");
//	  	    int data=reader.read();
//			while (data!=-1) {
//				System.out.print((char)data);
//				data=reader.read();
//			}
//			reader.close();
		}
		catch(FileNotFoundException e){		
			e.printStackTrace();
		}
		catch(IOException e) {
					
		}
	}

}
