package ChapterFifteen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathLesson {
    public static void main(String[] args) {

//        Path path = Paths.get("a:/b/c/../../");
//
//        //How static in interface deferes from static method in classes
//        System.out.println("System Separator:: " +System.getProperty("file.separator"));
//        System.out.println("Normal path:: " +path.normalize());
//        System.out.println("Filename:: " +path.getFileName());
//        System.out.println("File system:: " +path.getFileSystem());
//        System.out.println("Path root:: " +path.getRoot());


        Path path = Path.of("C:\\Users\\ADMIN\\IdeaProjects\\" +
                "javaProjects\\src\\ChapterEight\\KnightTourDisplay.java");
        try {
            Path filePath = Files.createFile(path);

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
