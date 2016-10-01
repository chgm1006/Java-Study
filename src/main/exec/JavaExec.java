package exec;

import java.io.*;

/**
 * Created by Forrest on 2016. 9. 29..
 */
public class JavaExec {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        String command = "ls -al";
        Process exec = runtime.exec(command);

//        InputStream inputStream = exec.getInputStream();
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = null;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }

//        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("./ls");

        InputStream inputStream1 = exec.getInputStream();
        InputStreamReader inputStreamReader1 = new InputStreamReader(inputStream1);
        BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader1);
        while ((line = bufferedReader1.readLine()) != null) {
            fileWriter.write(line+"\r\n");
        }
        fileWriter.close();
    }
}
