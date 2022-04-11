import java.io.FileWriter;
import java.io.IOException;

public class Class28_FileWriter {

	public static void main(String[] args) {
		try {
			FileWriter writer=new FileWriter("text.txt"); //default project path, not workspace
			writer.write("Roses are red \n VioletsµµÃ¹Äõ are blue\n Booty booty booty \n Rockin ");
			writer.append("\n This is the text for java");
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
