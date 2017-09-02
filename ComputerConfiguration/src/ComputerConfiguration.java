/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 1 Chapter 1
* Computer Configuration
* Due Date: 09/03/17*/
import java.util.Scanner;
public class ComputerConfiguration {
    public static void main(String[] args) {

        System.out.println("ATTENTION! YOU cannot make it halfway through the semester"+"\nIF you don't meet the minimal requirements for your PC below:\n");
        System.out.println("\t\t\t The Lenovo X315 Desktop\n");

        /*The parts and prices listed below come from Amazon.com as of September 1st 2017.*/
        String Cpu = "AMD FX 770K 3.5 GHz";
        double CpuPrice = 116.47;
        String Ram = "Crucial Ballistix 8GB DDR3";
        double RamPrice = 59.99;
        String Hdd = "WD 1TB SATA 7200 RPM";
        double HddPrice = 49.99;
        String AudioCard = "Default M/B Audio Card";
        String Gpu = "Gigabyte AMD R7 370";
        double GpuPrice = 262.00;
        String Spkrs = "Z200 with Stereo Sound";
        double SpkrsPrice = 26.49;
        double total = CpuPrice + RamPrice + HddPrice + GpuPrice + SpkrsPrice;

        /*The following lines of code help in making the computer configuration more organized and presentable.
        * System.out.printf() aids in establishing the position of each part, type of part, and price.*/
        System.out.printf("%-30s %-20s %-10s\n", "Computer Part", "Type of Part", "Price");
        System.out.printf("%-30s %-20s $%-10.2f\n", Cpu, "CPU", CpuPrice);
        System.out.printf("%-30s %-20s $%-10.2f\n", Ram, "RAM", RamPrice);
        System.out.printf("%-30s %-20s $%-10.2f\n", Hdd, "Hard Drive", HddPrice);
        System.out.printf("%-30s %-20s %-10s\n", AudioCard, "Audio Card", "FREE!");
        System.out.printf("%-30s %-20s $%-10.2f\n", Gpu, "Video Card", GpuPrice);
        System.out.printf("%-30s %-20s $%-10.2f\n\n", Spkrs, "Speakers", SpkrsPrice);
        System.out.printf("As such, the minimal cost for a college computer is: $%.2f\n", total);
        System.out.println("\nFortunately, in 2017, you are able to upgrade to make a MASTERPIECE of your own.\n" +
                "\tYou are in luck! As I happen to have the right pieces put together."+
                "\n\t   I'll just need you to input the current prices for each part!\n");

        /*The following lines of code deal with the upgraded parts. The prices are taken from Amazon.com on September 1st 2017.*/
        String CpuUP = "Intel i7-7700K"; /*$339.99*/
        String RamUP = "Corsair Vengeance LPX 32GB"; /*$291.99*/
        String HddUP = "Samsung 850 PRO 1TB"; /*$421.39*/
        String AudioCardUP = "Sound Blaster Z PCIe Gaming Sound Card"; /*$99.97*/
        String GpuUP = "NVIDIA GeForce Titan X Pascal 12GB"; /*$1649.99*/
        String SpkrsUP = "Onkyo SKS-HT993THX 7.1 Ch."; /*$649.90*/
        Scanner input = new Scanner(System.in);
        System.out.printf("Price for %s: $", CpuUP);
        double CpuPriceUP = input.nextDouble();
        System.out.printf("Price for %s: $", RamUP);
        double RamPriceUP = input.nextDouble();
        System.out.printf("Price for %s: $", HddUP);
        double HddPriceUP = input.nextDouble();
        System.out.printf("Price for %s: $", AudioCardUP);
        double AudioCardPriceUP = input.nextDouble();
        System.out.printf("Price for %s: $", GpuUP);
        double GpuPriceUP = input.nextDouble();
        System.out.printf("Price for %s: $", SpkrsUP);
        double SpkrsPriceUP = input.nextDouble();
        double totalUP = CpuPriceUP + RamPriceUP + HddPriceUP + AudioCardPriceUP + GpuPriceUP + SpkrsPriceUP;
        input.close();

        /*The following lines of code show the upgraded parts, type of parts, prices, and calculate the grand price for upgraded PC.*/
        System.out.printf("\n%-40s %-25s %-15s\n", "Upgraded PC Parts", "Type of Part", "New Price");
        System.out.printf("%-40s %-25s $%-15.2f\n", CpuUP, "CPU", CpuPriceUP);
        System.out.printf("%-40s %-25s $%-15.2f\n", RamUP, "RAM", RamPriceUP);
        System.out.printf("%-40s %-25s $%-15.2f\n", HddUP, "Hard Drive", HddPriceUP);
        System.out.printf("%-40s %-25s $%-15.2f\n", AudioCardUP, "Audio Card", AudioCardPriceUP);
        System.out.printf("%-40s %-25s $%-15.2f\n", GpuUP, "Video Card", GpuPriceUP);
        System.out.printf("%-40s %-25s $%-15.2f\n", SpkrsUP, "Speakers", SpkrsPriceUP);
        System.out.printf("\nThis new MASTERPIECE comes at a GRAND price of $%.2f, which is cheap in comparison to all your wildest dreams coming to reality. God bless.", totalUP);
    }

}