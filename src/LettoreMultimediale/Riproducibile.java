package LettoreMultimediale;

public interface Riproducibile {

	public void play();

	public void setDurata(int d);

	public int getDurata();

	public void setVolumue(int v);

	public void aumentaVolume();

	public void diminuisciVolume();

	public int getVolume();
}
