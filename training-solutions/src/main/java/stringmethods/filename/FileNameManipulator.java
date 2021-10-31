package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        return str.strip().charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        return fileName.strip().substring(fileName.strip().lastIndexOf(".") + 1);
    }

    public boolean identifyFileByExtension(String ext, String fileName) {
        return ext.strip().equals(findFileExtension(fileName.strip()));
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return findFileNameFromFileNameAndExtension(actualFileName.strip())
                .equals(findFileNameFromFileNameAndExtension(searchedFileName.strip()));
    }

    public String changeExtensionToLowerCase(String fileName) {
        return findFileNameFromFileNameAndExtension(fileName.strip()).concat(".")
                .concat(findFileExtension(fileName.strip()).toLowerCase());
    }

    public String replaceStringPart(String fileName, String present, String target) {
        return fileName.strip().replace(present.strip(), target.strip());
    }

    private String findFileNameFromFileNameAndExtension(String fileNameAndExtension) {
        return fileNameAndExtension.strip().substring
                (0, fileNameAndExtension.lastIndexOf("."));
    }
}
