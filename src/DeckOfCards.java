import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;

public class DeckOfCards {

    public static void main(String[] args) {
        Set<String> unique = new HashSet<String>();
        String[] suits = {"Club","Heart","Spade","Diamond"};
        String[] rank = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] [] cards = new String[4][13];

        for(int i = 0;i < 4;i++){
            for(int j = 0;j<13;j++){
                cards[i][j] = suits[i]+rank[j];
            }
        }
        Random random = new Random();
        int numCards = 0;
        int k= 0;
        int l = 0;
        int m = 0;
        int n = 0;
        String[][] playerCards = new String[4][9];
        while(numCards<36){
            int suit = random.nextInt(4);
            int rankNum = random.nextInt(13);
            if(unique.add(cards[suit][rankNum])){
                if(numCards%4 == 0){
                    int play1=0;
                    playerCards[play1][k] = cards[suit][rankNum];
                    k++;
                    numCards++;

                }
                else if(numCards%4 == 1){
                    int play1=1;
                    playerCards[play1][l] = cards[suit][rankNum];
                    l++;
                    numCards++;

                }
                else if(numCards%4 == 2){
                    int play1=2;
                    playerCards[play1][m] = cards[suit][rankNum];
                    m++;
                    numCards++;

                }
                else if(numCards%4 == 3){
                    int play1=3;
                    playerCards[play1][n] = cards[suit][rankNum];
                    n++;
                    numCards++;

                }

            }

        }
        for(int i = 0;i<4;i++){
            System.out.println("Player" +(i+1));
            for(int j =0 ;j < 9 ;j++ ){
                System.out.print(playerCards[i][j]+" ");
            }
            System.out.println();
        }
    }
}
