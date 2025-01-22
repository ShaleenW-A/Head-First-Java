package chap02;

public class GuessGame {

   Player p1;
   Player p2;
   Player p3;
   
   public void startGame() {
       p1 = new Player();
       p2 = new Player();
       p3 = new Player();
       int targetNumber = (int) (Math.random() * 10);
       System.out.println("I'm thinking of a number between 0 and 9...");

       while(true) {
           System.out.println("Number to guess is " + targetNumber);
           
           boolean p1isRight = generateAndCheckGuess(p1, targetNumber);
           boolean p2isRight = generateAndCheckGuess(p2, targetNumber);
           boolean p3isRight = generateAndCheckGuess(p3, targetNumber);
           
           if (p1isRight || p2isRight || p3isRight)
           {
               System.out.println("We have a winner!");
               System.out.println("Player one got it right? " + p1isRight);
               System.out.println("Player two got it right? " + p2isRight);
               System.out.println("Player three got it right? " + p3isRight);
               System.out.println("Game is over");
               break;
           }
           else
           {
               System.out.println("Players will have to try again.");
           }
       }
   }

    // Gives player's guess and verifies whether it matches the target number
    private boolean generateAndCheckGuess(Player player, int targetNumber) {
        player.guess();
        int guess = player.number;
        System.out.println("Player guessed " + guess);
        return guess == targetNumber;
    }
}
