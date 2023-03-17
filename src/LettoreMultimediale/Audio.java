package LettoreMultimediale;

public class Audio extends ElementoMultimediale implements Riproducibile {
	private int durata = 5;
	private int volume = 5;

	public Audio(String t) {
		super(t);

	}

	public Audio(String t, int d, int v) {
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
	public void play() {
		System.out.println(this);
		for (int i = 0; i < this.durata; i++) {
			System.out.print(this.getTitolo() + " ");
			for (int j = 0; j < this.volume; j++) {
				System.out.print("!");
				if (j == this.volume - 1) {
					System.out.print("\n");
				}
			}
		}
	}

	public String toString() {
		return "\n\t Audio Riprodotto: \n" + "";
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
