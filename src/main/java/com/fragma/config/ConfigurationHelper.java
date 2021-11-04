package com.fragma.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "conf")
public class ConfigurationHelper {

    private static  String bahrainCIFlevelquery;
    private static String bahrainAccountlevelquery;

    private  static String kuwaitCIFlevelquery;
    private static String kuwaitAccountlevelquery;

    private static String qatarCIFlevelquery;
    private static String qatarAccountlevelquery;

    private static String  uaeCIFlevelquery;
    private static String uaeAccountlevelquery;

    private static String excelQueryForBahrain;
    private static String excelQueryForKuwait ;
    private static String excelQueryForQatar ;
    private static String excelQueryForUAE ;


    private static String excelLocationForBahrain;
    private static String excelLocationForKuwait;
    private static String excelLocationForQatar;
    private static String excelLocationForUAE;

    public static String getBahrainCIFlevelquery() {
        return bahrainCIFlevelquery;
    }

    public static void setBahrainCIFlevelquery(String bahrainCIFlevelquery) {
        ConfigurationHelper.bahrainCIFlevelquery = bahrainCIFlevelquery;
    }

    public static String getBahrainAccountlevelquery() {
        return bahrainAccountlevelquery;
    }

    public static void setBahrainAccountlevelquery(String bahrainAccountlevelquery) {
        ConfigurationHelper.bahrainAccountlevelquery = bahrainAccountlevelquery;
    }

    public static String getKuwaitCIFlevelquery() {
        return kuwaitCIFlevelquery;
    }

    public static void setKuwaitCIFlevelquery(String kuwaitCIFlevelquery) {
        ConfigurationHelper.kuwaitCIFlevelquery = kuwaitCIFlevelquery;
    }

    public static String getKuwaitAccountlevelquery() {
        return kuwaitAccountlevelquery;
    }

    public static void setKuwaitAccountlevelquery(String kuwaitAccountlevelquery) {
        ConfigurationHelper.kuwaitAccountlevelquery = kuwaitAccountlevelquery;
    }

    public static String getQatarCIFlevelquery() {
        return qatarCIFlevelquery;
    }

    public static void setQatarCIFlevelquery(String qatarCIFlevelquery) {
        ConfigurationHelper.qatarCIFlevelquery = qatarCIFlevelquery;
    }

    public static String getQatarAccountlevelquery() {
        return qatarAccountlevelquery;
    }

    public static void setQatarAccountlevelquery(String qatarAccountlevelquery) {
        ConfigurationHelper.qatarAccountlevelquery = qatarAccountlevelquery;
    }

    public static String getUaeCIFlevelquery() {
        return uaeCIFlevelquery;
    }

    public static void setUaeCIFlevelquery(String uaeCIFlevelquery) {
        ConfigurationHelper.uaeCIFlevelquery = uaeCIFlevelquery;
    }

    public static String getUaeAccountlevelquery() {
        return uaeAccountlevelquery;
    }

    public static void setUaeAccountlevelquery(String uaeAccountlevelquery) {
        ConfigurationHelper.uaeAccountlevelquery = uaeAccountlevelquery;
    }

    public static String getExcelQueryForBahrain() {
        return excelQueryForBahrain;
    }

    public static void setExcelQueryForBahrain(String excelQueryForBahrain) {
        ConfigurationHelper.excelQueryForBahrain = excelQueryForBahrain;
    }

    public static String getExcelQueryForKuwait() {
        return excelQueryForKuwait;
    }

    public static void setExcelQueryForKuwait(String excelQueryForKuwait) {
        ConfigurationHelper.excelQueryForKuwait = excelQueryForKuwait;
    }

    public static String getExcelQueryForQatar() {
        return excelQueryForQatar;
    }

    public static void setExcelQueryForQatar(String excelQueryForQatar) {
        ConfigurationHelper.excelQueryForQatar = excelQueryForQatar;
    }

    public static String getExcelQueryForUAE() {
        return excelQueryForUAE;
    }

    public static void setExcelQueryForUAE(String excelQueryForUAE) {
        ConfigurationHelper.excelQueryForUAE = excelQueryForUAE;
    }

    public static String getExcelLocationForBahrain() {
        return excelLocationForBahrain;
    }

    public static void setExcelLocationForBahrain(String excelLocationForBahrain) {
        ConfigurationHelper.excelLocationForBahrain = excelLocationForBahrain;
    }

    public static String getExcelLocationForKuwait() {
        return excelLocationForKuwait;
    }

    public static void setExcelLocationForKuwait(String excelLocationForKuwait) {
        ConfigurationHelper.excelLocationForKuwait = excelLocationForKuwait;
    }

    public static String getExcelLocationForQatar() {
        return excelLocationForQatar;
    }

    public static void setExcelLocationForQatar(String excelLocationForQatar) {
        ConfigurationHelper.excelLocationForQatar = excelLocationForQatar;
    }

    public static String getExcelLocationForUAE() {
        return excelLocationForUAE;
    }

    public static void setExcelLocationForUAE(String excelLocationForUAE) {
        ConfigurationHelper.excelLocationForUAE = excelLocationForUAE;
    }
}
