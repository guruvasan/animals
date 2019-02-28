package com.util;

public class AnimalUtil
{


    public static String roosterSound(String localeDisplayLanguage) {

        System.out.println("Received Display Language :: "+localeDisplayLanguage);
        switch (localeDisplayLanguage) {
           case "Danish":
               return "kykyliky";
            case "Dutch":
                return "kukeleku";
            case "Finnish":
                return "kukko kiekuu";
            case "French":
                return "cocorico";
            case "German":
                return "kikeriki";
            case "Greek":
                return "kikiriki";
            case "Tamil":
                return "kokra kok kooo";
            default:
                return "Cock-a-doodle-doo";  // default
        }
    }

}
