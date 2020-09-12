public class Main {
    public static void main(String[] args) {
printKiloToMega(-32);
printBytesToKilo(-234);
printGigaToTera(-24);
printMegaToGiga(-234);

    }
// Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
// The method should not return anything (void)
// and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
// Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
// XX represents the original value kiloBytes.
// YY represents the calculated megabytes.
// ZZ represents the calculated remaining kilobytes.
// For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
// If the parameter kiloBytes is less than 0 then print the text "Negative value, unable to calculate".

    public static void printBytesToKilo(int bytes){
        int kiloBytes = bytes / 1000;
        int remainingBytes = bytes % 1000;
        if (bytes < 0){
            System.out.println("Negative value, unable to calculate");
        } else {
            System.out.println(bytes + " B = " + kiloBytes + " KB and " + remainingBytes + " B");
        }
    }

    public static void printKiloToMega(int kiloBytes){
        int megaBytes = kiloBytes / 1000;
        int remainingBytes = kiloBytes % 1000;
        if (kiloBytes < 0){
            System.out.println("Negative value, unable to calculate");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingBytes + " KB");
        }
    }

    public static void printMegaToGiga(int megaBytes){
        int gigaBytes = megaBytes / 1000;
        int remainingBytes = megaBytes % 1000;
        if (megaBytes < 0){
            System.out.println("Negative value, unable to calculate");
        } else {
            System.out.println(megaBytes + " MB = " + gigaBytes + " GB and " + remainingBytes + " MB");
        }
    }

    public static void printGigaToTera(int gigaBytes){
        int teraBytes = gigaBytes / 1000;
        int remainingBytes = gigaBytes % 1000;
        if (gigaBytes < 0){
            System.out.println("Negative value, unable to calculate");
        } else {
            System.out.println(gigaBytes + " GB = " + teraBytes + " TB and " + remainingBytes + " GB");
        }
    }
}
