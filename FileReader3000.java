import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader3000 {

    public static void main(String [] args) throws IOException {

        File file = new File("C:\\Users\\ASUS TUF\\Downloads\\captmidn.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "THIS IS A NEW FILE MADE BY US";
        while(scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }
        FileWriter writer = new FileWriter("C:\\Users\\ASUS TUF\\Downloads\\newfile.txt");
        writer.write(fileContent);
        writer.close();
    }

}
