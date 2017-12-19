package sample.java.util.xls;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

/**
 * @author pkumar on 1/12/17
 * @project javaSamples
 */
public class XlsParser {

    private static String filePath = "/home/pkumar/workstation/projects/javaSamples/sampleJavaUtils/src/main/resources/Contact Information - Letter Summary FINAL.xlsx";
    private static Logger LOG = Logger.getLogger(XlsParser.class);

    public static void main(String arg[]) {
        parseXls();
    }

    public static void parseXls() {
        FileInputStream fileInputStream = null;
        Workbook workbook = null;
        int rowCount = 0;
        try {
            fileInputStream = new FileInputStream(new File(filePath));

            workbook = new XSSFWorkbook(fileInputStream);
            Sheet firstSheet = workbook.getSheetAt(0);

            Iterator<Row> iterator = firstSheet.iterator();
            while (iterator.hasNext()) {
                rowCount++;
                System.out.print("row - " + rowCount);
                Row nextRow = iterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
//                    LOG.info("| " + cell.getStringCellValue() + " |");

                    System.out.print("| " + cell.getStringCellValue() + " |");
                }
                System.out.println();
            }
            System.out.println("----------------------------");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    workbook.close();
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
