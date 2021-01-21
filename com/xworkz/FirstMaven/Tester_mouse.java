package com.xworkz.FirstMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xworkz.FirstMaven.dao.MouseDAO;
import com.xworkz.FirstMaven.dao.MouseDAOImpl;
import com.xworkz.FirstMaven.dto.MouseDTO;

public class Tester_mouse {

	public static void main(String[] args) throws IOException {
		
			FileInputStream file=new FileInputStream(new File("C:\\Users\\Gayathri\\Desktop\\mouse_data.xlsx"));
			XSSFWorkbook  workBook=new XSSFWorkbook(file);
			XSSFSheet sheet=workBook.getSheetAt(0);
			Row row;
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				row = (Row)sheet.getRow(i);
				
				String MOUSE_ID;
					if(row.getCell(0)==null) { MOUSE_ID = "null"; }
					else  MOUSE_ID=row.getCell(0).toString();
					
				String MOUSE_COLOR;
				if(row.getCell(1)==null)
				{	MOUSE_COLOR = "null";	}
				else MOUSE_COLOR=row.getCell(1).toString();
				
				String MOUSE_SIZE;
				if(row.getCell(2)==null) { MOUSE_SIZE = "null" ;}
				else MOUSE_SIZE=row.getCell(2).toString();
				
				String MOUSE_PRICE;
				if(row.getCell(3)==null) {MOUSE_PRICE="0";}
				else MOUSE_PRICE=row.getCell(3).toString();
				
				String MOUSE_ISWIRED;
				if(row.getCell(4)==null) {MOUSE_ISWIRED="null"; } 
				else MOUSE_ISWIRED=row.getCell(4).toString();				
				MouseDTO mouseDTO=new MouseDTO();
				mouseDTO.setMouseColor(MOUSE_COLOR);
				mouseDTO.setMouseSize(MOUSE_SIZE);
				mouseDTO.setMousePrice(Double.parseDouble(MOUSE_PRICE));
				mouseDTO.setIsWired(Boolean.parseBoolean(MOUSE_ISWIRED));
				MouseDAO daoImpl=new MouseDAOImpl();
				daoImpl.saveMouseData(mouseDTO);
				
				
			}
			file.close();
			
	}
		
		
		

	

}
