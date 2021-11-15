

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class parameterizationexcel {
	public static excelReader excel= null;
    @Test(dataProvider="getData")
	public void testData(Hashtable<String,String> data) {
		System.out.println("USERNAME  -:"+data.get("username"));
	}
    @DataProvider
    public Object[][] getData(){
    	if(excel==null) {
    		excel = new excelReader("C:\\Users\\Gagan\\OneDrive\\Desktop\\Book1.xlsx");
    	}
    	String sheetname="Sheet1";
    	int rows=excel.getRowCount(sheetname);
    	int coloums=excel.getColumnCount(sheetname);
		Object[][] data = new Object[rows-1][1];
	    Hashtable<String,String> table= null;
	    
	    
			for(int rownums=2 ;rownums<=rows;rownums++)
	     	{
				table =new Hashtable<String,String>();
			for(int colnums=0;colnums<coloums;colnums++) {
				//data[rownums-2][0]=excel.getCellData(sheetname, colnums, rownums);
				table.put(excel.getCellData(sheetname, colnums,1),excel.getCellData(sheetname, colnums, rownums));
				data[rownums-2][0]=table;
				
			}
		}
		
		return data;
    	
                               }
                                   }
