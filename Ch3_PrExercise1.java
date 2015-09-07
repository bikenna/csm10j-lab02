/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_prexercise1;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
 *
 * @author brianobioha
 */
public class Ch3_PrExercise1 {
    static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            double length, width;
            float radius;
            String firstName, lastName;
            int age;
            float savings, rate;
            String letter_temp;
            char letter;
            Scanner inFile = new Scanner(new FileReader("inData.txt"));
            
            length = inFile.nextDouble();
            width = inFile.nextDouble();
            radius = inFile.nextFloat();
            firstName = inFile.next();
            lastName = inFile.next();
            age = inFile.nextInt();
            savings = inFile.nextFloat();
            rate = inFile.nextFloat();
            letter_temp = inFile.next();
            letter = letter_temp.charAt(0);
            
            PrintWriter outFile = new PrintWriter("outData.txt");
            DecimalFormat format = new DecimalFormat("0.00");
            outFile.write("Rectangle: \n");
            outFile.write("Length = " + format.format(length) +", Width");
            outFile.write(" = " + format.format(width) + ", Area = "+format.format(length*width)+", ");
            outFile.write("Perimeter = "+format.format(2*length + 2*width)+"\n\n");
            
            outFile.write("Circle:\n");
            outFile.write("Radius = "+format.format(radius) + ", Area = "+format.format(3.1416*radius*radius)+", ");
            outFile.write("Circumference = "+format.format(2*3.1416*radius)+"\n\n");
            
            outFile.write("Name: "+firstName+" "+lastName+", age: "+age+"\n");
            outFile.write("Beginning balance = $"+format.format(savings)+", Interest rate = "+format.format(rate)+"\n");
            outFile.write("Balance at the end of the month = $"+format.format(savings*(rate/1200) + savings)+"\n\n");
            
            outFile.write("The character that comes after "+letter+" in the ASCII set is"+" "+(char)(letter+1));
            
            
            
            
            inFile.close();
            outFile.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
    
}
