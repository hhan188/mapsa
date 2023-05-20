package practices.practice13.file;

import practices.practice13.utils.TheaterUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImportFile implements BaseFile<TheaterUtils> {

    /*------------------------------------
    Export Data To A List From export.csv
    --------------------------------------*/
    @Override
    public void fileUtil(TheaterUtils theaterUtils) {
        String path = "E:\\mapsa\\ershadkhah\\mapsa\\src\\practices\\practice13\\export.csv";
        File file = new File(path);
        try (Reader reader = new FileReader(file)) {
            List<String> list = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (bufferedReader.ready()) {
                String s = bufferedReader.readLine();
                if (!(s.contains("Un"))) {
                    list.add(s + "\n");
                }
            }
            System.out.println(list);
        } catch (IOException e) {
            System.err.println("Export File Hasn't Created Yet");
        }
    }
}
