import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadandWrite1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook w1 = new XSSFWorkbook();
		//Create Blank workbook 
		XSSFSheet s1 = w1.createSheet("sample");
		// creates sheet sample
		XSSFRow r1;
		Map<String,Object[]> abc = new TreeMap<String, Object[]>();
		abc.put("1",new Object[]{"hi","hello"});
		abc.put("2",new Object[]{"welcome","All"});
			Set<String> pq = abc.keySet();
		int rownum = 0;
		for(String key : pq)
		{
		r1 = s1.createRow(rownum++);
		Object[] rs = abc.get(key);
		int cellnum = 0;
		for(Object obj:rs)
		{
		Cell c1 = r1.createCell(cellnum++);
		c1.setCellValue((String)obj);
		}
		}
		FileOutputStream f1 = new FileOutputStream(new File("success.xlsx"));
		w1.write(f1);
		f1.close();
		System.out.println("success");

	}

}
