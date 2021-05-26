package com.tmb.constants;

public final class FrameworkConstants {

    private FrameworkConstants() {

    }

    private static final String RESOURCERPATH = System.getProperty("user.dir") + "/src/test/resources";
    private static final String CHROMDRIVERPATH = RESOURCERPATH + "/executables/chromedriver.exe";
    private static final String GECKODRIVERPATH = RESOURCERPATH + "/executables/geckodriver.exe";
    private static final String CONFIGFILEPATH = RESOURCERPATH + "/config/config.properties";
    private static final String EXTENTREPORTPATH = RESOURCERPATH + "/extent-test-output/index.html";
    private static final String EXCELPATH = RESOURCERPATH + "/excel/testdata.xlsx";
    private static final String RUNMANAGERSHEET = "RUNMANAGER";
    private static final String ITERATIONDATASHEET =  "DATA";

    private static final int EXPLICITWAIT = 30;


    public static String getChromeDriverPath() {
        return CHROMDRIVERPATH;
    }

    public static String getGeckoDriverPath() {
        return GECKODRIVERPATH;
    }

    public static String getCONFIGFILEPATH() {
        return CONFIGFILEPATH;
    }

    public static int getEXPLICITWAIT() {
        return EXPLICITWAIT;
    }

    public static String getEXTENTREPORTPATH() {
        return EXTENTREPORTPATH;
    }

    public static String getEXCELPATH() {
        return EXCELPATH;
    }

    public static String getRUNMANAGERSHEET() {
        return RUNMANAGERSHEET;
    }

    public static String getITERATIONDATASHEET() {
        return ITERATIONDATASHEET;
    }

}
