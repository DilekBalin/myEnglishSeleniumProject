package com.MyFirstProject;

import com.MyFirstProject.utilities.TestBase;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day09_ReadExcel {
    @Test
    public void readExcel() throws IOException {
        //Store the path of the file in a string
        String path = ".\\src\\test\\java\\ressources\\capitals.xlsx";//windows


        //open the file
        FileInputStream fileInputStream = new FileInputStream(path);

        //open the workbook using fileinputstream
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        //open the first worksheet
        Sheet sheet1 = workbook.getSheet("Sayfa1");
        // workbook.getSheetAt(0);//because first sheet has index 0
        //go to first row
        Row row1 = sheet1.getRow(0);//--first row

        //go to first cell on that first row and print
        Cell cell1 = row1.getCell(0);
        System.out.println(cell1);
        System.out.println(cell1.toString().toUpperCase());

        //go to first cell on that first row and print
        System.out.println(row1.getCell(1));

        //go to second row first cell and assert if the data equal to
       String r2c1 =sheet1.getRow(1).getCell(0).toString();
       Assert.assertEquals("Afghanistan",r2c1);

       //go to 3rd row and 2nd cell-chain the row and cell

        String r3c2=sheet1.getRow(2).getCell(1).toString();
        System.out.println(r3c2);

        //Find the number of row

      int numberOfRow=  sheet1.getLastRowNum()+1;//because first row starts from 0 and we had to add 1
        System.out.println(numberOfRow);

        //find teh number of used row
       int numberOfUsedRows= sheet1.getPhysicalNumberOfRows();
        System.out.println(numberOfUsedRows);

        //print country,capital key value pairs as map object
        Map<String,String> countriesAandCapitals=new HashMap<>();
        for(int rowNumber=1;rowNumber <numberOfRow;rowNumber++){
            String countries=sheet1.getRow(rowNumber).getCell(0).toString();
            System.out.println(countries);
            String capitals= sheet1.getRow(rowNumber).getCell(1).toString();
                System.out.println(capitals);
            countriesAandCapitals.put(countries,capitals);
            }
        System.out.println(countriesAandCapitals);
        }


    }
