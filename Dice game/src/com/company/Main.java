package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//Enter players name for a more interactive game
        System.out.println("what is player 1's name?");
        String name1 = input.nextLine();
        System.out.println("what is player 2's name?");
        String name2 = input.nextLine();
        
System.out.println("The player who get to 40 points first, followed by hitting to of the same die, wins.");
        
        // assigning of values, so the while function works properly
        int t = 0;
        int s = 0;
        int i = 1;
        int AWC1 = 0;
        int AWC2 = 0;
        int dice_c1 = 0;
        int dice_c2 = 0;
        int total1 = 0;
        int total2 = 0;

        while (i <= 3) {



            //player 1´s function
            while (i == 1) {
                System.out.println("It's " + name1 + "'s turn");
                System.out.println("Enter anything to roll dice");
                input.nextLine();
                int max = 6;
                int min = 1;
                int range = max - min + 1;
                int dice1 = (int) (Math.random() * range) + min;
                int dice2 = (int) (Math.random() * range) + min;
                System.out.println("The first dice landed on " + dice1);
                System.out.println("The second dice landed on " + dice2);
                System.out.println("the dices combined is " + (dice1 + dice2));


                //adds to the complete score
                dice_c1 = dice1 + dice2;
                total1 = dice_c1 + total1;

                //if both dices hit 1, you lose all points
                if (dice_c1 == 2) {
                    total1 = 0;
                    System.out.println("You lost your points this round cause both dices landed on 1");
                }
                //adds the combined dices to your score and passes the turn on
                if (dice1 != dice2) {
                    i = i + 1;
                    t = t + 1;
                }

                System.out.println(name1 + " 's total amount of points is " + (total1));
                System.out.println(".....................");

                //alternative win condition
                if (dice_c1 == 12) {
                    System.out.println(name1 + " you hit two sixes, if you hit two sixes again you can win");
                    if (AWC1 == 1) {
                        System.out.println(name1 + " hit two sixes twice in a row!");
                        System.out.println(name1 + " wins on the alternative wincondition!");
                        i = i + 3;
                        break;


                    }
                    AWC1 = 1;

                }


                //roll again functions
                if (dice1 == dice2) {
                    if (total1 <= 40) {
                        System.out.println(name1 + "'s  dices hit the same number, " + name1 + " gets to roll again");
                        t = t + 1;
                    }
                }


                //winning/ending function
                if (total1 >= 40) {
                    System.out.println(name1 + " has over 40 points!");
                    if (dice1 != dice2) {
                        System.out.println(name1 + " just need to hit two of the same");
                    }
                    if (dice1 == dice2) {
                        System.out.println(name1 + " has over 40 points and hit two identical");
                        System.out.println(name1 + " has won!");
                        i = i + 3;
                        break;
                    }
                }
            }

            //player 2´s function
            while (i == 2) {
                System.out.println("It's " + name2 + "'s turn");
                System.out.println("Enter anything to roll dice");
                input.nextLine();
                int max = 6;
                int min = 1;
                int range = max - min + 1;
                int dice3 = (int) (Math.random() * range) + min;
                int dice4 = (int) (Math.random() * range) + min;
                System.out.println("The first dice landed on " + dice3);
                System.out.println("The second dice landed on " + dice4);
                System.out.println("the dices combined is " + (dice3 + dice4));


                dice_c2 = dice3 + dice4;
                total2 = dice_c2 + total2;

                //if both dices hit 1, you lose all points
                if (dice_c2 == 2) {
                    total2 = 0;

                    System.out.println("You lost your points this round cause both dices landed on 1");
                }

                //these lines adds the combination of numbers to the complete score
                if (dice3 != dice4) {
                    i = i - 1;
                    s = s + 1;
                }

                System.out.println(name2 + "'s total amount of points is " + (total2));
                System.out.println("..............");

                //alternative win condition
                if (dice_c2 == 12) {
                    System.out.println(name2 + " you hit two sixes, if you hit two sixes again you can win");
                    if (AWC2 == 1) {
                        System.out.println(name2 + " hit two sixes twice in a row!");
                        System.out.println(name2 + " wins on the alternative wincondition!");
                        i = i + 3;
                        break;
                    }
                    AWC2 = 1;
                }

                //roll again functions
                if (dice3 == dice4) {
                    if (total2 <= 40)
                    System.out.println(name2 + "'s  dices hit the same number, " + name2 + " gets to roll again");
                    s = s + 1;

                }


                //winning/ending function
                if (total2 >= 40) {
                    System.out.println(name2 + " has over 40 points!");
                    if (dice_c2 != 12) {
                        System.out.println(name2 + " just needs the two dices to both land on 6");
                    }
                    if (dice3 == dice4) {
                        System.out.println(name2 + " has over 40 points and and hit two identical");
                        System.out.println(name2 + " has won!");
                        i = i + 3;
                        break;
                    }


                }
            }
        }


            System.out.println(name1 + "'s score was " + total1 + " in " + t + " tries");
            System.out.println(name2 + "'s score was " + total2 + " in " + s + " tries");


    }
}


