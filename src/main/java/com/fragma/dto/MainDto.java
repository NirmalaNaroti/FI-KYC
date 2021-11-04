package com.fragma.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class MainDto {

    static Logger LOG = LoggerFactory.getLogger(MainDto.class);

    public long bahrainCIFLevelCount;
    public long bahrainAccountLevelCount;

    public long kuwaitCIFLevelCount;
    public long kuwaitAccountLevelCount;

    public long qatarCIFLevelCount;
    public long qatarAccountLevelCount;

    public long uaeCIFLevelCount;
    public long uaeAccountLevelCount;

    public Map<Integer, Volumetric> mapForBahrainExcelData = new HashMap<>();
    public Map<Integer, Volumetric> mapForKuwaitExcelData = new HashMap<>();
    public Map<Integer, Volumetric> mapForQatarExcelData = new HashMap<>();
    public Map<Integer, Volumetric> mapForUAEExcelData = new HashMap<>();

    public Map<Integer, Volumetric> getMapForBahrainExcelData() {
        return mapForBahrainExcelData;
    }

    public Map<Integer, Volumetric> getMapForKuwaitExcelData() {
        return mapForKuwaitExcelData;
    }

    public Map<Integer, Volumetric> getMapForQatarExcelData() {
        return mapForQatarExcelData;
    }

    public Map<Integer, Volumetric> getMapForUAEExcelData() {
        return mapForUAEExcelData;
    }

    public LocalDate todayDate;

    public LocalDate getTodayDate() {
        return todayDate;
    }

    public  LocalDate getYesturDay()
    {
        return todayDate.minusDays(1);
    }
    public String subDate(){
        LocalDate yesturday=todayDate.minusDays(1);
        String date = yesturday.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return date;

    }

    public void setTodayDate(LocalDate todayDate) {
        this.todayDate = todayDate;
    }




    public long getBahrainCIFLevelCount() {
        return bahrainCIFLevelCount;
    }

    public void setBahrainCIFLevelCount(long bharainCIFLevelCount) {
        this.bahrainCIFLevelCount = bharainCIFLevelCount;
    }

    public long getBahrainAccountLevelCount() {
        return bahrainAccountLevelCount;
    }

    public void setBahrainAccountLevelCount(long bharainAccountLevelCount) {
        this.bahrainAccountLevelCount = bharainAccountLevelCount;
    }

    public long getKuwaitCIFLevelCount() {
        return kuwaitCIFLevelCount;
    }

    public void setKuwaitCIFLevelCount(long kuwaitCIFLevelCount) {
        this.kuwaitCIFLevelCount = kuwaitCIFLevelCount;
    }

    public long getKuwaitAccountLevelCount() {
        return kuwaitAccountLevelCount;
    }

    public void setKuwaitAccountLevelCount(long kuwaitAccountLevelCount) {
        this.kuwaitAccountLevelCount = kuwaitAccountLevelCount;
    }

    public long getQatarCIFLevelCount() {
        return qatarCIFLevelCount;
    }

    public void setQatarCIFLevelCount(long qatarCIFLevelCount) {
        this.qatarCIFLevelCount = qatarCIFLevelCount;
    }

    public long getQatarAccountLevelCount() {
        return qatarAccountLevelCount;
    }

    public void setQatarAccountLevelCount(long qatarAccountLevelCount) {
        this.qatarAccountLevelCount = qatarAccountLevelCount;
    }

    public long getUaeCIFLevelCount() {
        return uaeCIFLevelCount;
    }

    public void setUaeCIFLevelCount(long uaeCIFLevelCount) {
        this.uaeCIFLevelCount = uaeCIFLevelCount;
    }

    public long getUaeAccountLevelCount() {
        return uaeAccountLevelCount;
    }

    public void setUaeAccountLevelCount(long uaeAccountLevelCount) {
        this.uaeAccountLevelCount = uaeAccountLevelCount;
    }

    public void papulateBahrainExcelData(int SLNo, String customerNo, String customerType, String customerName1, String cifStatus, String cifCreationDate, String customerCategory, String frozen, String dormant, String compMis1, String branchCode, String custAcNo, String accountClass, String acDesc, String ccy, String accStatus, String acOpenDate, String acStatNoDr, String acStatNoCr, String acStatDormant, String acStatFrozen, String nationality, String accountClassDescription, double drTurnover, double crTurnover, String inward_count_103, String total_inward_amt_103, String inward_monthly_avg_103, String outward_count_103, String total_outward_amt_103, String outward_monthly_avg_103, String inward_count_202, String total_inward_amt_202, String inward_monthly_avg_202, String outward_count_202, String total_outward_amt_202, String outward_monthly_avg_202) {

        Volumetric volumetric = mapForBahrainExcelData.get(SLNo);

        if (volumetric == null) {
            volumetric = new Volumetric();
        }
        volumetric.setCustomerNo(customerNo);
        volumetric.setCustomerType(customerType);
        volumetric.setCustomerName1(customerName1);
        volumetric.setCifStatus(cifStatus);
        volumetric.setCifCreationDate(cifCreationDate);
        volumetric.setCustomerCategory(customerCategory);
        volumetric.setFrozen(frozen);
        volumetric.setDormant(dormant);
        volumetric.setCompMis1(compMis1);
        volumetric.setBranchCode(branchCode);
        volumetric.setCustAcNo(custAcNo);
        volumetric.setAccountClass(accountClass);
        volumetric.setAcDesc(acDesc);
        volumetric.setCcy(ccy);
        volumetric.setAccStatus(accStatus);
        volumetric.setAcOpenDate(acOpenDate);
        volumetric.setAcStatNoDr(acStatNoDr);
        volumetric.setAcStatNoCr(acStatNoCr);
        volumetric.setAcStatDormant(acStatDormant);
        volumetric.setAcStatFrozen(acStatFrozen);
        volumetric.setNationality(nationality);
        volumetric.setAccountClassDescription(accountClassDescription);
        volumetric.setDrTurnover(drTurnover);
        volumetric.setCrTurnover(crTurnover);
        volumetric.setInward_count_103(inward_count_103);
        volumetric.setTotal_inward_amt_103(total_inward_amt_103);
        volumetric.setInward_monthly_avg_103(inward_monthly_avg_103);
        volumetric.setOutward_count_103(outward_count_103);
        volumetric.setTotal_outward_amt_103(total_outward_amt_103);
        volumetric.setOutward_monthly_avg_103(outward_monthly_avg_103);
        volumetric.setInward_count_202(inward_count_202);
        volumetric.setTotal_inward_amt_202(total_inward_amt_202);
        volumetric.setInward_monthly_avg_202(inward_monthly_avg_202);
        volumetric.setOutward_count_202(outward_count_202);

        mapForBahrainExcelData.put(SLNo,volumetric);
    }

    public void papulateKuwaitExcelData(int SLNo, String customerNo, String customerType, String customerName1, String cifStatus, String cifCreationDate, String customerCategory, String frozen, String dormant, String compMis1, String branchCode, String custAcNo, String accountClass, String acDesc, String ccy, String accStatus, String acOpenDate, String acStatNoDr, String acStatNoCr, String acStatDormant, String acStatFrozen, String nationality, String accountClassDescription, double drTurnover, double crTurnover, String inward_count_103, String total_inward_amt_103, String inward_monthly_avg_103, String outward_count_103, String total_outward_amt_103, String outward_monthly_avg_103, String inward_count_202, String total_inward_amt_202, String inward_monthly_avg_202, String outward_count_202, String total_outward_amt_202, String outward_monthly_avg_202) {

        Volumetric volumetric = mapForKuwaitExcelData.get(SLNo);

        if (volumetric == null) {
            volumetric = new Volumetric();
        }
        volumetric.setCustomerNo(customerNo);
        volumetric.setCustomerType(customerType);
        volumetric.setCustomerName1(customerName1);
        volumetric.setCifStatus(cifStatus);
        volumetric.setCifCreationDate(cifCreationDate);
        volumetric.setCustomerCategory(customerCategory);
        volumetric.setFrozen(frozen);
        volumetric.setDormant(dormant);
        volumetric.setCompMis1(compMis1);
        volumetric.setBranchCode(branchCode);
        volumetric.setCustAcNo(custAcNo);
        volumetric.setAccountClass(accountClass);
        volumetric.setAcDesc(acDesc);
        volumetric.setCcy(ccy);
        volumetric.setAccStatus(accStatus);
        volumetric.setAcOpenDate(acOpenDate);
        volumetric.setAcStatNoDr(acStatNoDr);
        volumetric.setAcStatNoCr(acStatNoCr);
        volumetric.setAcStatDormant(acStatDormant);
        volumetric.setAcStatFrozen(acStatFrozen);
        volumetric.setNationality(nationality);
        volumetric.setAccountClassDescription(accountClassDescription);
        volumetric.setDrTurnover(drTurnover);
        volumetric.setCrTurnover(crTurnover);
        volumetric.setInward_count_103(inward_count_103);
        volumetric.setTotal_inward_amt_103(total_inward_amt_103);
        volumetric.setInward_monthly_avg_103(inward_monthly_avg_103);
        volumetric.setOutward_count_103(outward_count_103);
        volumetric.setTotal_outward_amt_103(total_outward_amt_103);
        volumetric.setOutward_monthly_avg_103(outward_monthly_avg_103);
        volumetric.setInward_count_202(inward_count_202);
        volumetric.setTotal_inward_amt_202(total_inward_amt_202);
        volumetric.setInward_monthly_avg_202(inward_monthly_avg_202);
        volumetric.setOutward_count_202(outward_count_202);

        mapForKuwaitExcelData.put(SLNo,volumetric);
    }

    public void papulateQatarExcelData(int SLNo, String customerNo, String customerType, String customerName1, String cifStatus, String cifCreationDate, String customerCategory, String frozen, String dormant, String compMis1, String branchCode, String custAcNo, String accountClass, String acDesc, String ccy, String accStatus, String acOpenDate, String acStatNoDr, String acStatNoCr, String acStatDormant, String acStatFrozen, String nationality, String accountClassDescription, double drTurnover, double crTurnover, String inward_count_103, String total_inward_amt_103, String inward_monthly_avg_103, String outward_count_103, String total_outward_amt_103, String outward_monthly_avg_103, String inward_count_202, String total_inward_amt_202, String inward_monthly_avg_202, String outward_count_202, String total_outward_amt_202, String outward_monthly_avg_202) {

        Volumetric volumetric = mapForQatarExcelData.get(SLNo);

        if (volumetric == null) {
            volumetric = new Volumetric();
        }
        volumetric.setCustomerNo(customerNo);
        volumetric.setCustomerType(customerType);
        volumetric.setCustomerName1(customerName1);
        volumetric.setCifStatus(cifStatus);
        volumetric.setCifCreationDate(cifCreationDate);
        volumetric.setCustomerCategory(customerCategory);
        volumetric.setFrozen(frozen);
        volumetric.setDormant(dormant);
        volumetric.setCompMis1(compMis1);
        volumetric.setBranchCode(branchCode);
        volumetric.setCustAcNo(custAcNo);
        volumetric.setAccountClass(accountClass);
        volumetric.setAcDesc(acDesc);
        volumetric.setCcy(ccy);
        volumetric.setAccStatus(accStatus);
        volumetric.setAcOpenDate(acOpenDate);
        volumetric.setAcStatNoDr(acStatNoDr);
        volumetric.setAcStatNoCr(acStatNoCr);
        volumetric.setAcStatDormant(acStatDormant);
        volumetric.setAcStatFrozen(acStatFrozen);
        volumetric.setNationality(nationality);
        volumetric.setAccountClassDescription(accountClassDescription);
        volumetric.setDrTurnover(drTurnover);
        volumetric.setCrTurnover(crTurnover);
        volumetric.setInward_count_103(inward_count_103);
        volumetric.setTotal_inward_amt_103(total_inward_amt_103);
        volumetric.setInward_monthly_avg_103(inward_monthly_avg_103);
        volumetric.setOutward_count_103(outward_count_103);
        volumetric.setTotal_outward_amt_103(total_outward_amt_103);
        volumetric.setOutward_monthly_avg_103(outward_monthly_avg_103);
        volumetric.setInward_count_202(inward_count_202);
        volumetric.setTotal_inward_amt_202(total_inward_amt_202);
        volumetric.setInward_monthly_avg_202(inward_monthly_avg_202);
        volumetric.setOutward_count_202(outward_count_202);

        mapForQatarExcelData.put(SLNo,volumetric);
    }

    public void papulateUAEExcelData(int SLNo, String customerNo, String customerType, String customerName1, String cifStatus, String cifCreationDate, String customerCategory, String frozen, String dormant, String compMis1, String branchCode, String custAcNo, String accountClass, String acDesc, String ccy, String accStatus, String acOpenDate, String acStatNoDr, String acStatNoCr, String acStatDormant, String acStatFrozen, String nationality, String accountClassDescription, double drTurnover, double crTurnover, String inward_count_103, String total_inward_amt_103, String inward_monthly_avg_103, String outward_count_103, String total_outward_amt_103, String outward_monthly_avg_103, String inward_count_202, String total_inward_amt_202, String inward_monthly_avg_202, String outward_count_202, String total_outward_amt_202, String outward_monthly_avg_202) {

        Volumetric volumetric = mapForUAEExcelData.get(SLNo);

        if (volumetric == null) {
            volumetric = new Volumetric();
        }
        volumetric.setCustomerNo(customerNo);
        volumetric.setCustomerType(customerType);
        volumetric.setCustomerName1(customerName1);
        volumetric.setCifStatus(cifStatus);
        volumetric.setCifCreationDate(cifCreationDate);
        volumetric.setCustomerCategory(customerCategory);
        volumetric.setFrozen(frozen);
        volumetric.setDormant(dormant);
        volumetric.setCompMis1(compMis1);
        volumetric.setBranchCode(branchCode);
        volumetric.setCustAcNo(custAcNo);
        volumetric.setAccountClass(accountClass);
        volumetric.setAcDesc(acDesc);
        volumetric.setCcy(ccy);
        volumetric.setAccStatus(accStatus);
        volumetric.setAcOpenDate(acOpenDate);
        volumetric.setAcStatNoDr(acStatNoDr);
        volumetric.setAcStatNoCr(acStatNoCr);
        volumetric.setAcStatDormant(acStatDormant);
        volumetric.setAcStatFrozen(acStatFrozen);
        volumetric.setNationality(nationality);
        volumetric.setAccountClassDescription(accountClassDescription);
        volumetric.setDrTurnover(drTurnover);
        volumetric.setCrTurnover(crTurnover);
        volumetric.setInward_count_103(inward_count_103);
        volumetric.setTotal_inward_amt_103(total_inward_amt_103);
        volumetric.setInward_monthly_avg_103(inward_monthly_avg_103);
        volumetric.setOutward_count_103(outward_count_103);
        volumetric.setTotal_outward_amt_103(total_outward_amt_103);
        volumetric.setOutward_monthly_avg_103(outward_monthly_avg_103);
        volumetric.setInward_count_202(inward_count_202);
        volumetric.setTotal_inward_amt_202(total_inward_amt_202);
        volumetric.setInward_monthly_avg_202(inward_monthly_avg_202);
        volumetric.setOutward_count_202(outward_count_202);

        mapForUAEExcelData.put(SLNo,volumetric);
    }

}
