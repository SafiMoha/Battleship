import java.util.Locale;
import java.util.Scanner;

class battleShip {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeBattleShip();
        boolean Quit = false;

        do {
            showDetails();
            System.out.println();
            String letter = scanner.nextLine();
            switch (letter.toUpperCase(Locale.ROOT)) {
                case "N":
                    Quit=true;
                    start();
                    break;
                case "R":
                    showInstruction();
                    System.out.println();
                    break;
                case "G":
                    showGameSetup();
                    System.out.println();
                    break;
                case "L":
                    showLeaderBoard();
                    System.out.println();
                    break;
                case "H":
                    askHelp();
                    System.out.println();
                    break;
                case "Q":
                    //showGameOver();
                    Quit =true;
                    break;
                default:
                    System.out.println("Invalid letter");
            }

        }while (!Quit) ;

    }
    public static void start(){
        askPressAnyKey();
        askPlayerName();
        showStartGameBattleShip();
        displayShip();
        showEndGameBattleShip();
    }
    private static String playerName;
    public static String getPlayerName(){
        return playerName;
    }


    private static void welcomeBattleShip() {
        System.out.println("Thank you for playing our game");
        String name = "\n" +
                " _                    _          _    _     _       \n" +
                "| |          _   _   | |        | |  | |   (_)      \n" +
                "| | _   ____| |_| |_ | | ____    \\ \\ | | _  _ ____  \n" +
                "| || \\ / _  |  _)  _)| |/ _  )    \\ \\| || \\| |  _ \\ \n" +
                "| |_) | ( | | |_| |__| ( (/ / _____) ) | | | | | | |\n" +
                "|____/ \\_||_|\\___)___)_|\\____|______/|_| |_|_| ||_/ \n" +
                "                                             |_|    \n";
        System.out.println(name);


    }
    private static char showDetails(){
        System.out.println("----> DETAILS <-----\n" +
                "Press N to start a new game\n" +
                "Press Q to quit the game\n" +
                "Press R to read the Instruction\n" +
                "Press G to read the game setup \n" +
                "Press L to show LeaderBoard \n" +
                "Press H to get help");
        System.out.println();
        return 0;
    }
    private static  void askPressAnyKey(){
        System.out.println(">Press enter to continue<");
    }

    private static char showInstruction(){
        System.out.println("1) The player gives the coordinates of the square they want to attack.\n" +
                "2) HIT or OCEAN will be displayed depending on the success of the attack.\n" +
                "3) Next, the computer will take its turn.\n" +
                "4) The first one to sink all the enemy’s ships wins the game!\n" +
                "5) Every player starts the game with a score of 100 points.\n" +
                "6) After every unsuccessful attack 1 point will be retrieved.\n" +
                "7) The player's score will only be taken into account for the ");
        return 0;
    }
    private static char showGameSetup(){
        System.out.println("1) Battleship is played on two squared grids of size ten by ten.\n" +
                "2) Five ships of different sizes are randomly spread on each of the grids.\n" +
                "The ships cannot overlap each other.\n" +
                "3) The first grid displays the attempts of the computer to sink the player’s ships,\n" +
                "as well as the position of the ships of the player.\n" +
                "4) The second grid displays the attempts of the player to sink the computer’s ships.\n" +
                "The ships of the computer are hidden for the player.");
        return 0;
    }
    private static char askHelp(){
        System.out.println("Press N to start a new game\n" +
                "Press Q at any time to quit the game\n" +
                "Press S to save the game\n" +
                "Press R to read the Instruction\n" +
                "Press G to read the game setup \n" +
                "Press C to continue the previous game");
        return 0;
    }
    private static char showLeaderBoard(){
        System.out.println(
                "These are the top scores of BATTLESHIPS:\n" +
                        "Name: Score: Date: Time:\n" +
                        "1 Silviu 100 21/11/2021 21:33\n" +
                        "2 Apolline 96 24/10/2020 20:54\n" +
                        "3 Margarita 93 21/11/2021 04:17\n" +
                        "4 Margarita 92 03/03/2019 03:54\n" +
                        "5 Mohammed 89 04/05/2019 18:23\n" +
                        "6 Silviu 89 10/09/2020 22:23\n" +
                        "7 Silviu 76 15/08/2021 10:49\n" +
                        "8 Apolline 69 25/12/2020 11:00\n" +
                        "9 Mohammed 65 10/05/2020 12:01\n" +
                        "10 Apolline 54 06/06/2018 09:34");
        return 0;
    }


    private static void askPlayerName() {
        System.out.println("Enter your name: ");
        playerName = scanner.nextLine();

    }

    public static String showStartGameBattleShip() {
        String start ="                                                                                              \n" +
                "                                                                                              \n" +
                "                                                    ,--,                                 ,-.  \n" +
                "                                     ,---,        ,--.'|                             ,--/ /|  \n" +
                "              ,---.     ,---.      ,---.'|        |  | :            ,--,           ,--. :/ |  \n" +
                "  ,----._,.  '   ,'\\   '   ,'\\     |   | :        :  : '          ,'_ /|           :  : ' /   \n" +
                " /   /  ' / /   /   | /   /   |    |   | |        |  ' |     .--. |  | :    ,---.  |  '  /    \n" +
                "|   :     |.   ; ,. :.   ; ,. :  ,--.__| |        '  | |   ,'_ /| :  . |   /     \\ '  |  :    \n" +
                "|   | .\\  .'   | |: :'   | |: : /   ,'   |        |  | :   |  ' | |  . .  /    / ' |  |   \\   \n" +
                ".   ; ';  |'   | .; :'   | .; :.   '  /  |        '  : |__ |  | ' |  | | .    ' /  '  : |. \\  \n" +
                "'   .   . ||   :    ||   :    |'   ; |:  |        |  | '.'|:  | : ;  ; | '   ; :__ |  | ' \\ \\ \n" +
                " `---`-'| | \\   \\  /  \\   \\  / |   | '/  '        ;  :    ;'  :  `--'   \\'   | '.'|'  : |--'  \n" +
                " .'__/\\_: |  `----'    `----'  |   :    :|        |  ,   / :  ,      .-./|   :    :;  |,'     \n" +
                " |   :    :                     \\   \\  /           ---`-'   `--`----'     \\   \\  / '--'       \n" +
                "  \\   \\  /                       `----'                                    `----'             \n" +
                "   `--`-'                                                                                     ";
        System.out.println(start);
        System.out.print("lets get stard "+ getPlayerName());
        System.out.println("!");
        System.out.println();
        askPressAnyKey();
        System.out.println("Press ‘S’ to start the game\n ");
        String S1 = scanner.nextLine();
        String input =scanner.nextLine();
        return input;



    }

    private static void displayShip() {
        String player =
                "A B C D E F G H I J\n" +
                        "1 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                        "2 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                        "3 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                        "4 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                        "5 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                        "6 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                        "7 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                        "8 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                        "9 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                        "10 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ";
        System.out.println(player);

        System.out.print("Enter row (Letter)---->");
        String Row = scanner.nextLine();
        System.out.print("Enter column (Number)-->");
        int Column = scanner.nextInt();
        System.out.println("\n" +
                "Hint 1: \n" +
                "Row G -> 0 ships\n" +
                "Column 6 -> 0 ships");
        System.out.println();
        String ship ="A B C D E F G H I J\n" +
                "1 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                "2 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                "3 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                "4 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                "5 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                "6 ~ ~ ~ ~ ~ @ ~ ~ ~ ~\n" +
                "7 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                "8 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                "9 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n" +
                "10 ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ";
        System.out.println(ship);




    }


    private static void showEndGameBattleShip() {

        String end =  "__ _ __ _\n"+
                "/ _` |/ _` |\n"+
                "| (_| | (_| |\n"+
                " \\__ |\\___ |\n"+
                "|____/ |____/";
        System.out.println(end);
        System.out.println();
        System.out.println("Congratulations, "+getPlayerName()+" !"+" you are the winner of this game!\n" +
                "Your score is: 67 "+"!");
        System.out.println();
    }
    private static void showGameOver(){
        System.out.println("All your boats sank!\n" +
                "Unfortunately you lost this game. Try again next time.");
    }

}

