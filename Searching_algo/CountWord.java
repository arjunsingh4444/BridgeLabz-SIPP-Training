package BridgeLabz_SIPP_Training.Searching_algo;

import java.io.*;

public class CountWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String word = "java";
        int count = 0;
        String line;

        while ((line = br.readLine()) != null)
            for (String w : line.split("\\s+"))
                if (w.equals(word))
                    count++;

        System.out.println(count);
      
    }
}

