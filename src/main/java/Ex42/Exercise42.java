/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ryan Newton
 */
package Ex42;
import java.io.*;
import java.util.*;

public class Exercise42
{
    // Table formatter
    // scan and input file for table
    public void printDetails(String fname)
    {
        try {
            File inputfile = new File(fname);
            Scanner scnr = new Scanner(inputfile);

            while (scnr.hasNext())
            {
                String s = scnr.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }
            }
        catch (FileNotFoundException ex){
        System.out.println("Error:   FILE NOT FOUND!!!!"); }
    }
    // Main code to run
    public static void main(String[] args)
    {

        Exercise42 emp = new Exercise42();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");
        emp.printDetails("exercise42_input.txt");
    }
}