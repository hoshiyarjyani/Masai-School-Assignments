package com.ui;

import java.util.Scanner;

import com.dao.PlayerDAO;
import com.dao.PlayerDAOimpl;
import com.model.Player;

public class UiMain {

    public static void main(String[] args) {
        PlayerDAO dao = new PlayerDAOimpl();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Please select an option:");
            System.out.println("1. Add player to database");
            System.out.println("2. Find player by player ID");
            System.out.println("3. Update player sport name by player ID");
            System.out.println("4. Delete player from database by player ID");
            System.out.println("5. Retrieve all names of players from database in upper case");
            System.out.println("6. Retrieve minimum age of all players");
            System.out.println("7. Retrieve all players between the ages of 18 and 25");
            System.out.println("8. Retrieve all player names starting with a specific letter");
            System.out.println("9. Exit");
            choice = sc.nextInt();
            sc.nextLine(); // to consume the leftover newline character
            switch (choice) {
                case 1:
                    System.out.println("Enter player name:");
                    String name = sc.nextLine();
                    System.out.println("Enter player age:");
                    int age = sc.nextInt();
                    sc.nextLine(); // to consume the leftover newline character
                    System.out.println("Enter player sport name:");
                    String sportName = sc.nextLine();
                    Player player = new Player(name, age, sportName);
                    System.out.println(dao.AddPlayer(player));
                    break;
                case 2:
                    System.out.println("Enter player ID:");
                    int id = sc.nextInt();
                    Player foundPlayer = dao.FindPlayer(id);
                    if (foundPlayer != null) {
                        System.out.println("Player found: " + foundPlayer.toString());
                    } else {
                        System.out.println("Player not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter player ID:");
                    int idToUpdate = sc.nextInt();
                    sc.nextLine(); // to consume the leftover newline character
                    System.out.println("Enter new sport name:");
                    String newSportName = sc.nextLine();
                    System.out.println(dao.UpdatePlayer(idToUpdate, newSportName));
                    break;
                case 4:
                    System.out.println("Enter player ID to delete:");
                    int idToDelete = sc.nextInt();
                    System.out.println(dao.DeletePlayer(idToDelete));
                    break;
                case 5:
                    System.out.println("Names of all players in upper case:");
                    System.out.println(dao.GetNamesFromDataBase());
                    break;
                case 6:
                    System.out.println("Minimum age of all players: " + dao.GetMinimumAge());
                    break;
                case 7:
                    System.out.println("All players between the ages of 18 and 25:");
                    System.out.println(dao.getPlayersBetweenAges());
                    break;
                case 8:
                    System.out.println("Enter starting letter of player names:");
                    char letter = sc.nextLine().charAt(0);
                    System.out.println("Player names starting with letter " + letter + ":");
                    System.out.println(dao.getPlayerNamesStartingWithLetter(letter));
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);
    }

}
