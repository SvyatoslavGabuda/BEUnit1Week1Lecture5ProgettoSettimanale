package LettoreMultimediale;

public class Img extends ElementoMultimediale implements Luminosita {
	private int luminosita = 5;

	public Img(String t) {
		super(t);

	}

	public Img(String t, int l) {
		this(t);
		if (l >= 0) {

			this.luminosita = l;
		} else {
			this.luminosita = 1;
		}
	}

	public void show() {
		System.out.println(this);
		System.out.print(this.getTitolo() + " ");
		for (int i = 0; i < this.luminosita; i++) {
			System.out.print("*");
			if (i == this.luminosita - 1) {
				System.out.print("\n");
			}
		}
	}

	public String toString() {
		return "\n\t Immagine visualizzata: \n";
	}

	@Override
	public void setLuminosita(int l) {
		if (l >= 0) {
			this.luminosita = l;
		} else {
			this.luminosita = 1;
		}

	}

	@Override
	public int getluminosita() {

		return this.luminosita;
	}

	@Override
	public void aumentaLuminosita() {
		this.luminosita++;

	}

	@Override
	public void diminuisciLuminosita() {
		if (this.luminosita == 0) {
			this.luminosita = 0;
		} else {
			this.luminosita--;
		}

	}

}
