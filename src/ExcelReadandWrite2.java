
public class ExcelReadandWrite2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.io.File;
		import java.io.FileInputStream;
		import java.util.Iterator;
		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.xssf.usermodel.XSSFRow;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		public class readingexcel
		{
		    @SuppressWarnings("deprecation")
			public static void main(String[] args) throws Exception 
		   {
		    FileInputStream f1 = new FileInputStream(
		      new File("success.xlsx"));
		      XSSFWorkbook w1 = new XSSFWorkbook(f1);
		      XSSFSheet s1 = w1.getSheetAt(0);
		      XSSFRow r1;
		      Iterator < Row > rowIterator = s1.iterator();
		      while (rowIterator.hasNext()) 
		      {
		         r1 = (XSSFRow) rowIterator.next();
		         Iterator < Cell > cellIterator = r1.cellIterator();
		         //Iterator interface contains next(),hasNext() which helps to move 
		         while ( cellIterator.hasNext()) 
		         {
		            Cell c1 = cellIterator.next();
		            switch (c1.getCellType()) 
		            {
		               case Cell.CELL_TYPE_NUMERIC:
		               System.out.print( "Data inside cell is Numeric" +"\t"
		                +c1.getNumericCellValue() + " \t\t " );
		               break;
		               case Cell.CELL_TYPE_STRING:
		               System.out.print( "Data inside cell is String" +"\t"
		               +c1.getStringCellValue() + " \t\t " );
		               break;
		            }
		         }
		         System.out.println();
		      }
		      f1.close();
		 
	}

}
