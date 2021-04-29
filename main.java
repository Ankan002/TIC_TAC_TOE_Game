import java.util.Scanner;
class Exit{
    void GameStructure(String[][] game){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(game[i][j]+" | ");
            }
            System.out.println();
        }
    }

}

public class TIC_TAC_TOE_game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Exit Brain= new Exit();
        System.out.println("   "+"TIC TAC TOE GAME"+"   ");
        System.out.println("Reference: ");
        System.out.println("O-> is Capital 'o' in English");
        System.out.println("X-> is Capital 'x' in English");
        System.out.println("Row Column Position Diagram-> Row is written first then Column: ");
        System.out.println("R1 C1"+"|"+"R1 C2"+"|"+"R1 C3");
        System.out.println("-----"+"|"+"-----"+"|"+"-----");
        System.out.println("R2 C1"+"|"+"R2 C2"+"|"+"R2 C3");
        System.out.println("-----"+"|"+"-----"+"|"+"-----");
        System.out.println("R3 C1"+"|"+"R3 C2"+"|"+"R3 C3");
        System.out.println("Enter the first name of the player 1: ");
        String Player1= sc.next();
        System.out.println("Enter your Sign (O or X): ");
        String move_of_player1= sc.next();
        System.out.println("Enter the first name of the player 2: ");
        String Player2= sc.next();
        System.out.println("Enter your Sign (O or X): ");
        String move_of_player2= sc.next();
        int flag1=0;
        int flag2=0;
        String[][] game= new String [4][4];
        game[1][1]="1 1";
        game[1][2]="1 2";
        game[1][3]="1 3";
        game[2][1]="2 1";
        game[2][2]="2 2";
        game[2][3]="2 3";
        game[3][1]="3 1";
        game[3][2]="3 2";
        game[3][3]="3 3";
        Brain.GameStructure(game);
        for(int i=1;i<=5;i++){
            //Player1 data and MOVES
            System.out.println("Move of "+Player1);
            System.out.println("Enter the row number of your move: ");
            int Row_Of_player1=sc.nextInt();
            System.out.println("Enter the column number of your move: ");
            int Column_Of_Player1=sc.nextInt();
            game[Row_Of_player1][Column_Of_Player1]=move_of_player1;
            flag1++;
            Brain.GameStructure(game);
            if(game[1][1].equals(game[1][2]) && game[1][2].equals(game[1][3])){
                System.out.println(Player1+" has won the game");
                break;
            }
            else if(game[2][1].equals(game[2][2]) && game[2][2].equals(game[2][3])){
                System.out.println(Player1+" has won the game");
                break;
            }
            else if(game[3][1].equals(game[3][2]) && game[3][2].equals(game[3][3])){
                System.out.println(Player1+" has won the game");
                break;
            }
            else if(game[1][1].equals(game[2][1]) && game[2][1].equals(game[3][1])){
                System.out.println(Player1+" has won the game");
                break;
            }
            else if(game[1][2].equals(game[2][2]) && game[2][2].equals(game[3][2])){
                System.out.println(Player1+" has won the game");
                break;
            }
            else if(game[1][3].equals(game[2][3]) && game[2][3].equals(game[3][3])){
                System.out.println(Player1+" has won the game");
                break;
            }
            else if(game[1][1].equals(game[2][2]) && game[2][2].equals(game[3][3])){
                System.out.println(Player1+" has won the game");
                break;
            }
            else if(game[1][3].equals(game[2][2]) && game[2][2].equals(game[3][1])){
                System.out.println(Player1+" has won the game");
                break;
            }
            if(flag1==5){
                System.out.println("The match has been drawn..........." );
            }

            //Player 2 data And Moves
            System.out.println("Move of "+Player2);
            System.out.println("Enter the row number of your move: ");
            int Row_Of_player2=sc.nextInt();
            System.out.println("Enter the column number of your move: ");
            int Column_Of_Player2=sc.nextInt();
            game[Row_Of_player2][Column_Of_Player2]=move_of_player2;
            flag2++;
            Brain.GameStructure(game);
            if(game[1][1].equals(game[1][2]) && game[1][2].equals(game[1][3])){
                System.out.println(Player2+" has won the game");
                break;
            }
            else if(game[2][1].equals(game[2][2]) && game[2][2].equals(game[2][3])){
                System.out.println(Player2+" has won the game");
                break;
            }
            else if(game[3][1].equals(game[3][2]) && game[3][2].equals(game[3][3])){
                System.out.println(Player2+" has won the game");
                break;
            }
            else if(game[1][1].equals(game[2][1]) && game[2][1].equals(game[3][1])){
                System.out.println(Player2+" has won the game");
                break;
            }
            else if(game[1][2].equals(game[2][2]) && game[2][2].equals(game[3][2])){
                System.out.println(Player2+" has won the game");
                break;
            }
            else if(game[1][3].equals(game[2][3]) && game[2][3].equals(game[3][3])){
                System.out.println(Player2+" has won the game");
                break;
            }
            else if(game[1][1].equals(game[2][2]) && game[2][2].equals(game[3][3])){
                System.out.println(Player2+" has won the game");
                break;
            }
            else if(game[1][3].equals(game[2][2]) && game[2][2].equals(game[3][1])){
                System.out.println(Player2+" has won the game");
                break;
            }
            if(flag2==5){
                System.out.println("The match has been drawn..........." );
            }
        }
    }
}
