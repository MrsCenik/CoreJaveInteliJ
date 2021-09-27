package ReplitQuestions;
			/*
			 Write a Scrable Game for two person
			 Rules
			OK== 1- At the beginning Ask to first Player enter a word for starting game
			OK 	 2- Then change the player ask to new player if given word is valid or not 
			OK		i) If new player accepts the given word add number of letters in the word as points to player who wrote the word And go to step 3
			OK     ii) If new player  does not accept the word as valid then print "Invalid word, player X(Current player) won the game" and finish the game
			
			OK   3- Ask to users if user want to continue game or not
			OK      i) If player want to continue,
			OK      ask to user a letter to add to word
			OK      and ask to user side to add (beginning or end)
			OK      then add letter to word and run step 2
			
			OK      ii) If player does not want to continue
			        then print "Game Finished" and print points  and winner
			 */

import java.util.Scanner;

public class ScrableGame {

	
	public static void main(String[] args) {   
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String playerInput=scanner.next();
		
		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		player2.setActive(true);
		
		Player activePlayer, opponentPlayer;
		while(true) {
			activePlayer = player1.isActive() ? player1 : player2;
			opponentPlayer = player1.isActive() ? player2 : player1;
			
			System.out.println("If the given word is valid, press Y or if it is not press ANY key");
			String valid=scanner.next();
			
			if(valid.toUpperCase().equals("Y")) {
				opponentPlayer.setPoint(playerInput.length()); //add the point to player1 because player2 admit the word. 
				
				System.out.println("If you want to continue press C if it is not press any key");
				String quit  = scanner.next();
				if(!quit.toUpperCase().equals("C")) {  //player want to quit the game and game finished.
					System.out.println(opponentPlayer+ " Point: "+opponentPlayer.getTotalPoint()+". " + activePlayer + " point: "+activePlayer.getTotalPoint());//Type winner of the game
					System.out.println("Game Finished.");
					break;	
				}else {
					System.out.println("Enter one letter");
					String letter=scanner.next();
					System.out.println("Press B to add beginning, press E to add end?");
					String backOrEnd=scanner.next();
					if(backOrEnd.toUpperCase().equals("B")) {
						playerInput = letter+playerInput;	
					}else {				
						playerInput = playerInput+letter;
					}
					player1.setActive(!player1.isActive());
					player2.setActive(!player2.isActive());
				}
			}	
			else {
				Player winner = getWinnerPlayer(player1, player2);
				
				System.out.println("Invalid word, " + winner + 	" won the game");
				System.out.println(winner+ " won the game: "+ winner.getTotalPoint()+ " point.");
				System.out.println("Game Finished.");
				break;	
			}	
		}
		scanner.close();
	}

	private static Player getWinnerPlayer(Player player1, Player player2) {
		if(player1.getTotalPoint() > player2.getTotalPoint())
			return player1;
		return player2;
	}
	
	public static class Player{
		int point;
		int totalPoint;
		boolean active;
		String name;
		
		public Player(String name) {
			this.name = name;
		}
		
		public boolean isActive() {
			return active;
		}

		public void setActive(boolean active) {
			this.active = active;
		}
		

		public int getTotalPoint() {
			return totalPoint;
		}

		public void setPoint(int point) {
			totalPoint += point;
		}
		
		@Override
		public String toString() {
			return name;
		}
	}
}
