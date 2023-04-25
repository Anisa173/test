package organizata.OOP;

import java.util.Scanner;

public class Departamenti {
	private static Scanner in = new Scanner(System.in);

	protected int noDept;// Supozohet se organizata perbehet nga 5 departamente
	private int[] idDept;
	protected String[] emerDept;
	private String[] deptVendodhje;

	protected int[] nrProjekteDept;
	private Punonjesi[][] pn;
	private PunKontratë[][] punKontrat;
	private Supervizor[][] sp;

	public Departamenti() {

		noDept = 4;

		System.out.println("Konstruktori pa parametra");
	}

	public Departamenti(int[] idDept, String[] emerDept, int[] nrProjekteDept) {
		this.idDept = idDept;
		this.emerDept = emerDept;
		this.nrProjekteDept = nrProjekteDept;
	}

	// constructor chaining overloading
	public Departamenti(int noDept, int[] idDept, String[] emerDept, String[] deptVendodhje, int[] nrProjekteDept,
			Punonjesi[][] pn, PunKontratë[][] punKontrat, Supervizor[][] sp) {
		this.noDept = noDept;
		this.idDept = idDept;
		this.emerDept = emerDept;
		this.deptVendodhje = deptVendodhje;

		this.nrProjekteDept = nrProjekteDept;
		this.pn = pn;
		this.punKontrat = punKontrat;
		this.sp = sp;
	}

	private int afishoNoDept() {
		System.out.println("Numri i departamenteve te organizates eshte:");
		noDept = in.nextInt();
		System.out.println(noDept);
		return noDept;
	}

	public int getNoDept() {
		afishoNoDept();
		return noDept;
	}

	private int[] afishoidDept(int noDept) {

		int idD[] = new int[noDept];

		for (int i = 0; i < noDept; i++) {
			System.out.println("Id e Departamentit" + " " + (i + 1) + " " + "eshte:");
			idD[i] = 3 * i + 10;
			System.out.println(idD);

		}
		return idD;
	}

	public int[] getIdDept() {
		afishoidDept(noDept);
		return idDept;
	}

	private String[] afishoEmerDepartamenti(int noDept) {
		String emerD[] = new String[noDept];
		for (int i = 0; i < noDept; i++) {
			System.out.println("Departamenti" + " " + (i + 1) + " " + "eshte :");
			emerD[i] = in.nextLine();
			System.out.println(emerD[i]);
		}
		return emerD;
	}

	public String[] getEmerDept() {
		afishoEmerDepartamenti(noDept);
		return emerDept;
	}

	@SuppressWarnings("unused")
	private String[] afishoVendodhjeD(int noDept) {
		String VendD[] = new String[noDept];
		for (int i = 0; i < noDept; i++) {
			System.out.println("Vendodhja e departamentit" + " " + (i + 1) + " " + "eshte :");
			VendD[i] = in.nextLine();
			System.out.println(VendD[i]);
		}
		return VendD;
	}

	public String[] getDeptVendodhje() {
		afishoEmerDepartamenti(noDept);
		return deptVendodhje;
	}

	private int[] afishonrProjekteDept(int noDept) {
		int nrPdept[] = new int[noDept];

		for (int i = 0; i < noDept; i++) {
			System.out.println("Numri i projekteve te Departamentit" + " " + (i + 1) + " " + "eshte:");
			nrPdept[i] = in.nextInt();
			System.out.println(nrPdept);

		}
		return nrPdept;
	}

	public int[] getNrProjekteDept() {
		afishonrProjekteDept(noDept);
		return nrProjekteDept;
	}

	public static PunKontratë[][] afishoPunKontDept(int noDept) {
		System.out.println("Vendos numrin e punonjesve me kontrate:");
		int nrPkdept = in.nextInt();
		PunKontratë[][] pk = new PunKontratë[noDept][nrPkdept];
		for (int a = 0; a < noDept; a++) {
			System.out.println("Te dhenat e punonjesve per departamentin" + " " + (a + 1) + " " + "jane:");
			for (int j = 0; j < nrPkdept; j++) {
				System.out.println("Numri  personal i identifikimit te Punonjesit me kontrate te" + " " + (j + 1) + " "
						+ "eshte:");
				pk[a][j].getNId();
				System.out.println("Emer i Punonjesit  te" + " " + (j + 1) + " " + "eshte:");
				pk[a][j].getEmerP();
				System.out.println("Mbiemer i Punonjesit  te" + " " + (j + 1) + " " + "eshte:");
				pk[a][j].getMbiemerP();
				System.out.println("Statusi i Punonjesit te" + " " + (j + 1) + " " + "eshte:");
				pk[a][j].getStatus();
				System.out.println("Adresa e Punonjesit te" + " " + (j + 1) + " " + "eshte:");
				pk[a][j].getAdresë();
				System.out.println("Oret fikse ditore te Punonjesit te" + " " + (j + 1) + " " + "jane:");
				pk[a][j].getOrëPditore_fikse();
				System.out.println("Paga fikse mujore e Punonjesit te" + " " + (j + 1) + " " + "eshte:");
				pk[a][j].getPagaFikse();
				System.out
						.println("Data e fillimit dhe data e mbarimit te punonjesit" + " " + (j + 1) + " " + "eshte:");
				pk[a][j].getdataSt_fin();
				System.out.println(
						"Eksperienca e Punonjesit te" + " " + (j + 1) + " " + "ne specialitetin perkates eshte:");// numerojme
																													// vitePune
																													// ne
																													// te
																													// njejtin
																													// profil
																													// pune
																													// ne
																													// cdo
																													// organizate
																													// te
																													// meparshme
				pk[a][j].getEksperiencePune();
			}
		}
		return pk;
	}

	public PunKontratë[][] getPunKontrat() {
		afishoPunKontDept(noDept);
		return pn;
	}

	public static Punonjesi[][] afishoPunonjesDept(int noDept) {
		System.out.println("Vendos numrin e punonjesve :");
		int nrPdept = in.nextInt();
		Punonjesi[][] p = new Punonjesi[noDept][nrPdept];
		for (int a = 0; a < noDept; a++) {
			System.out.println("Te dhenat e punonjesve per departamentin" + " " + (a + 1) + " " + "jane:");
			for (int j = 0; j < nrPdept; j++) {
				System.out.println("Id e Punonjesit te" + " " + (j + 1) + " " + "eshte:");
				for (int i = j; i < (nrPdept + 5); i++) {
					p[a][j].idPunonjesi[i] = i + 1;
					System.out.print(p[a][j].idPunonjesi[i]);
				}
				System.out.println("Grada e Punonjesit te" + " " + (j + 1) + " " + "eshte:");
				p[a][j].getGradeProfesioni();
				System.out.println("Oret shtese te Punonjesit te" + " " + (j + 1) + " " + "jane:");
				p[a][j].getOrePunshtese();
				System.out.println("Rritja ne % per cdo ore_shtese te Punonjesit te" + " " + (j + 1) + " " + "eshte:");
				p[a][j].getRritjepgOreshtese();
				System.out.println("Rroga e perditesuar e punonjesit te" + " " + (j + 1) + " " + "eshte:");// nese ka
																											// perditesim
				p[a][j].getPaga();
			}
		}
		return p;
	}

	public Punonjesi[][] getPn() {
		afishoPunonjesDept(noDept);
		return pn;
	}

	public static Supervizor[][] afishoSupervizorDept(int noDept) {
		System.out.println("Vendos numrin e supervizoreve:");
		int nrSpdept = in.nextInt();
		Supervizor[][] sv = new Supervizor[noDept][nrSpdept];
		for (int a = 0; a < noDept; a++) {
			System.out.println("Te dhenat e supervizoreve per departamentin" + " " + (a + 1) + " " + "jane:");
			for (int j = 0; j < nrSpdept; j++) {
				System.out.println("Id e Supervizorit te" + " " + (j + 1) + " " + "eshte:");
				for (int i = j; i < (nrSpdept + 4); i++) {// 6+4=10
					sv[a][j].spId[i] = 2 * i + 1;// 1113151719
					System.out.print(sv[a][j].spId[i]);
				}
				System.out
						.println("Numri i punonjesve nen-mbikqyerje nga supervizori" + " " + (j + 1) + " " + "eshte:");
				sv[a][j].getNr_punSup();
			}
		}
		return sv;
	}

	public Supervizor[][] getSp() {
		afishoSupervizorDept(noDept);
		return sp;
	}

	public void funksionPune() {
		System.out.println("Mbaroni proceset e punes brenda afatit te caktuar!");// jo te gjithe punonjesit dhe departamentet punojne per
																					// projekte
	}
}
