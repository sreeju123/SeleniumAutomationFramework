package com.tmb.utils;

import com.tmb.constants.FrameworkConstants;
import com.tmb.enums.ConfigProperties;
import com.tmb.exceptions.PropertyFileNotFoundException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class PropertyUtils {

    private PropertyUtils() {

    }

    private static Properties properties = new Properties();
    private static final Map<String, String> CONFIGMAP = new HashMap<>();

    static {
        try (FileInputStream file = new FileInputStream(FrameworkConstants.getCONFIGFILEPATH())) {

            properties.load(file);

            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }


    }


//    public static String getValue(String key) throws Exception {
//        if (Objects.isNull(key) || Objects.isNull(properties.getProperty(key))) {
//            throw new Exception("Property name " + key + " is not found Please check config.properties");
//        }
//        return properties.getProperty(key);
//    }

    public static String get(ConfigProperties key) {
        if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
            throw new PropertyFileNotFoundException("Property name " + key + " is not found Please check config.properties");
        }
        return CONFIGMAP.get(key.name().toLowerCase());
    }

}
