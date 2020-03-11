import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashmapWithExcel {

	public static Map<String, String> mappingExcel() throws IOException{
		
		//Give file to input stream, pass stream object to workbook object, get first sheet
		FileInputStream fin = new FileInputStream("./DataFolder/HashmapExcelSheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fin); 
		XSSFSheet sheet = workbook.getSheetAt(0);
		
	
		//Creating hash map object
		Map<String, String> mapData = new  HashMap<String, String>();
	
		int i;
		String Key, Value;
	
		//looping rows from first to last
		for(i=0; i<= sheet.getLastRowNum() ; i++){
		
			Row r = sheet.getRow(i);
		
			//getting cells value
			Key = r.getCell(0).toString();
			Value = r.getCell(1).toString();
		
			//putting key-value in data map
			mapData.put(Key,Value);
		}		
		return mapData;
	}
	
	
	static void GiveValueOfKey(String Key) throws IOException {
		
		//Printing value of key with the help of mappingExcel()
		String val = mappingExcel().get(Key);
		System.out.println(val);		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(HashmapWithExcel.mappingExcel());
		HashmapWithExcel.GiveValueOfKey("DOB");
		HashmapWithExcel.GiveValueOfKey("EmpCode");
	}

}
