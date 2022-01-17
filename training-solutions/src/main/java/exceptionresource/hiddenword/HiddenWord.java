package exceptionresource.hiddenword;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        StringBuilder sb = new StringBuilder("");
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;
            while ((line = bf.readLine()) != null) {
                sb.append(getCharFomLine(line));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not read.", ioe);
        }
        return sb.toString();
    }

    private char getCharFomLine(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (Character.isAlphabetic(line.charAt(i))) {
                return line.charAt(i);
            }
        }
        return ' ';
    }
}
