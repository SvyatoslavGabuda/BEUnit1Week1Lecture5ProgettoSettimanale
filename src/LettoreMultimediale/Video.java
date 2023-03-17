package LettoreMultimediale;

public class Video extends ElementoMultimediale implements Riproducibile, Luminosita {
	private int volume = 5;
	private int durata = 5;
	private int luminosita = 5;

	public Video(String t) {
		super(t);

	}

	public Video(String t, int d, int v, int l) {
		this(t);
		if (d >= 0) {
			this.durata = d;

		} else {
			this.durata = 1;
		}
		if (v >= 0) {
			this.volume = v;

		} else {
			this.volume = 1;
		}
		if (l >= 0) {
			this.luminosita = l;

		} else {
			this.luminosita = 1;
		}
	}

	@Override
	public void play() {
		System.out.println(this);
		for (int i = 0; i < this.durata; i++) {
			System.out.print(this.getTitolo() + " ");
			for (int j = 0; j < this.volume; j++) {
				System.out.print("!");
			}
			for (int k = 0; k < this.luminosita; k++) {
				System.out.print("*");
				if (k == this.luminosita - 1) {
					System.out.print("\n");
				}
			}
		}

	}

	public String toString() {
		return "\n\t Video Riprodotto: \n";
	}

	@Override
	public void setDurata(int d) {
		if (d >= 0) {
			this.durata = d;
		} else {
			this.durata = 1;
		}

	}

	@Override
	public int getDurata() {

		return this.durata;
	}

	@Override
	public void setVolumue(int v) {
		if (v >= 0) {
			this.volume = v;
		} else {
			this.volume = 1;
		}

	}

	@Override
	public int getVolume() {
		return this.volume;

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

	@Override
	public void aumentaVolume() {
		this.volume++;

	}

	@Override
	public void diminuisciVolume() {
		if (this.volume == 0) {
			this.volume = 0;
		} else {
			this.volume--;
		}
	}

}
