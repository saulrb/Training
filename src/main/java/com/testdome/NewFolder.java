package com.testdome;

import java.util.List;

public class NewFolder {

   static  String defaultName = "New Folder";
   static  String appendedNumber = " (%d)";

    public static String generateNewFolderName(List<String> existingFolders) {

        System.out.println(String.format(defaultName+appendedNumber,2));
        existingFolders.forEach( folderName -> {
            var pos = folderName.indexOf("(");
            var number = folderName.charAt(pos+1);

        });
        return null;
    }

    public static void main(String[] args) {
        List<String> existingFolders = List.of("New Folder", "New Folder (3)", "New Folder (4)");

        // Should print: "New Folder (2)"
        System.out.println(generateNewFolderName(existingFolders));
    }
}