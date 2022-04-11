import java.io.File;
public class Class27_File_Class {

	public static void main(String[] args) {
		// file- An abstract representation of file and directory pathnames
		File file=new File("D:\\Program\\Java\\WorkSpace1\\Project1\\src","­^¤å.txt");
		if(file.exists()) {
			System.out.println("That file exists!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}
		else {
			System.out.println("That file doesn't exists!");
		}
	}

}
