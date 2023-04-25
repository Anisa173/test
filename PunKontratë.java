package organizata.OOP;

import java.util.Scanner;

public class PunKontratë {
	private static Scanner sc = new Scanner(System.in);
	private String emerP;
	private String mbiemerP;
	private String nId;
	private double eksperiencePune;// vite dhe muaj ose vetem vite ose vetem muaj
	private String dataSt_fin;
	protected double pagaFikse;
	private String status;
	private String adresë;
	private int orëPditore_fikse;

	public PunKontratë() {
		emerP = "emer";
		mbiemerP = "mbiemer";
		nId = "J3546875";
		dataSt_fin = "1.03.2027 - 1.09.2027";
		status = "status";
		pagaFikse = 50000;
		adresë = "Tirane ,Rr: Ibrahim Rugova";
		orëPditore_fikse = 6;
		eksperiencePune = 1.702;
	}

	// constructor me parametra
	public PunKontratë(String nId, String dataSt_fin, double pagaFikse, int orëPditore_fikse) {
		this.nId = nId;
		this.dataSt_fin = dataSt_fin;
		this.pagaFikse = pagaFikse;
		this.orëPditore_fikse = orëPditore_fikse;

	}

	// constructor chaining
	public PunKontratë(String emerP, String mbiemerP, String nId, String dataSt_fin,String status, double pagaFikse,
			String adresë, int orëPditore_fikse, double eksperiencePune) {
		this.emerP = emerP;
		this.mbiemerP = mbiemerP;
		this.nId = nId;
		this.dataSt_fin = dataSt_fin;
		this.status = status;
		this.pagaFikse = pagaFikse;
		this.adresë = adresë;
		this.orëPditore_fikse = orëPditore_fikse;
		this.eksperiencePune = eksperiencePune;
	}
	private String afishoStatus() {
		System.out.println("Statusi juaj eshte:");
		status = sc.nextLine();
	System.out.println(status);
		return status;
	}

	public String getStatus() {
		afishoStatus();
		return status;
	}
	
	private String afishoEmer() {
		System.out.println("Vendos emrin:");
		emerP = sc.nextLine();
	System.out.println(emerP);
		return emerP;
	}

	public String getEmerP() {
		afishoEmer();
		return emerP;
	}

	private String afishoMbiemerP() {
		System.out.println("Vendos Mbiemrin:");
		mbiemerP = sc.nextLine();
		System.out.println(mbiemerP);
		return mbiemerP;
	}

	public String getMbiemerP() {
		afishoMbiemerP();
		return mbiemerP;
	}

	private String afishoAdresen() {
		System.out.println("Vendos adresen ku ndodhesh:");
		adresë = sc.nextLine();
		System.out.println(adresë);	
		return emerP;
	}

	public String getAdresë() {
		afishoAdresen();
		return adresë;
	}
	private int afishoOredfikse() {
		System.out.println("Vendos numrin e oreve te punes ne dite");
		orëPditore_fikse = sc.nextInt();
		System.out.println(orëPditore_fikse);
		return orëPditore_fikse;
	}
	public int getOrëPditore_fikse() {
		afishoOredfikse();
		return orëPditore_fikse;
	}
	private double afishoPagen() {
		System.out.println("Afishoni pagen baze/fikse mujore");
		pagaFikse = sc.nextDouble();
		System.out.println(pagaFikse);
		return pagaFikse;
	}

	public double getPagaFikse() {
		afishoPagen();
		return pagaFikse;
	}

	private String afishoNid() {
		System.out.println("Vendos numrin personal te identifikimit:");
		nId = sc.nextLine();
		System.out.println(nId);
		return nId;
	}
	public String getNId() {
		afishoNid();
		return nId;
	}

	private String afishoKohezgjatjen() {
	System.out.println("Vendos daten e fillimit deri ne daten e mbarimit:");
		dataSt_fin = sc.nextLine();
		System.out.println(dataSt_fin);
		return dataSt_fin;
	}

	public String getdataSt_fin() {
		afishoKohezgjatjen();
		return dataSt_fin;
	}

// nenshkrimi i kontrates cdo tre muaj ose i kontraktuar per nje qellim specifik
// ne nje periudhe te paracaktuar fikse ,supozoj 6 muaj

	private double afishoKohezgjatjePune() {
		System.out.println("Sa kohe kini punar ne kompani?");
		eksperiencePune = sc.nextDouble();
		System.out.println(eksperiencePune + "-vit/e .");

		return eksperiencePune;
	}

	public double getEksperiencePune() {
		afishoKohezgjatjePune();
		return eksperiencePune;
	}

    
	public void afishoStatusin() {
		System.out.println("Punonjes me kontrate");
	}

}
