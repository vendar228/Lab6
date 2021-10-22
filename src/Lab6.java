import java.io.*;
import java.util.Scanner;

public class Lab6 {
    public static boolean checkWordPal(String str) throws IOException {
        int len = str.length();
        for (int i = 0; i < len / 2; ++i) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkFirstLastString(String str) {
        int len = str.length();
        if(str.charAt(0)!=str.charAt(len-1)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        InputStream in = null;
        Reader file = null;
        BufferedReader buf = null;
        OutputStream out = null;
        Writer wr = null;
        try {
            in = new FileInputStream("C:\\Java\\in.txt");
            file = new InputStreamReader(in, "utf-8");
            buf = new BufferedReader(file);
            File f2 = new File("C:\\Java\\in.txt");
            f2.createNewFile();
            out = new FileOutputStream(f2);
            wr = new OutputStreamWriter(out, "utf-8");
            if (f2.exists()) {
                String line = " ";
                String[] words;
                while ((line = buf.readLine()) != null) {
                    words = line.split(" ");
                    for (int i = 0; i < words.length; i++) {
                        if(words[i].length() % 2 == 0){
                            wr.append(words[i] + " ");
                        }
                    }
                    wr.append("\n");
                }
            }

        } catch (IOException e) {

        } finally {
            in.close();
            file.close();
            buf.close();
            wr.flush();
            wr.close();
            out.close();
        }
    }
}


