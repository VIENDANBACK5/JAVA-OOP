

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class thuchanh {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("Hello.txt");
            br = new BufferedReader(fr);
            String line;

            // Đọc từng dòng và in ra
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Đóng tài nguyên
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException ex) {
                System.out.println("Error while closing the file: " + ex.getMessage());
            }
        }
    }
}
