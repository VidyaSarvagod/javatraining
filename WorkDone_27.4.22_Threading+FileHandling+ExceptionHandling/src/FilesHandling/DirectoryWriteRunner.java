package FilesHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DirectoryWriteRunner {
    public static void main(String[] args) throws IOException {

        Path pathFileToRead = Paths.get("./resource/xyz.txt");
        List<String> list=List.of("abc","ss","dd","Vidya");
        Files.write(Path.of("./resource/xyz.txt"),list);


    }
}
