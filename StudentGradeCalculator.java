/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timothykimball3;

import java.util.Scanner;

/**
 *
 * @author Eon
 */
public class StudentGradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double total_grade = 0;
         
        System.out.println("How many students in class? ");
        int numberStudents = input.nextInt();
        int counter = 0;
        
        while (counter < numberStudents) {
                System.out.println("enter the grade of a student");
                total_grade += input.nextDouble();
                counter += 1;
        }
        
        System.out.println("The class average grade is " + total_grade/5);
    
    }
}
