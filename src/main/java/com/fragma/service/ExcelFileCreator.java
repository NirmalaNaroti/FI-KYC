package com.fragma.service;

import com.fragma.dto.MainDto;
import com.fragma.dto.Volumetric;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.Map;

@Service
public class ExcelFileCreator {

    private static final Logger LOG = LoggerFactory.getLogger(ExcelFileCreator.class);


    DecimalFormat df = new DecimalFormat("#,###.00");


    public void createExcelSheetForBahrain(String excelFileLocation, MainDto mainDto) throws Exception {

        LOG.info("***** executing createExcelSheetForBahrain ****** ");

        XSSFWorkbook workbook = new XSSFWorkbook();

         String sheetName="Bahrain";

        Font headingFont = workbook.createFont();
        headingFont.setBold(true);

        XSSFColor orange = new XSSFColor(new java.awt.Color(182, 207, 242));

        XSSFCellStyle headingCellStyle = workbook.createCellStyle();

        headingCellStyle.setFont(headingFont);
        headingCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headingCellStyle.setFillForegroundColor(orange);
        headingCellStyle.setBorderBottom(BorderStyle.THIN);
        headingCellStyle.setBorderLeft(BorderStyle.THIN);
        headingCellStyle.setBorderRight(BorderStyle.THIN);
        headingCellStyle.setBorderTop(BorderStyle.THIN);
        headingCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        headingCellStyle.setAlignment(HorizontalAlignment.CENTER);
        headingCellStyle.setWrapText(true);

        XSSFColor lightOrange = new XSSFColor(new java.awt.Color(255, 216, 151));

        XSSFCellStyle MainHeadingCellStyle = workbook.createCellStyle();

        MainHeadingCellStyle.setFont(headingFont);
        MainHeadingCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        MainHeadingCellStyle.setFillForegroundColor(lightOrange);
        MainHeadingCellStyle.setBorderBottom(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderLeft(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderRight(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderTop(BorderStyle.THIN);
        MainHeadingCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        MainHeadingCellStyle.setAlignment(HorizontalAlignment.CENTER);
        MainHeadingCellStyle.setWrapText(true);

        CellStyle bordersOnly = workbook.createCellStyle();
        bordersOnly.setBorderBottom(BorderStyle.THIN);
        bordersOnly.setBorderLeft(BorderStyle.THIN);
        bordersOnly.setBorderRight(BorderStyle.THIN);
        bordersOnly.setBorderTop(BorderStyle.THIN);
        bordersOnly.setAlignment(HorizontalAlignment.CENTER);
        bordersOnly.setVerticalAlignment(VerticalAlignment.CENTER);

        CellStyle bordersOnlyRed = workbook.createCellStyle();
        bordersOnlyRed.setBorderBottom(BorderStyle.THIN);
        bordersOnlyRed.setBorderLeft(BorderStyle.THIN);
        bordersOnlyRed.setBorderRight(BorderStyle.THIN);
        bordersOnlyRed.setBorderTop(BorderStyle.THIN);
        bordersOnlyRed.setAlignment(HorizontalAlignment.CENTER);
        bordersOnlyRed.setVerticalAlignment(VerticalAlignment.CENTER);

        XSSFFont font = workbook.createFont();
        font.setFontName(XSSFFont.DEFAULT_FONT_NAME);
        font.setFontHeightInPoints((short)10);
        font.setColor(IndexedColors.RED.getIndex());

        bordersOnlyRed.setFont(font);

        CellStyle bordersOnlyGreen = workbook.createCellStyle();
        bordersOnlyGreen.setBorderBottom(BorderStyle.THIN);
        bordersOnlyGreen.setBorderLeft(BorderStyle.THIN);
        bordersOnlyGreen.setBorderRight(BorderStyle.THIN);
        bordersOnlyGreen.setBorderTop(BorderStyle.THIN);
        bordersOnlyGreen.setAlignment(HorizontalAlignment.CENTER);
        bordersOnlyGreen.setVerticalAlignment(VerticalAlignment.CENTER);

        XSSFFont greenFont = workbook.createFont();
        greenFont.setFontName(XSSFFont.DEFAULT_FONT_NAME);
        greenFont.setFontHeightInPoints((short)10);
        greenFont.setColor(IndexedColors.GREEN.getIndex());

        bordersOnlyGreen.setFont(greenFont);



        Sheet sheet = workbook.createSheet(sheetName);

        Row headingRow1 = sheet.createRow(0);


        sheet.addMergedRegion(new CellRangeAddress(0,0,24,26));

        createCellAddData(headingRow1, 24, "MT 103 Inward 1 month ", MainHeadingCellStyle);

        sheet.addMergedRegion(new CellRangeAddress(0,0,27,29));

        createCellAddData(headingRow1, 27, "MT 103 Outward 1 month ", MainHeadingCellStyle);

        sheet.addMergedRegion(new CellRangeAddress(0,0,30,32));

        createCellAddData(headingRow1, 30, "MT 202 Inward 1 month ", MainHeadingCellStyle);


        sheet.addMergedRegion(new CellRangeAddress(0,0,33,35));

        createCellAddData(headingRow1, 33, "MT 202 Outward 1 month ", MainHeadingCellStyle);


        int rowNum=1;

        Row headingRow = sheet.createRow(rowNum++);
        headingRow.setHeight((short) 900);

        int headingColmIndx = 0;

        createCellAddData(headingRow, headingColmIndx++, "Customer No", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Type", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Name", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CIF Status", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CIF Creation Date", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Category", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Frozen", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Dormant", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Comp_mis_1", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Branch Code", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Cust_ac_no", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Class", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_Desc", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Status", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Open Date", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_dr", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_cr", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_dormant", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_frozen", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Nationality", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Class Description", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "DR_Turnover", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CR_Turnover", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);


        for (Map.Entry<Integer, Volumetric> tdEntry : mainDto.getMapForBahrainExcelData().entrySet()) {

            LOG.info("RRRRRRRRRRRRRRRr");

            Row row = sheet.createRow(rowNum++);
            int cell = 0;


            createCellAddData(row, cell++, tdEntry.getValue().getCustomerNo(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustomerType(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustomerName1(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCifStatus(), bordersOnly);

            createCellAddData(row, cell++, tdEntry.getValue().getCifCreationDate(), bordersOnly);

            createCellAddData(row, cell++, tdEntry.getValue().getCustomerCategory(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getFrozen(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getDormant(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCompMis1(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getBranchCode(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustAcNo(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccountClass(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcDesc(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCcy(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccStatus(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcOpenDate(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatNoDr(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatNoCr(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatDormant(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatFrozen(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getNationality(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccountClassDescription(), bordersOnly);
            createCellAddData(row, cell++, String.valueOf(tdEntry.getValue().getDrTurnover()), bordersOnly);
            createCellAddData(row, cell++,String.valueOf(tdEntry.getValue().getCrTurnover()), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_count_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_monthly_avg_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_count_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_outward_amt_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_monthly_avg_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_count_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_monthly_avg_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_count_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_monthly_avg_202(), bordersOnly);





        }

        for (int i = 0; i <= sheet.getRow(1).getLastCellNum(); i++) {

            sheet.autoSizeColumn(i);
            int columnWidth = sheet.getColumnWidth(i);
            sheet.setColumnWidth(i, columnWidth + 1000);
        }
        FileOutputStream out = new FileOutputStream(excelFileLocation);
        workbook.write(out);
        out.close();
        LOG.info(" Excel file for Bahrain written successfully on disk at :" + excelFileLocation);
    }
    public void createExcelSheetForKuwait(String excelFileLocation, MainDto mainDto) throws Exception {

        LOG.info("***** executing createExcelSheetForKuwait ****** ");

        XSSFWorkbook workbook = new XSSFWorkbook();

        String sheetName="Kuwait";

        Font headingFont = workbook.createFont();
        headingFont.setBold(true);

        XSSFColor orange = new XSSFColor(new java.awt.Color(182, 207, 242));

        XSSFCellStyle headingCellStyle = workbook.createCellStyle();

        headingCellStyle.setFont(headingFont);
        headingCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headingCellStyle.setFillForegroundColor(orange);
        headingCellStyle.setBorderBottom(BorderStyle.THIN);
        headingCellStyle.setBorderLeft(BorderStyle.THIN);
        headingCellStyle.setBorderRight(BorderStyle.THIN);
        headingCellStyle.setBorderTop(BorderStyle.THIN);
        headingCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        headingCellStyle.setAlignment(HorizontalAlignment.CENTER);
        headingCellStyle.setWrapText(true);

        XSSFColor lightOrange = new XSSFColor(new java.awt.Color(255, 216, 151));

        XSSFCellStyle MainHeadingCellStyle = workbook.createCellStyle();

        MainHeadingCellStyle.setFont(headingFont);
        MainHeadingCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        MainHeadingCellStyle.setFillForegroundColor(lightOrange);
        MainHeadingCellStyle.setBorderBottom(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderLeft(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderRight(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderTop(BorderStyle.THIN);
        MainHeadingCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        MainHeadingCellStyle.setAlignment(HorizontalAlignment.CENTER);
        MainHeadingCellStyle.setWrapText(true);

        CellStyle bordersOnly = workbook.createCellStyle();
        bordersOnly.setBorderBottom(BorderStyle.THIN);
        bordersOnly.setBorderLeft(BorderStyle.THIN);
        bordersOnly.setBorderRight(BorderStyle.THIN);
        bordersOnly.setBorderTop(BorderStyle.THIN);
        bordersOnly.setAlignment(HorizontalAlignment.CENTER);
        bordersOnly.setVerticalAlignment(VerticalAlignment.CENTER);

        CellStyle bordersOnlyRed = workbook.createCellStyle();
        bordersOnlyRed.setBorderBottom(BorderStyle.THIN);
        bordersOnlyRed.setBorderLeft(BorderStyle.THIN);
        bordersOnlyRed.setBorderRight(BorderStyle.THIN);
        bordersOnlyRed.setBorderTop(BorderStyle.THIN);
        bordersOnlyRed.setAlignment(HorizontalAlignment.CENTER);
        bordersOnlyRed.setVerticalAlignment(VerticalAlignment.CENTER);

        XSSFFont font = workbook.createFont();
        font.setFontName(XSSFFont.DEFAULT_FONT_NAME);
        font.setFontHeightInPoints((short)10);
        font.setColor(IndexedColors.RED.getIndex());

        bordersOnlyRed.setFont(font);

        CellStyle bordersOnlyGreen = workbook.createCellStyle();
        bordersOnlyGreen.setBorderBottom(BorderStyle.THIN);
        bordersOnlyGreen.setBorderLeft(BorderStyle.THIN);
        bordersOnlyGreen.setBorderRight(BorderStyle.THIN);
        bordersOnlyGreen.setBorderTop(BorderStyle.THIN);
        bordersOnlyGreen.setAlignment(HorizontalAlignment.CENTER);
        bordersOnlyGreen.setVerticalAlignment(VerticalAlignment.CENTER);

        XSSFFont greenFont = workbook.createFont();
        greenFont.setFontName(XSSFFont.DEFAULT_FONT_NAME);
        greenFont.setFontHeightInPoints((short)10);
        greenFont.setColor(IndexedColors.GREEN.getIndex());

        bordersOnlyGreen.setFont(greenFont);



        Sheet sheet = workbook.createSheet(sheetName);

        Row headingRow1 = sheet.createRow(0);


        sheet.addMergedRegion(new CellRangeAddress(0,0,24,26));

        createCellAddData(headingRow1, 24, "MT 103 Inward 1 month ", MainHeadingCellStyle);

        sheet.addMergedRegion(new CellRangeAddress(0,0,27,29));

        createCellAddData(headingRow1, 27, "MT 103 Outward 1 month ", MainHeadingCellStyle);

        sheet.addMergedRegion(new CellRangeAddress(0,0,30,32));

        createCellAddData(headingRow1, 30, "MT 202 Inward 1 month ", MainHeadingCellStyle);


        sheet.addMergedRegion(new CellRangeAddress(0,0,33,35));

        createCellAddData(headingRow1, 33, "MT 202 Outward 1 month ", MainHeadingCellStyle);




        int rowNum=1;

        Row headingRow = sheet.createRow(rowNum++);
        headingRow.setHeight((short) 900);

        int headingColmIndx = 0;

        createCellAddData(headingRow, headingColmIndx++, "Customer No", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Type", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Name", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CIF Status", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CIF Creation Date", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Category", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Frozen", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Dormant", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Comp_mis_1", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Branch Code", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Cust_ac_no", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Class", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_Desc", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Status", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Open Date", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_dr", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_cr", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_dormant", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_frozen", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Nationality", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Class Description", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "DR_Turnover", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CR_Turnover", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);

        for (Map.Entry<Integer, Volumetric> tdEntry : mainDto.getMapForKuwaitExcelData().entrySet()) {

            LOG.info("RRRRRRRRRRRRRRRr");

            Row row = sheet.createRow(rowNum++);
            int cell = 0;


            createCellAddData(row, cell++, tdEntry.getValue().getCustomerNo(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustomerType(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustomerName1(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCifStatus(), bordersOnly);

            createCellAddData(row, cell++, tdEntry.getValue().getCifCreationDate(), bordersOnly);

            createCellAddData(row, cell++, tdEntry.getValue().getCustomerCategory(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getFrozen(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getDormant(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCompMis1(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getBranchCode(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustAcNo(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccountClass(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcDesc(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCcy(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccStatus(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcOpenDate(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatNoDr(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatNoCr(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatDormant(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatFrozen(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getNationality(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccountClassDescription(), bordersOnly);
            createCellAddData(row, cell++, String.valueOf(tdEntry.getValue().getDrTurnover()), bordersOnly);
            createCellAddData(row, cell++,String.valueOf(tdEntry.getValue().getCrTurnover()), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_count_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_monthly_avg_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_count_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_outward_amt_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_monthly_avg_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_count_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_monthly_avg_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_count_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_monthly_avg_202(), bordersOnly);





        }

        for (int i = 0; i <= sheet.getRow(1).getLastCellNum(); i++) {

            sheet.autoSizeColumn(i);
            int columnWidth = sheet.getColumnWidth(i);
            sheet.setColumnWidth(i, columnWidth + 1000);
        }
        FileOutputStream out = new FileOutputStream(excelFileLocation);
       workbook.write(out);
        out.close();
        LOG.info(" Excel file for Kuwait written successfully on disk at :" + excelFileLocation);
    }
    public void createExcelSheetForQatar(String excelFileLocation, MainDto mainDto) throws Exception {

        LOG.info("***** executing createExcelSheetForQatar ****** ");

        String sheetName="Qatar";
        XSSFWorkbook workbook = new XSSFWorkbook();

        Font headingFont = workbook.createFont();
        headingFont.setBold(true);

        XSSFColor orange = new XSSFColor(new java.awt.Color(182, 207, 242));

        XSSFCellStyle headingCellStyle = workbook.createCellStyle();

        headingCellStyle.setFont(headingFont);
        headingCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headingCellStyle.setFillForegroundColor(orange);
        headingCellStyle.setBorderBottom(BorderStyle.THIN);
        headingCellStyle.setBorderLeft(BorderStyle.THIN);
        headingCellStyle.setBorderRight(BorderStyle.THIN);
        headingCellStyle.setBorderTop(BorderStyle.THIN);
        headingCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        headingCellStyle.setAlignment(HorizontalAlignment.CENTER);
        headingCellStyle.setWrapText(true);

        XSSFColor lightOrange = new XSSFColor(new java.awt.Color(255, 216, 151));

        XSSFCellStyle MainHeadingCellStyle = workbook.createCellStyle();

        MainHeadingCellStyle.setFont(headingFont);
        MainHeadingCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        MainHeadingCellStyle.setFillForegroundColor(lightOrange);
        MainHeadingCellStyle.setBorderBottom(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderLeft(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderRight(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderTop(BorderStyle.THIN);
        MainHeadingCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        MainHeadingCellStyle.setAlignment(HorizontalAlignment.CENTER);
        MainHeadingCellStyle.setWrapText(true);

        CellStyle bordersOnly = workbook.createCellStyle();
        bordersOnly.setBorderBottom(BorderStyle.THIN);
        bordersOnly.setBorderLeft(BorderStyle.THIN);
        bordersOnly.setBorderRight(BorderStyle.THIN);
        bordersOnly.setBorderTop(BorderStyle.THIN);
        bordersOnly.setAlignment(HorizontalAlignment.CENTER);
        bordersOnly.setVerticalAlignment(VerticalAlignment.CENTER);

        CellStyle bordersOnlyRed = workbook.createCellStyle();
        bordersOnlyRed.setBorderBottom(BorderStyle.THIN);
        bordersOnlyRed.setBorderLeft(BorderStyle.THIN);
        bordersOnlyRed.setBorderRight(BorderStyle.THIN);
        bordersOnlyRed.setBorderTop(BorderStyle.THIN);
        bordersOnlyRed.setAlignment(HorizontalAlignment.CENTER);
        bordersOnlyRed.setVerticalAlignment(VerticalAlignment.CENTER);

        XSSFFont font = workbook.createFont();
        font.setFontName(XSSFFont.DEFAULT_FONT_NAME);
        font.setFontHeightInPoints((short)10);
        font.setColor(IndexedColors.RED.getIndex());

        bordersOnlyRed.setFont(font);

        CellStyle bordersOnlyGreen = workbook.createCellStyle();
        bordersOnlyGreen.setBorderBottom(BorderStyle.THIN);
        bordersOnlyGreen.setBorderLeft(BorderStyle.THIN);
        bordersOnlyGreen.setBorderRight(BorderStyle.THIN);
        bordersOnlyGreen.setBorderTop(BorderStyle.THIN);
        bordersOnlyGreen.setAlignment(HorizontalAlignment.CENTER);
        bordersOnlyGreen.setVerticalAlignment(VerticalAlignment.CENTER);

        XSSFFont greenFont = workbook.createFont();
        greenFont.setFontName(XSSFFont.DEFAULT_FONT_NAME);
        greenFont.setFontHeightInPoints((short)10);
        greenFont.setColor(IndexedColors.GREEN.getIndex());

        bordersOnlyGreen.setFont(greenFont);



        Sheet sheet = workbook.createSheet(sheetName);

        Row headingRow1 = sheet.createRow(0);


        sheet.addMergedRegion(new CellRangeAddress(0,0,24,26));

        createCellAddData(headingRow1, 24, "MT 103 Inward 1 month ", MainHeadingCellStyle);

        sheet.addMergedRegion(new CellRangeAddress(0,0,27,29));

        createCellAddData(headingRow1, 27, "MT 103 Outward 1 month ", MainHeadingCellStyle);

        sheet.addMergedRegion(new CellRangeAddress(0,0,30,32));

        createCellAddData(headingRow1, 30, "MT 202 Inward 1 month ", MainHeadingCellStyle);


        sheet.addMergedRegion(new CellRangeAddress(0,0,33,35));

        createCellAddData(headingRow1, 33, "MT 202 Outward 1 month ", MainHeadingCellStyle);


        int rowNum=1;

        Row headingRow = sheet.createRow(rowNum++);
        headingRow.setHeight((short) 900);

        int headingColmIndx = 0;

        createCellAddData(headingRow, headingColmIndx++, "Customer No", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Type", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Name", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CIF Status", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CIF Creation Date", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Category", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Frozen", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Dormant", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Comp_mis_1", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Branch Code", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Cust_ac_no", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Class", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_Desc", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Status", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Open Date", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_dr", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_cr", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_dormant", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_frozen", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Nationality", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Class Description", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "DR_Turnover", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CR_Turnover", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);

        for (Map.Entry<Integer, Volumetric> tdEntry : mainDto.getMapForQatarExcelData().entrySet()) {

            LOG.info("RRRRRRRRRRRRRRRr");

            Row row = sheet.createRow(rowNum++);
            int cell = 0;


            createCellAddData(row, cell++, tdEntry.getValue().getCustomerNo(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustomerType(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustomerName1(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCifStatus(), bordersOnly);

            createCellAddData(row, cell++, tdEntry.getValue().getCifCreationDate(), bordersOnly);

            createCellAddData(row, cell++, tdEntry.getValue().getCustomerCategory(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getFrozen(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getDormant(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCompMis1(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getBranchCode(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustAcNo(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccountClass(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcDesc(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCcy(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccStatus(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcOpenDate(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatNoDr(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatNoCr(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatDormant(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatFrozen(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getNationality(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccountClassDescription(), bordersOnly);
            createCellAddData(row, cell++, String.valueOf(tdEntry.getValue().getDrTurnover()), bordersOnly);
            createCellAddData(row, cell++,String.valueOf(tdEntry.getValue().getCrTurnover()), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_count_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_monthly_avg_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_count_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_outward_amt_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_monthly_avg_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_count_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_monthly_avg_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_count_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_monthly_avg_202(), bordersOnly);





        }

        for (int i = 0; i <= sheet.getRow(1).getLastCellNum(); i++) {

            sheet.autoSizeColumn(i);
            int columnWidth = sheet.getColumnWidth(i);
            sheet.setColumnWidth(i, columnWidth + 1000);
        }
        FileOutputStream out = new FileOutputStream(excelFileLocation);
        workbook.write(out);
        out.close();
        LOG.info(" Excel file for Bahrain written successfully on disk at :" + excelFileLocation);
    }

    public void createExcelSheetForUAE(String excelFileLocation, MainDto mainDto) throws Exception {

        LOG.info("***** executing createExcelSheetForUAE ****** ");

        XSSFWorkbook workbook = new XSSFWorkbook();
        String sheetName="UAE";

        Font headingFont = workbook.createFont();
        headingFont.setBold(true);

        XSSFColor orange = new XSSFColor(new java.awt.Color(182, 207, 242));

        XSSFCellStyle headingCellStyle = workbook.createCellStyle();

        headingCellStyle.setFont(headingFont);
        headingCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headingCellStyle.setFillForegroundColor(orange);
        headingCellStyle.setBorderBottom(BorderStyle.THIN);
        headingCellStyle.setBorderLeft(BorderStyle.THIN);
        headingCellStyle.setBorderRight(BorderStyle.THIN);
        headingCellStyle.setBorderTop(BorderStyle.THIN);
        headingCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        headingCellStyle.setAlignment(HorizontalAlignment.CENTER);
        headingCellStyle.setWrapText(true);

        XSSFColor lightOrange = new XSSFColor(new java.awt.Color(255, 216, 151));

        XSSFCellStyle MainHeadingCellStyle = workbook.createCellStyle();

        MainHeadingCellStyle.setFont(headingFont);
        MainHeadingCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        MainHeadingCellStyle.setFillForegroundColor(lightOrange);
        MainHeadingCellStyle.setBorderBottom(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderLeft(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderRight(BorderStyle.THIN);
        MainHeadingCellStyle.setBorderTop(BorderStyle.THIN);
        MainHeadingCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        MainHeadingCellStyle.setAlignment(HorizontalAlignment.CENTER);
        MainHeadingCellStyle.setWrapText(true);

        CellStyle bordersOnly = workbook.createCellStyle();
        bordersOnly.setBorderBottom(BorderStyle.THIN);
        bordersOnly.setBorderLeft(BorderStyle.THIN);
        bordersOnly.setBorderRight(BorderStyle.THIN);
        bordersOnly.setBorderTop(BorderStyle.THIN);
        bordersOnly.setAlignment(HorizontalAlignment.CENTER);
        bordersOnly.setVerticalAlignment(VerticalAlignment.CENTER);

        CellStyle bordersOnlyRed = workbook.createCellStyle();
        bordersOnlyRed.setBorderBottom(BorderStyle.THIN);
        bordersOnlyRed.setBorderLeft(BorderStyle.THIN);
        bordersOnlyRed.setBorderRight(BorderStyle.THIN);
        bordersOnlyRed.setBorderTop(BorderStyle.THIN);
        bordersOnlyRed.setAlignment(HorizontalAlignment.CENTER);
        bordersOnlyRed.setVerticalAlignment(VerticalAlignment.CENTER);

        XSSFFont font = workbook.createFont();
        font.setFontName(XSSFFont.DEFAULT_FONT_NAME);
        font.setFontHeightInPoints((short)10);
        font.setColor(IndexedColors.RED.getIndex());

        bordersOnlyRed.setFont(font);

        CellStyle bordersOnlyGreen = workbook.createCellStyle();
        bordersOnlyGreen.setBorderBottom(BorderStyle.THIN);
        bordersOnlyGreen.setBorderLeft(BorderStyle.THIN);
        bordersOnlyGreen.setBorderRight(BorderStyle.THIN);
        bordersOnlyGreen.setBorderTop(BorderStyle.THIN);
        bordersOnlyGreen.setAlignment(HorizontalAlignment.CENTER);
        bordersOnlyGreen.setVerticalAlignment(VerticalAlignment.CENTER);

        XSSFFont greenFont = workbook.createFont();
        greenFont.setFontName(XSSFFont.DEFAULT_FONT_NAME);
        greenFont.setFontHeightInPoints((short)10);
        greenFont.setColor(IndexedColors.GREEN.getIndex());

        bordersOnlyGreen.setFont(greenFont);



        Sheet sheet = workbook.createSheet(sheetName);

        Row headingRow1 = sheet.createRow(0);


        sheet.addMergedRegion(new CellRangeAddress(0,0,24,26));

        createCellAddData(headingRow1, 24, "MT 103 Inward 1 month ", MainHeadingCellStyle);

        sheet.addMergedRegion(new CellRangeAddress(0,0,27,29));

        createCellAddData(headingRow1, 27, "MT 103 Outward 1 month ", MainHeadingCellStyle);

        sheet.addMergedRegion(new CellRangeAddress(0,0,30,32));

        createCellAddData(headingRow1, 30, "MT 202 Inward 1 month ", MainHeadingCellStyle);


        sheet.addMergedRegion(new CellRangeAddress(0,0,33,35));

        createCellAddData(headingRow1, 33, "MT 202 Outward 1 month ", MainHeadingCellStyle);


        int rowNum=1;

        Row headingRow = sheet.createRow(rowNum++);
        headingRow.setHeight((short) 900);

        int headingColmIndx = 0;

        createCellAddData(headingRow, headingColmIndx++, "Customer No", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Type", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Name", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CIF Status", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CIF Creation Date", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Customer Category", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Frozen", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Dormant", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Comp_mis_1", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Branch Code", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Cust_ac_no", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Class", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_Desc", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Status", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Open Date", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_dr", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_cr", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_dormant", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Ac_stat_no_frozen", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Nationality", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Account Class Description", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "DR_Turnover", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "CR_Turnover", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Count", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Amount AC CCY", headingCellStyle);
        createCellAddData(headingRow, headingColmIndx++, "Monthly Avg in USD('000)", headingCellStyle);


        for (Map.Entry<Integer, Volumetric> tdEntry : mainDto.getMapForUAEExcelData().entrySet()) {

            LOG.info("RRRRRRRRRRRRRRRr");

            Row row = sheet.createRow(rowNum++);
            int cell = 0;


            createCellAddData(row, cell++, tdEntry.getValue().getCustomerNo(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustomerType(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustomerName1(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCifStatus(), bordersOnly);

            createCellAddData(row, cell++, tdEntry.getValue().getCifCreationDate(), bordersOnly);

            createCellAddData(row, cell++, tdEntry.getValue().getCustomerCategory(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getFrozen(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getDormant(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCompMis1(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getBranchCode(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCustAcNo(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccountClass(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcDesc(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getCcy(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccStatus(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcOpenDate(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatNoDr(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatNoCr(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatDormant(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAcStatFrozen(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getNationality(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getAccountClassDescription(), bordersOnly);
            createCellAddData(row, cell++, String.valueOf(tdEntry.getValue().getDrTurnover()), bordersOnly);
            createCellAddData(row, cell++,String.valueOf(tdEntry.getValue().getCrTurnover()), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_count_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_monthly_avg_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_count_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_outward_amt_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_monthly_avg_103(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_count_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getInward_monthly_avg_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_count_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getTotal_inward_amt_202(), bordersOnly);
            createCellAddData(row, cell++, tdEntry.getValue().getOutward_monthly_avg_202(), bordersOnly);





        }

        for (int i = 0; i <= sheet.getRow(1).getLastCellNum(); i++) {

            sheet.autoSizeColumn(i);
            int columnWidth = sheet.getColumnWidth(i);
            sheet.setColumnWidth(i, columnWidth + 1000);
        }
        FileOutputStream out = new FileOutputStream(excelFileLocation);
       workbook.write(out);
        out.close();
        LOG.info(" Excel file for Bahrain written successfully on disk at :" + excelFileLocation);
    }


    public void createCellAddData(Row row, int cellNo, String cellValue, CellStyle cellStyle) {
        Cell cell = row.createCell(cellNo);
        cell.setCellValue(cellValue);
        cell.setCellStyle(cellStyle);
    }

}