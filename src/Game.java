import javax.swing.*;

public class Game {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the guessing game!");
        int computerNum = (int) (Math.random()*100 + 1);
        int userNum = 0;
        int count = 0;

        do {
            String answer = JOptionPane.showInputDialog(null, "Please guess a number from 1 to 100!", "Guessing Game", 3);
            userNum = Integer.parseInt(answer);

            JOptionPane.showMessageDialog(null, "" + determineGuess(userNum, computerNum, count));
            count++;
        } while(userNum != computerNum);
    }

    public static String determineGuess(int userNum, int computerNum, int count) {
        if (userNum < computerNum) {
            return "Your number " + userNum + " is less than the computer's number! Try again!";
        } else if (userNum > computerNum) {
            return "Your number " + userNum + " is greater than the computer's number! Try again!";
        } else if (userNum == computerNum) {
            return "Congrats! Your guess is correct!\nCount: " + count;
        } else if (userNum < 1 || userNum > 100) {
            return "Sorry, invalid Number! Try again!";
        } else {
            return "Incorrect number! Try again!";
        }
    }
}