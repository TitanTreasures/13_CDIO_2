package Spil;

public class Spilleplade {
/*
	 [En spilleplade der har de forskellige navne til felterne, og deres numre,
	 sammen med deres effekt på ens scorre
	 Der er tre forskellige metoder (D.D. 23-10-15 05:47), disse er:
	 getNytFeltNummer, denne metode skal bruge det nuværende feltnummer
	 altså spillerens nuværende placering inden der rykkes, og den sum
	 spilleren slog med terningerne, den tager højde for hvis man kommer
	 over spillepladens længde (Beskrivelse af denne står længere nede i næste
	 kommentar spor), og derefter returnere den det nye felt.
	 Næste metode er getFeltNavn, denne metode skal bruge spillerens placering
	 på felterne (Ny som gammel), og læser så fra
	 arrayet private String[] FeltNavn, og vil så returnere hvad feltets navn
	 er.
	 Sidste metode er getNyScorre, denne skal bruge spillerens nuværende
	 scorre, og læser så fra tidligere hvilket felt spilleren er på
	 derefter lægges spillerens nuværende scorre sammen med den effekt feltet
	 det står på har, hvad end den er positiv eller negativ
	
	 Da de to sidste bruger variablen private int NewFelt, er det en
	 forudsætning at metoden getNytFeltNummer er blevet kørt for spilleren,
	 inden de to andre metoder kan fungere rigtigt
*/


/*	
	 Husk at hvis der ændres på spillepladens længde, skal der sættes
	 dubletter af de allerede eksisterende felter
	 ind igen, lige nu er pladen som i ProjektBeskrivelsen, Dvs. med 11 felter
	 hvor de alle, borteset fra et, har en effekt på ens scorre.
	 For at sætte nye felter ind, skal der tilføjes en scorre effekt (Dvs.
	 hvordan feltet har en effekt på ens scorre), i Arrayet > private int[] Felter <
	 og der skal tilføjes et navn til (OBS VIGTIGT (Navnet skal have det samme
	 placeringsnummer, som den effekt der blev tilføjet))
	
	 Spilleplade som beskrevet af projektet ( Kan genindsættes hvis der er
	 sket utilsigtede ændringer )
	
	 private int[] Felter = { 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650 };
	 private String[] FeltNavn = {"Tower", "Crater", "Palace gates", "Cold Desert", "Cold Desert", "Monastery", "Black cave", "Huts in the mountain", "The Werewall", "The pit", "Goldmine"};
	 private int NewFelt = 0;
	 private int NyScorre = 0;
*/
	Language X = new Language();
	private int[] Felter = { 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650 };
	private String[] FeltNavn = { X.lang()[14], X.lang()[15], X.lang()[16], X.lang()[17], X.lang()[18], X.lang()[19], X.lang()[20], X.lang()[21], X.lang()[22], X.lang()[23], X.lang()[24] };
	

	public int getFeltEffekt(int Spillerfelt) {

		return Felter[Spillerfelt-1];
	}

	public String getFeltNavn(int Spillerfelt) {

		return FeltNavn[Spillerfelt-1];
	}

}