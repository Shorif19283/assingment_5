import java.util.Scanner;
public class Card_display {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the card notation: ");
            String cardNotation = scanner.nextLine().toUpperCase();

            Card card = new Card(cardNotation);
            String description = card.getDescription();

            System.out.println(description);
        }
    }

    class Card {
        private String notation;

        public Card(String notation) {
            this.notation = notation;
        }

        public String getDescription() {
            String rank = "";
            String suit = "";

            if (notation.length() == 2) {
                char rankChar = notation.charAt(0);
                char suitChar = notation.charAt(1);

                switch (rankChar) {
                    case 'A':
                        rank = "Ace";
                        break;
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '10':
                        rank = String.valueOf(rankChar);
                        break;
                    case 'J':
                        rank = "Jack";
                        break;
                    case 'Q':
                        rank = "Queen";
                        break;
                    case 'K':
                        rank = "King";
                        break;
                    default:
                        return "Unknown";
                }

                switch (suitChar) {
                    case 'D':
                        suit = "Diamonds";
                        break;
                    case 'H':
                        suit = "Hearts";
                        break;
                    case 'S':
                        suit = "Spades";
                        break;
                    case 'C':
                        suit = "Clubs";
                        break;
                    default:
                        return "Unknown";
                }

                return rank + " of " + suit;
            }

            return "Unknown";
        }
}
