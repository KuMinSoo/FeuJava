package OOP2;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	int n=(int)(Math.random()*CARD_NUM);
	
	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int card = i % 10 + 1;
			boolean isKwang = card < 10 && (card == 1 || card == 3 || card == 8) ? true : false;
			cards[i] = new SutdaCard(card, isKwang);

		}
	}

	public void shuffle() {
		
		for(int i=0;i<CARD_NUM;i++) {
			SutdaCard tmp=cards[i];
			cards[i]=cards[n];
			cards[n]=tmp;
		}
	}
	
	public SutdaCard pick(int index) {
		if(index<0||index>=CARD_NUM) return null;
		return cards[index];
	}

	public SutdaCard pick() {
		return cards[n];
	}
	

}

class SutdaCard {

	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}

}

public class Ex1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println("첫번째 카드:"+deck.pick(0));
		System.out.println("랜덤카드 한개:"+deck.pick());
		deck.shuffle();
		System.out.println("섞은 후");
		
		
		
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(i == 0 ? deck.cards[i] : ", " + deck.cards[i]);
		}
		System.out.println();
		System.out.println("첫번째 카드:"+deck.pick(0));
		
	}

}
