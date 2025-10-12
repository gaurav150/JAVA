import java.util.*;

public class CollectionsMethod {

    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Heart", 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("Cards Size = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubss = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubss, "Kings of Clubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card Collection with Aces Added", 2);

        Collections.copy(cards, kingsOfClubss);
        Card.printDeck(cards, "Cards Collection with kings copied", 2);

        cards = List.copyOf(kingsOfClubss);
        Card.printDeck(cards, "List copy of kings", 1);

        List<Card> deckA = Card.getStandardDeck();
        Card.printDeck(deckA);

        Collections.shuffle(deckA);
        Card.printDeck(deckA, "Shuffled Deck", 4);

        Collections.reverse(deckA);
        Card.printDeck(deckA, "Reversed Deck", 4);


        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);


        Collections.sort(deckA, sortingAlgorithm);
        Card.printDeck(deckA, "Standard Deck sorted by rank,suit", 13);

        Collections.reverse(deckA);
        Card.printDeck(deckA, "Reversing our deck", 13);

        List<Card> kings = new ArrayList<>(deckA.subList(4, 8));
        Card.printDeck(kings, "Kings is Deck", 1);


        List<Card> tens = new ArrayList<>(deckA.subList(16, 20));
        Card.printDeck(tens, "Tens in Deck", 1);


        Collections.shuffle(deckA);
        int subListIndex = Collections.indexOfSubList(deckA, tens);
        System.out.println("sublist index for tens " + subListIndex);
        System.out.println("contains = " + deckA.containsAll(tens));

        boolean disjoint = Collections.disjoint(deckA, tens);
        System.out.println("disjoint = " + disjoint);

        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println("disjoint2 = " + disjoint2);

        deckA.sort(sortingAlgorithm);
        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
        int foundIndex = Collections.binarySearch(deckA, tenOfHearts, sortingAlgorithm);
        System.out.println("Index Found of tensOfHeart " + foundIndex);
        System.out.println("foundIndex = " + deckA.indexOf(tenOfHearts));
        System.out.println(deckA.get(foundIndex));

        Card tensOfClubs = Card.getNumericCard(Card.Suit.CLUB, 10);
        Collections.replaceAll(deckA, tensOfClubs, tenOfHearts);
        Card.printDeck(deckA.subList(32, 36), "Tens row", 1);

        Collections.replaceAll(deckA, tenOfHearts, tensOfClubs);
        Card.printDeck(deckA.subList(32, 36), "Tens row", 1);

        if (Collections.replaceAll(deckA, tenOfHearts, tensOfClubs)) {
            System.out.println("Tens of Hearts replaced with tens of clubs.");
        } else {
            System.out.println("No tens of hearts found in the list.");
        }

        System.out.println("Tens of Clubs Cards = " +
                Collections.frequency(deckA, tensOfClubs));
        System.out.println("Best Card = " + Collections.max(deckA, sortingAlgorithm));

        System.out.println("Worst Card = " +
                Collections.min(deckA, sortingAlgorithm));

        var sortBySuit = Comparator.comparing(Card::suit)
                .thenComparing(Card::rank);

        deckA.sort(sortBySuit);
        Card.printDeck(deckA, "Sorted By Suit", 4);

        List<Card> copied = new ArrayList<>(deckA.subList(0, 13));
        Collections.rotate(copied, 3);
        System.out.println("UnRotated " + deckA.subList(0, 13));
        System.out.println("Rotated " + 3 + " : " + copied);

        copied = new ArrayList<>(deckA.subList(0, 13));
        Collections.rotate(copied, -3);
        System.out.println("UnRotated " + deckA.subList(0, 13));
        System.out.println("Rotated " + -3 + " : " + copied);

        copied = new ArrayList<>(deckA.subList(0, 13));
        for (int i = 0; i < copied.size() / 2; i++) {
            Collections.swap(copied, i, copied.size() - 1 - i);
        }
        System.out.println("Manual reverse: " + copied);

        copied = new ArrayList<>(deckA.subList(0, 13));
        Collections.reverse(copied);
        System.out.println("Using Reverse " + copied);

    }
}