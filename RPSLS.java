import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {  
  
  @Test void player1Wins() {
    assertEquals("Player 1 Won!", Kata.rpsls("rock", "lizard"));
    assertEquals("Player 1 Won!", Kata.rpsls("paper", "rock"));
    assertEquals("Player 1 Won!", Kata.rpsls("scissors", "lizard"));
    assertEquals("Player 1 Won!", Kata.rpsls("lizard", "paper"));
    assertEquals("Player 1 Won!", Kata.rpsls("spock", "rock"));
  }

  @Test void player2Wins() {
    assertEquals("Player 2 Won!", Kata.rpsls("lizard","scissors"));
    assertEquals("Player 2 Won!", Kata.rpsls("spock","lizard"));
    assertEquals("Player 2 Won!", Kata.rpsls("paper","lizard"));
    assertEquals("Player 2 Won!", Kata.rpsls("scissors","spock"));
    assertEquals("Player 2 Won!", Kata.rpsls("rock","spock"));
  }

  @Test void draws() {
    assertEquals("Draw!", Kata.rpsls("rock", "rock"));
    assertEquals("Draw!", Kata.rpsls("spock", "spock"));
  }
}

public class Kata {
  
  public static String rpsls(String player1, String player2){
    
    if(player1 == "scissors"&& player2 == "paper"){
      return "Player 1 Won!";
    }if(player1 == "paper" && player2 == "rock"){
      return "Player 1 Won!";
    }if(player1 == "rock" && player2 == "lizard"){
      return "Player 1 Won!";
    }if(player1 == "lizard" && player2 == "spock"){
      return "Player 1 Won!";
    }if(player1 == "spock" && player2 == "scissors"){
      return "Player 1 Won!";
    }if(player1 == "scissors" && player2 == "lizard"){
      return "Player 1 Won!";
    }if(player1 == "lizard" && player2 == "paper"){
      return "Player 1 Won!";
    }if(player1 == "paper" && player2 == "spock"){
      return "Player 1 Won!";
    }if(player1 == "spock" && player2 == "rock"){
      return "Player 1 Won!";
    }if(player1 == "rock" && player2 == "scissors"){
      return "Player 1 Won!";
    }if(player1 == player2){
      return "Draw!";
    }
    
    return "Player 2 Won!";
  }
}
