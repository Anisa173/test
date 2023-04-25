package organizata.OOP;

import java.util.Scanner;

public class Punonjesi extends PunKontratë {
	private static Scanner input = new Scanner(System.in);

	int[] idPunonjesi;
	private String gradeProfesioni;
	private int orePunshtese;
	private double rritjepgOreshtese;
	private double paga;

	public Punonjesi() {
		gradeProfesioni = "Inspektor";
		orePunshtese = 2;
		rritjepgOreshtese = 0.15;
	}

	public Punonjesi(String gradeProfesioni, int[] idPunonjesi, double paga) {

		this.gradeProfesioni = gradeProfesioni;
		this.idPunonjesi = idPunonjesi;
		this.paga = paga;
	}

//constructor chaining	
	protected Punonjesi(String emerP, String mbiemerP, String nId,String status, String dataSt_fin, double pagaFikse, String adresë,
			int orëPditore_fikse, double eksperiencePune, String gradeProfesioni, int[] idPunonjesi, int orePunshtese,
			double rritjepgOreshtese, double paga) {
		super();

		this.idPunonjesi = idPunonjesi;
		this.gradeProfesioni = gradeProfesioni;
		this.orePunshtese = orePunshtese;
		this.rritjepgOreshtese = rritjepgOreshtese;
		this.paga = paga;
	}

	private String afishogradeProfesioni() {
		// System.out.println("Grada e profesionit tuaj eshte:");
		gradeProfesioni = input.nextLine();
		System.out.println(gradeProfesioni);
		return gradeProfesioni;
	}

	public String getGradeProfesioni() {
		afishogradeProfesioni();
		return gradeProfesioni;
	}

	private int[] afishoidPunonjesi() {
		int n = 5;// IdPunonjesi permban 5 shifra
		int id[] = new int[n];
		System.out.println("Id e Punonjesit eshte:");
		for (int i = 0; i < 5; i++) {
			id[i] = i + 1;
			System.out.print(id);

		}
		return id;
	}

	public int[] getIdPunonjesi() {
		afishoidPunonjesi();
		return idPunonjesi;
	}

	private int afishoOrePunshtese() {
		System.out.println("Afisho oret shtese te punes:");
		orePunshtese = input.nextInt();
		System.out.println(orePunshtese);
		return orePunshtese;
	}

	public double getOrePunshtese() {
		afishoOrePunshtese();
		return rritjepgOreshtese;
	}

//sa % e pages baze rritet paga baze per nje ore pune shtese?
	private double afishorritjePgOresht() {
	  System.out.println("Per cdo ore pune shtese paga rritet me :");
		rritjepgOreshtese = input.nextDouble();
		System.out.println(rritjepgOreshtese + " " + " e pages fikse/baze");
		
		return rritjepgOreshtese;
	}

	public double getRritjepgOreshtese() {
		afishorritjePgOresht();
		return rritjepgOreshtese;
	}

	private double afishoPaga(int orePunshtese, double rritjepgOreshtese, double pagaFikse) {
		double paga1 = 0;
		System.out.println("Paga e perditesuar eshte:");
		if (orePunshtese > 0) {
			paga1 = pagaFikse * (1 + (orePunshtese * rritjepgOreshtese));
			System.out.println(paga1);
		} else {
			paga1 = pagaFikse;
		}
		return paga1;
	}

	public double getPaga() {
		afishoPaga(orePunshtese, rritjepgOreshtese, pagaFikse);
		return paga;
	}

	@Override
	public void afishoStatusin() {
		System.out.println("Punonjes i kualifikuar");

	}

}
