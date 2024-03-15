package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] gameBoard;
    public  Board(Character[][] matrix) {
        this.gameBoard = matrix;
    }

    public Boolean isInFavorOfX() {
        if(getWinner()=="X" ){
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if(getWinner()== "O") {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if(getWinner()==""){
            return true;
        }
        else
            return false;
    }

    public String getWinner() {
        if (checkWinner('X')) {
            return "X";

        } else if (checkWinner('O')) {
            return "O";
        }
        else {
            return "";
        }

    }


    public Boolean checkWinner(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i][0] == symbol && gameBoard[i][1] == symbol && gameBoard[i][2] == symbol) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (gameBoard[0][j] == symbol && gameBoard[1][j] == symbol && gameBoard[2][j] == symbol) {
                return true;
            }
        }

        if ((gameBoard[0][0] == symbol && gameBoard[1][1] == symbol && gameBoard[2][2] == symbol)) {
            return true;
        }
        else if ((gameBoard[0][2] == symbol && gameBoard[1][1] == symbol && gameBoard[2][0] == symbol)) {
            return true;
        }
        else
            return false;

    }


    }
