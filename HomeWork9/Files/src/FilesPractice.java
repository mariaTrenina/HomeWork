import java.io.*;

public class FilesPractice {
    public static void main(String[] args) {
        try(FileWriter resultFile = new FileWriter("D:\\Projects_java\\HomeWork9\\Resources\\result.txt",false)) {
            File catalog = new File("D:\\Projects_java\\HomeWork9\\Resources");
            File[] files = catalog.listFiles();
            for (File file: files) {
                try(BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line= br.readLine()) != null) {
                        resultFile.write(line+" ");
                    }
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
