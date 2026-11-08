package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		setId(id);
		setBruker(bruker);
		setLikes(0);
		setDato(dato);
		setTekst(tekst);
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		setLikes(likes);
		setTekst(tekst);
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String toString() {
		return "BILDE" + "\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n" + url + "\n";

	}
	/*
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		throw new UnsupportedOperationException(TODO.method());
	}
	 */
}