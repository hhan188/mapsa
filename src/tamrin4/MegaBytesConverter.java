package tamrin4;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int magaByte = kiloBytes / 1024;
        System.out.println(kiloBytes + " KB = " + magaByte + " MB and " + kiloBytes % 1024 + " KB");
    }
}