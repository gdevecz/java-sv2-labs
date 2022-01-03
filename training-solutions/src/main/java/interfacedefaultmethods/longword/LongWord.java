package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {

    @Override
    public String getLongWord() {
        List<String> matrix = readFromFile(Path.of("src/test/resources/longword.txt"));
        StringBuilder sb = new StringBuilder(matrix.get(0));
        boolean first = true;
        for (String str : matrix) {
            if (first) {
                first = false;
            } else {
                sb.append(str.charAt(str.length() - 1));
            }
        }
        return sb.toString();
    }
}
