package org.company;

//import org.apache.poi.ss.usermodel.Workbook;

import me.ore.k.poi.ext.org.apache.poi.ss.usermodel.WorkbookKt;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //Workbook wb = new HSSFWorkbook();
        WorkbookKt wb = new WorkbookKt();
        try(OutputStream fileOut = new FileOutputStream("sample.xls")){
            wb.write(fileOut);

        }catch (Exception e){
            System.out.println( e.getMessage() );
        }
    }
}
