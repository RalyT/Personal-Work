package Lab09;

//*************************************************************** 
// Sales.java 
// 
// Reads in and stores sales for each of 5 salespeople.  Displays 
// sales entered by salesperson id and total sales for all salespeople. 
// 
// *************************************************************** 
import java.util.Scanner; 

public class Sales { 
    
    public static void main(String[] args) { 
        int salesPeople = 0;
        int sum; 
        int highestSale = 0;
        int lowestSale = 0;
        int bestSalesPerson = 0;
        int worstSalesPerson = 0;
        int benchmark;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("How many salespeople are there: ");
        salesPeople =scan.nextInt();
        int[] sales = new int[salesPeople];
        
        for (int i = 0; i < sales.length; i++)     { 
            System.out.print("Enter sales for salesperson " + (i + 1) + ": "); 
            sales[i] = scan.nextInt();     
            lowestSale = sales[i];
            } 
        System.out.println("\n  Salesperson  Sales"); 
        System.out.println(" ------------------ "); 
        sum = 0; 
        for (int i = 0; i < sales.length; i++)     { 
            System.out.println("     " + (i + 1) 
                                + "         " + sales[i]); 
            sum += sales[i];    
            if (lowestSale > sales[i]) {
                lowestSale = sales[i];
                 worstSalesPerson = i;
            }
            
            if (highestSale < sales[i]) {
                highestSale = sales[i];
                bestSalesPerson = i;
            }
        } 
        int worstSale = lowestSale; 
        System.out.println("\nTotal sales: " + sum
                            + "\nAverage Sales: " + sum / salesPeople); 
        System.out.println("Salesperson " + (bestSalesPerson + 1)
                            + " had the highest sale of " + highestSale);
        System.out.println("Salesperson " + (worstSalesPerson + 1)
                            + " had the lowest sale of " + worstSale);
        System.out.println("Enter a benchmark amount: ");
        benchmark = scan.nextInt();
        int madeIt = 0;
        
        System.out.println("Salespeople that sold more than the benchmark amount:");
        System.out.println("Salesperson  Sales"); 
        System.out.println(" ------------------ "); 
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > benchmark) {
                System.out.println("     " + (i + 1) 
                        + "         " + sales[i]); 
                madeIt++;
            }
        }
        System.out.println("The number of Salespeople that meet the "
                            + "benchmark are " + madeIt);
    } 
}