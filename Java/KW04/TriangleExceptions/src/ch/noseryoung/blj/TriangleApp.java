package ch.noseryoung.blj;

import java.time.LocalDate;
import java.util.Scanner;

import ch.noseryoung.exceptions.*;


public class TriangleApp {

    private String company;
    private String handler;
    private boolean isRunning;

    private String sideAInput;
    private String sideBInput;
    private String sideCInput;

    private double sideA;
    private double sideB;
    private double sideC;

    private String code;

    /**
     * The constructor.
     *
     * @param company of type String to print in the application header
     * @param handler of type String to print in the application header
     */
    public TriangleApp(String company, String handler) {
        this.company = company;
        this.handler = handler;
        isRunning = true;
    }

    /**
     * This method starts the actual application. It will remain in a loop as long
     * as the field "isRunning" is true.
     */
    public void start() {
        printHeader();
        while (isRunning) {
            Scanner sides = new Scanner(System.in);
            System.out.println("\nTEST CASES TRIANGLE\n");

            System.out.println("Seite A: ");
            String sideA = sides.nextLine();

            System.out.println("Seite B: ");
            String sideB = sides.nextLine();

            System.out.println("Seite C");
            String sideC = sides.nextLine();

            try {
                // validate Input (might throw exception)
                // get triangle code and write it to field code
            } catch (TriangleException e) {
                // get error code from exception and write it to field code
            } finally {
                // print result
                // ask user for next step
            }
        }
    }

    /**
     * This method prints the application header.
     */
    private void printHeader() {
        System.out.println("***************************************");
        System.out.println("          TRIANGLE EVALUATOR           ");
        System.out.println("***************************************");
        System.out.println("COMPANY: Noser Young, 2023");
        System.out.println("HANDLER: Ilija Predolac");
        System.out.println("***************************************");
    }

    /**
     * This method prints the evaluated code in an aesthetically pleasing way.
     */
    private void printResult() {
        System.out.println("----------------------");
        System.out.println("CODE:                 ");
        System.out.println("----------------------");
    }

    /**
     * This method prompts the user to give an input for a trinalge side.
     *
     * @param side of type String to display as title for the prompt.
     * @return the input of type String.
     */
    private String promptSide(String side) {

    }

    /**
     * This method prompts the user to give an input.<br>
     * "q": Quits the program.<br>
     * "c": Continues the program.<br>
     * else: Keeps asking for an input until "q" or "c" is entered.
     */
    private void promptAction() {
        String action = "";
        // get valid prompt
        // check if program needs to be cancelled

        System.out.println("******************************");
    }

    /**
     * This method validates the three entered values, to be used as sides for a
     * triangle.
     *
     * @throws TriangleException if the validation fails. This means that the
     *                           entered values do not lead to a triangle.
     */
    private void validateInput() throws TriangleException {
        try {
            sideA = Double.parseDouble(sideAInput);
            sideB = Double.parseDouble(sideBInput);
            sideC = Double.parseDouble(sideCInput);
        } catch (NumberFormatException e) {
            throw new IllegalTriangleSideException();
        }
        {
            if (sideA == 0 || sideB == 0 || sideC == 0) {
                throw new ZeroTriangleSideException();
            } else if (sideA < 0 || sideB < 0 || sideC < 0) {
                throw new NegativeTriangleSideException();
            } else if (sideA + sideB == sideC) {
                throw new TriangleIsLineException();
            } else if (sideA + sideB < sideC) {
                throw new ImpossibleTriangleException();
            }
        }

        /**
         * This method determines whether the three entered values lead to a
         * equilateral, isosceles, right-angled or scalene triangle.
         *
         * @return The corresponding code for each triangle.
         */
        private String determineTriangleType; () {
            if (sideA + sideB > sideA) {
                code = ("TRI84TF");
            } else if (sideA * sideA + sideB * sideB == sideC * sideC) {
                code = ("TRI72TF");
            } else if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
                code = ("TRI60TF");
            } else if (sideA == sideB && sideB == sideC) {
                code = ("TRI66TF");
            }
        }
    }
}