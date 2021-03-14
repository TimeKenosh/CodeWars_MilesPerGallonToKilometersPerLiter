import java.text.DecimalFormat;
import java.util.Scanner;

public class Communicator {
    Scanner scanner = new Scanner(System.in);
    public double getMpG(String text){
        System.out.print(text);
        return scanner.nextDouble();
    }

    public void resultOut(String text, Double res){
        DecimalFormat twoNumbers = new DecimalFormat("#.##");
        System.out.printf(text + twoNumbers.format(res));
    }
    public void close(){
        scanner.close();
    }
}
