package LettoreMultimediale;

import java.util.Scanner;

public class LettoreMultimediale {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// I Seguenti comandi servivano per debuggin iniziale, se si deccomentano
		// visualizzeranno una "riprodizione" in console hardcodata

//		ElementoMultimediale primo = new Audio("Sono il titolo del primo audio", 3, 2);
//		ElementoMultimediale secondo = new Video("Sono il titolo video", 4, 2, 5);
//		ElementoMultimediale terzo = new Img("immagine", 4);
//		if (primo instanceof Audio) {
//			((Audio) primo).play();
//		}
//		if (secondo instanceof Video) {
//			((Video) secondo).play();
//		}
//		if (terzo instanceof Img) {
//			((Img) terzo).show();
//		} 

		// Creazione di una playlist di default
		ElementoMultimediale primo = new Audio("Audio 'The best interfaces'", 3, 2);
		ElementoMultimediale secondo = new Video("Video immaginario", 8, 4, 2);
		ElementoMultimediale terzo = new Img("immagine di un cucciolo", 4);
		ElementoMultimediale quarto = new Video("Video sui gatti", 4, 2, 5);
		ElementoMultimediale quinto = new Audio("Audio 'Rooling in the deep of Java'", 6, 2);
		
		//playlist di default
		ElementoMultimediale[] playListDefault = { primo, secondo, terzo, quarto, quinto };
		
		
		start(playListDefault);
		// riproduciPlayList(playListDefault);

	}
// esecutore principale del player
	public static void start(ElementoMultimediale[] p) {
		System.out.println("\tBenvenuto nel Lettore Multimediale");
		System.out.println("Quale playlist desideri riprodurre? \n 0 -- playListDefault \n 1 -- Crea Nuova playList");
		while(!scan.hasNextInt()) {
			System.out.println("ATTENZIONE! valore non valido \n\n---INSERISCI:\n 0 -- playListDefault \n 1 -- Crea Nuova playList ");
			scan.next();
		}
		int a = scan.nextInt();
		if (a == 0) {
			riproduciPlayList(p);
		} else if (a == 1) {
			creaPlayList();
		} else {
			System.out.println("puoi inserire o 0 o 1 .");
			start(p);
		}

	}
// funzione che regola la creazione della playlist da utente
	private static void creaPlayList() {
		System.out.println("\tFantastico!! Hai deciso di creare una nuova playList!! iniziamo... ");
		ElementoMultimediale[] playList = new ElementoMultimediale[5];
		for (int i = 0; i < playList.length; i++) {
			System.out.println("quale file vuoi inserire? \n 0 per Audio \n 1 per Video \n 2 per Immagine");
			while(!scan.hasNextInt()) {
				System.out.println("ATTENZIONE! valore non valido \n\n---INSERISCI: \n 0 per Audio \n 1 per Video \n 2 per Immagine");
				scan.next();
			}
			int t = scan.nextInt();
			if (t != 0 && t != 1 && t != 2) {
				System.out.println("ATTENZIONE inserici un carattere valido!! ");
				i--;

			} else {
				if (t == 0) {
					ElementoMultimediale creato = creaAudio();
					playList[i] = creato;
				} else if (t == 1) {
					ElementoMultimediale creato = creaVideo();
					playList[i] = creato;
				} else if (t == 2) {
					ElementoMultimediale creato = creaImmagine();
					playList[i] = creato;
				} else {
					System.out.println("inserito un carattere non valido");

				}
			}
		}
		riproduciPlayList(playList);

	}

//metodo che crea audio da input
	private static ElementoMultimediale creaAudio() {
		scan.nextLine();
		System.out.println("Inserisci il TITOLO della canzone: ");
		String titolo = scan.nextLine();
		System.out.println("Inserisci la DURATA della canzone: ");
		while(!scan.hasNextInt()) {
			System.out.println("ATTENZIONE! valore non valido \n inserire un interno positivo");
			scan.next();
		}
		int durata = scan.nextInt();
		System.out.println("Inserisci il VOLUME della canzone: ");
		while(!scan.hasNextInt()) {
			System.out.println("ATTENZIONE! valore non valido \n inserire un interno positivo");
			scan.next();
		}
		int volume = scan.nextInt();

		ElementoMultimediale audio = new Audio(titolo);
		((Audio) audio).setDurata(durata);
		((Audio) audio).setVolumue(volume);
		// ((Audio)primo).play();
		return audio;
	}

//metodo che crea video da input
	private static ElementoMultimediale creaVideo() {
		scan.nextLine();
		System.out.println("Inserisci il TITOLO del video: ");
		String titolo = scan.nextLine();
		System.out.println("Inserisci la DURATA del video: ");
		while(!scan.hasNextInt()) {
			System.out.println("ATTENZIONE! valore non valido \n inserire un interno positivo");
			scan.next();
		}
		int durata = scan.nextInt();
		System.out.println("Inserisci il VOLUME del video: ");
		while(!scan.hasNextInt()) {
			System.out.println("ATTENZIONE! valore non valido \n inserire un interno positivo");
			scan.next();
		}
		int volume = scan.nextInt();
		System.out.println("Inserisci la LUMINOSITA del video: ");
		while(!scan.hasNextInt()) {
			System.out.println("ATTENZIONE! valore non valido \n inserire un interno positivo");
			scan.next();
		}
		int luminosita = scan.nextInt();

		ElementoMultimediale video = new Video(titolo);
		((Video) video).setDurata(durata);
		((Video) video).setVolumue(volume);
		((Video) video).setLuminosita(luminosita);
		;

		// ((Video)video).play();
		return video;
	}

//metodo che crea img da imput
	private static ElementoMultimediale creaImmagine() {
		scan.nextLine();
		System.out.println("Inserisci il TITOLO del Immagine: ");
		
		String titolo = scan.nextLine();

		System.out.println("Inserisci la LUMINOSITA del Immagine: ");
	
		while(!scan.hasNextInt()) {
			System.out.println("ATTENZIONE! valore non valido \n inserire un interno positivo");
			scan.next();
		}
		int luminosita = scan.nextInt();

		ElementoMultimediale immagine = new Img(titolo);
		((Img) immagine).setLuminosita(luminosita);
		return immagine;

	}

//metodo che decide qualce elemento della playlist riprodure da input utente
	private static void riproduciPlayList(ElementoMultimediale[] p) {
		System.out.println("\tRiproduzione PlayList");
		System.out.println(
				"Quale elemento desideri Riprodurre? \n- inserire valori tra 1 e 5 \n- scrivere 0 per uscire dal player ");
		int n = 10;
		while (n != 0) {
			while(!scan.hasNextInt()) {
				System.out.println("ATTENZIONE! valore non valido \ninserire valori tra 1 e 5 \0 per uscire dal player");
				scan.next();
			}
			n = scan.nextInt();
			if (n == 0) {
				System.out.println("uscito dal plyaer");
			} else if (n <= p.length) {

				player(n - 1, p);
			} else {
				System.out.println("Elemento inesistente, inserire valori tra 1 e 5, 0  per finire");
			}

		}

	}
//metedo che aziona play o show in base al tipo di file scelto da utente 
	private static void player(int c, ElementoMultimediale[] p) {
		if (p[c] instanceof Video) {
			((Video) p[c]).play();
		}
		if (p[c] instanceof Audio) {
			((Audio) p[c]).play();
		}
		if (p[c] instanceof Img) {
			((Img) p[c]).show();
		}
	}

}
