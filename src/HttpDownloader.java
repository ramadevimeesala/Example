
import java.io.IOException;
 
public class HttpDownloader {
 
    public static void main(String[] args) {
        String fileURL = "https://people.sc.fsu.edu/~jburkardt/data/csv/addresses.csv";
        String saveDir = "D:/Download";
        try {
            scv.downloadFile(fileURL, saveDir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
