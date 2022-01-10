package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelReadActions {

   String filePath = "Employees.xlsx";

    @Test
    public void readExcelSheetData() throws IOException {
        // open the Employees.xlsx using Apache POI
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);

        // Goto "data sheet, or goto first sheet by index
        XSSFSheet dataSheet = workbook.getSheetAt(0);

        // print column names. row is 0. cells 0, 1, 2
        System.out.println("COLUMN NAMES:");
        System.out.println(dataSheet.getRow(0).getCell(0));
        System.out.println(dataSheet.getRow(0).getCell(1));
        System.out.println(dataSheet.getRow(0).getCell(2));

        System.out.println("___________________________");
        //loop and print all 3 column names
        for (int i = 0; i <= 2; i++) {
            System.out.println(dataSheet.getRow(0).getCell(i));
        }
        // find out number of rows in the worksheet
        int rowsCount = dataSheet.getPhysicalNumberOfRows();
        System.out.println("rowsCount = " + rowsCount);  // 8 starts from 1

        int usedRowsCount = dataSheet.getLastRowNum();
        System.out.println("usedRowsCount = " + usedRowsCount); // 7 starts from 0

        //print all first names using a loop
        System.out.println("All FIRST NAMES:");
        for (int i = 1; i <= usedRowsCount; i++) {
            System.out.println(dataSheet.getRow(i).getCell(0));
        }

        // loop and find Fahima and print her last name and job ID

        System.out.println("\nFahima INFO:");
        for (int i = 1; i <= dataSheet.getLastRowNum(); i++) {
            if (dataSheet.getRow(i).getCell(0).toString().equals("Fahima")){
                System.out.println(dataSheet.getRow(i).getCell(0) + " | " +
                        dataSheet.getRow(i).getCell(1) + " | " +
                        dataSheet.getRow(i).getCell(2));
                break;
            }
        }

        if (dataSheet.getRow(0).getCell(0) != null);

    }
}
