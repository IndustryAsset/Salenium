import java.io.File;

public class Mod6AbsolutePath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      File f = null;
		      String path = "";
		      boolean bool = false;
		      
		      try{
		         // create new files
		         f = new File("test.txt");
		         
		         // returns true if the file exists
		         bool = f.exists();
		         
		         // if file exists
		         if(bool)
		         {
		            // get absolute path
		            path = f.getAbsolutePath();
		            
		            // prints
		            System.out.print("Absolute Pathname "+ path);
		         }
		      }catch(Exception e){
		         // if any error occurs
		         e.printStackTrace();
		      }
		}

	}


