import java.io.*;
//When working with files try not to lose memory
// files have to be in root directory
public class Closing {
    public static void main(String[] args) {
        var file = new File("hello.txt");
        System.out.println("File Exists: " + file.exists());

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader);) {
            var text = br.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
