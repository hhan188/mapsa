package jalase11;

import java.io.File;
public class FileLesson {
    public static void main(String[] args) {
        File myFile=new File("/Users/mersedeh/IdeaProjects/untitled5/src/Practice10");//directory
        System.out.println(myFile.exists());
        System.out.println(myFile.getAbsolutePath());
        System.out.println("is file: "+myFile.isFile());
        System.out.println("is directory:"+myFile.isDirectory());

        String[] ls=myFile.list();//directory
        for (String item:ls){
            System.out.println(item);
        }
        File[] lsFile=myFile.listFiles();

        for (File item:lsFile){
            System.out.println(item.getName()+"  "+item.isDirectory());

        }


        File newDir=new File("/Users/mersedeh/IdeaProjects/untitled5/src/input2.txt");
        System.out.println(newDir.mkdirs());//?

        File yann=new File("/Users/mersedeh/IdeaProjects/untitled5/src/input.txt");//file
        System.out.println("result move file :"+yann.renameTo(new File("/Users/mersedeh/IdeaProjects/untitled5/src/input2.txt")));

    }

}
