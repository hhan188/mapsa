package practices.practice13.file;

import practices.practice13.controller.CustomIOException;
import practices.practice13.utils.TheaterUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ExportFile implements BaseFile<TheaterUtils> {


     /*----------------------------------
         Export New File From Our Theater
      -----------------------------------*/
    @Override
    public void fileUtil(TheaterUtils theaterUtils) {
        String path = "D:\\intelij-projects\\maspa\\ershadkhah\\mapsa\\src\\practices\\practice13\\export.csv";
        File file = new File(path);
        try (Writer writer = new FileWriter(file)) {
            writer.write(theaterUtils.availableSeat());
            System.out.println(theaterUtils.availableSeat() + "\nThe Import File Successfully Created");
        } catch (IOException e) {
            throw new CustomIOException("File Unknown Exception");
        }
    }
}
