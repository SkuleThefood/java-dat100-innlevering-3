package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	//A
	Innlegg[] innleggtabell;
	int nesteledig;

	//B
	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	//C
	public int getAntall() {
		return nesteledig;
	}

	//D
	public Innlegg[] getSamling() {
		return innleggtabell;
	}

	//E
	public int finnInnlegg(Innlegg innlegg) {
		int toReturn = -1;
		for (int i = 0; i<nesteledig; i++){
			if (innleggtabell[i].erLik(innlegg)){
				toReturn = i;
				break;
			}
		}
		return toReturn;
	}

	//F
	public boolean finnes(Innlegg innlegg) {
		boolean toReturn = false;
		for (int i = 0; i<nesteledig; i++){
			if (innleggtabell[i].erLik(innlegg)){
				toReturn = true;
				break;
			}
		}
		return toReturn;
	}

	//G
	public boolean ledigPlass() {
		boolean toReturn = false;
		if (nesteledig < innleggtabell.length){
			toReturn = true;
		}
		return toReturn;

	}

	//H
	public boolean leggTil(Innlegg innlegg) {
		boolean toReturn = false;
		if (!finnes(innlegg) && ledigPlass()){
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			toReturn = true;
		}
		return toReturn;
	}

	//I
	public String toString() {
		String toReturn = nesteledig + "\n";
		for (int i = 0; i<nesteledig; i++){
			toReturn = toReturn + innleggtabell[i].toString();
		}
		return toReturn;
	}

	// valgfrie oppgaver nedenfor

	//J
	public void utvid() {
		Innlegg[] nySamling = new Innlegg[innleggtabell.length*2];
		for (int i = 0; i<nesteledig; i++){
			nySamling[i] = innleggtabell[i];
		}
		innleggtabell = nySamling;
	}
	//K
	public boolean leggTilUtvid(Innlegg innlegg) {
		boolean toReturn = false;
		if (!finnes(innlegg) && ledigPlass()){
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			toReturn = true;
		}
		else if (!finnes(innlegg) && !ledigPlass()){
			utvid();
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			toReturn = true;
		}
		return toReturn;
	}
	//L
	public boolean slett(Innlegg innlegg) {
		boolean toReturn = false;
		for (int i = 0; i<nesteledig; i++){
			if (innleggtabell[i].getId() == innlegg.getId()){
				innleggtabell[i] = null;
				toReturn = true;
			}
		}


		return toReturn;
	}
	//M
    /*   blei ikkje ferdig med denne
	public int[] search(String keyword) {
		int[] toReturn = null;
		int[] transformArray = null;
		char[] keywordSearch = new char[keyword.length()];
		int number = 0;
		char[] innleggSearch = null;
		keyword.getChars(0, keyword.length(), keywordSearch, 0);
		for (int i = 0; i<nesteledig; i++){
			innleggSearch = new char[innleggtabell[i].toString().length()];
			for (int x = 0; x<innleggSearch.length; x++){
				if (number == keywordSearch.length){
					transformArray = new int[toReturn.length+1];
					for (int y = 0; y<toReturn.length; y++){
						transformArray[y] = toReturn[y];
					}
					transformArray[transformArray.length-1] = innleggtabell[i].getId();
					toReturn = transformArray;
					transformArray = null;
					break;
				}
				if (innleggSearch[x] == keywordSearch[number]){
					number++;
				}
			}
		}

		return toReturn;
	}
	*/
}