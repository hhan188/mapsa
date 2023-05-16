package tamrin12.p2;

import java.io.*;
import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {

        System.out.println("Word Replacer");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file path include file name (eg: c:\\test.txt)");
        String filePathName = sc.nextLine().trim();
        System.out.println("Enter target word to replace:");
        String target = sc.nextLine().trim();
        System.out.println("Enter replacement word to replace with target word:");
        String replacement = sc.nextLine().trim();


        replacer(filePathName,target, replacement);
        copyFile(filePathName+"1",filePathName);
        File temp = new File(filePathName+"1");
        temp.delete();
    }
    public static void replacer(String filename, String target, String replacement){

        String line;
        String newLine;

        try (BufferedReader br = new BufferedReader(new FileReader(filename));
             BufferedWriter bw = new BufferedWriter(new FileWriter(filename+"1"))) {
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                newLine = line.replace(target,replacement);
                //System.out.println(newLine);
                bw.write(newLine,0,newLine.length());
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException Occurred");
        } catch (IOException e) {
            System.out.println("IOException Occurred");
        }
    }


    public static void copyFile(String src, String dst){

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dst))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
