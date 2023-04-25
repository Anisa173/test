package organizata.OOP;

import java.util.Scanner;

public class Supervizor extends Punonjesi {
	private static Scanner sc = new Scanner(System.in);

	protected int [] spId;
	private int nr_punSup; // nr_punonjesve qe ka nen mbikqyrje nje supervizor

	public Supervizor() {
		nr_punSup = 12;
		System.out.println("Konstruktor pa parametra!");
	}

	public Supervizor(String emerP, String mbiemerP, String nId, String dataSt_fin,String status, double pagaFikse, String adresë,
			int orëPditore_fikse, double eksperiencePune, String gradeProfesioni, String idPunonjesi, int orePunshtese,
			double rritjepgOreshtese, double paga, int [] spid, int nr_punSup) {
		super();
		this.spId = spId;
		this.nr_punSup = nr_punSup;
	}

	private int[] afishoIdSuperV() {
		int n = 4;// IdSupervizori permban 4 shifra
		int idSpv[] = new int[n];
		System.out.println("Id e Supervizorit eshte:");
		for (int i = 0; i < 4; i++) {
			idSpv[i] = 2 * i + 1;
			System.out.print(idSpv);
		}
		return idSpv;
	}

	public int[] getSpId() {
		afishoIdSuperV();
		return spId;
	}

	private int afishoNrPunSpv() {
		System.out.println("Afisho numrin e punonjesve te supervizuar:");
		nr_punSup = sc.nextInt();
		System.out.println(nr_punSup);
		return nr_punSup;
	}

	public double getNr_punSup() {
		afishoNrPunSpv();
		return nr_punSup;
	}

	@Override
	public void afishoStatusin() {
		System.out.println("Ekspert i kualifikuar");

	}
}
