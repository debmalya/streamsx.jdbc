package com.ibm.streamsx.jdbc;


import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.text.MessageFormat;

public class Messages {
    private static final String BUNDLE_NAME = "com.ibm.streamsx.jdbc.messages.messages"; 

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

    private Messages() {
    }
/*    
    public static String getString(String key) {
        try {
            return RESOURCE_BUNDLE.getString(key);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        } 
    }
 */
    
  public static String getString(String key, Object... params  ) {
        try {
            return MessageFormat.format(RESOURCE_BUNDLE.getString(key), params);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

} 
