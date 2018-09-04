import java.io.File;

public class Mod6_AbsolutePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("uploadfile.txt");
		String abc = file.getAbsolutePath();
		System.out.println("Absolute Path"+abc);

	}

}
