package com.tmb.utils;

import com.tmb.constants.FrameworkConstants;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class DataProviderUtils {

    private DataProviderUtils(){

    }

    private static List<Map<String, String>> list = new ArrayList<>();

    @DataProvider(parallel = true)
    public static Object[] getData(Method method) {

        String testName = method.getName();

        if (list.isEmpty()) {
            list = ExcelUtils.getTestDetails(FrameworkConstants.getITERATIONDATASHEET());
        }

        List<Map<String, String>> iterationList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get("testname").equalsIgnoreCase(testName) &&
                list.get(i).get("execute").equalsIgnoreCase("yes")) {
                    iterationList.add(list.get(i));
                    //iterationList contains only test method whichever we calling
                }
        }

        return iterationList.toArray();
    }

}
