package stringmethods.filename;

public class FileNameManipulatorMain {

    public static void main(String[] args) {

        FileNameManipulator fnm = new FileNameManipulator();
        String fileName1 = "akarmi.valami.ext";
        String fileName2 = "akarmi.valami.mas";
        String fileName3 = "ez.nem.semmi.ext";

        System.out.println("Filenevek:");
        System.out.println(fileName1);
        System.out.println(fileName2);
        System.out.println(fileName3);
        System.out.println("utolsó karakter:");
        System.out.println(fileName1 + ":" + fnm.findLastCharacter(fileName1));
        System.out.println(fileName2 + ":" + fnm.findLastCharacter(fileName2));
        System.out.println(fileName3 + ":" + fnm.findLastCharacter(fileName3));
        System.out.println("kiterjesztés:");
        System.out.println(fileName1 + ":" + fnm.findFileExtension(fileName1));
        System.out.println(fileName2 + ":" + fnm.findFileExtension(fileName2));
        System.out.println(fileName3 + ":" + fnm.findFileExtension(fileName3));
        System.out.println("fájl kiterjesztés vizsgálat (.ext):");
        System.out.println(fileName1 + ":" + fnm.identifyFileByExtension("ext", fileName1));
        System.out.println(fileName2 + ":" + fnm.identifyFileByExtension("ext", fileName2));
        System.out.println(fileName3 + ":" + fnm.identifyFileByExtension("ext", fileName3));
        System.out.println("fájlnevek összehasonlítása ( -ext)");
        System.out.println(fileName1 + "," + fileName2 + ":" + fnm.compareFilesByName(fileName1, fileName2));
        System.out.println(fileName1 + "," + fileName3 + ":" + fnm.compareFilesByName(fileName1, fileName3));
        System.out.println(fileName2 + "," + fileName3 + ":" + fnm.compareFilesByName(fileName2, fileName3));
        System.out.println("kiterjesztés kisbetűsre (akarmi.valami.ExT)");
        System.out.println(fnm.changeExtensionToLowerCase("akarmi.valami.ExT"));
        System.out.println("filenév módosítás alam -> elem");
        System.out.println(fnm.replaceStringPart(fileName1, "alam", "emel"));
    }
}
