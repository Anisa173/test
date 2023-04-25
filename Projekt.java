package organizata.OOP;

import java.util.Scanner;

public class Projekt extends Departamenti {

	private static Scanner in = new Scanner(System.in);
	private String[][] emerProjekti;
	private int[][] idProjekti;
	private double[][] kostoP;
	private int[][] kohezgjatjaPr;
	private String[][] datast_finProj;

	public Projekt() {
		System.out.println("Konstruktor pa parametra.");
	}

	public Projekt(String[][] emerProjekti, int[][] idProjekti) {
		this.emerProjekti = emerProjekti;
		this.idProjekti = idProjekti;
	}

	public Projekt(int noDept, int[] idDept, String[] emerDept, String[] deptVendodhje, int[] nrProjekteDept,
			Punonjesi[] pn, PunKontratë[] punKontrat, Supervizor[] sp, String[][] emerProjekti, int[][] idProjekti,
			int[][] kohezgjatjaPr, double[][] kostoP, String[][] datast_finProj) {
		super();

		this.idProjekti = idProjekti;
		this.emerProjekti = emerProjekti;
		this.kohezgjatjaPr = kohezgjatjaPr;
		this.kostoP = kostoP;
		this.datast_finProj = datast_finProj;
	}

	private int[] afishonumerProjektesh(int noDept) {
		int nrT[] = new int[noDept];
		for (int i = 0; i < noDept; i++) {
			System.out.println("Numri i projekteve per  departamentin" + " " + (i + 1) + " " + "eshte:");
			nrT[i] = in.nextInt();
			System.out.println(nrT[i]);
		}
		return nrT;
	}

	public int[] getNrProjekteDept() {
		afishonumerProjektesh(noDept);
		return nrProjekteDept;
	}

	private int[][] afishoIdProjektesh(int noDept, int[] nrProjekteDept) {
		int[][] idPr = null;

		for (int i = 0; i < noDept; i++) {
			System.out.println("Id-te e projekteve per departamentin" + " " + (i + 1) + " " + "eshte:");
			for (int j = 0; j < nrProjekteDept[i]; j++) {
				for (int k = i; k < (noDept + 4); k++) {
					idPr[k][j] = 2 * k + 1 + j;
					System.out.println(idPr[k][j]);
				}
			}
		}

		return idPr;
	}

	public int[][] geIdProjekti() {
		afishoTemaProjektesh(noDept, nrProjekteDept);
		return idProjekti;
	}

	private String[][] afishoTemaProjektesh(int noDept, int[] nrProjekteDept) {

		String[][] temaP = null;
		for (int i = 0; i < noDept; i++) {
			System.out.println("Temat e projekteve per departamentin" + " " + (i + 1) + " " + "eshte:");
			for (int j = 0; j < nrProjekteDept[i]; j++) {
				temaP[i][j] = in.nextLine();
				System.out.println(temaP[i][j]);
			}
		}
		return temaP;
	}

	public String[][] getEmerProjekti() {
		afishoTemaProjektesh(noDept, nrProjekteDept);
		return emerProjekti;
	}

	private double[][] afishokostoP(int noDept, int[] nrProjekteDept) {
		double[][] kostoP = null;
		for (int i = 0; i < noDept; i++) {
			System.out.println("Kosto e projekteve per departamentin" + " " + (i + 1) + " " + "eshte:");
			for (int j = 0; j < nrProjekteDept[i]; j++) {
				kostoP[i][j] = in.nextDouble();
				System.out.println(kostoP[i][j]);
			}
		}
		return kostoP;
	}

	public double[][] getKostoP() {
		afishokostoP(noDept, nrProjekteDept);
		return kostoP;
	}

	private int[][] afishokohezgjatjeP(int noDept, int[] nrProjekteDept) {
		int[][] kohezgjatjeP = null;
		for (int i = 0; i < noDept; i++) {
			System.out.println("Kohezgjatja ne muaj e projekteve per departamentin" + " " + (i + 1) + " " + "eshte:");
			for (int j = 0; j < nrProjekteDept[i]; j++) {
				kohezgjatjeP[i][j] = in.nextInt();
				System.out.println(kohezgjatjeP[i][j]);
			}
		}
		return kohezgjatjeP;
	}

	public int[][] getKohezgjatjePr() {
		afishokohezgjatjeP(noDept, nrProjekteDept);
		return kohezgjatjaPr;
	}

	private String[][] afishoDateP(int noDept, int[] nrProjekteDept) {
		String[][] dataP = null;
		for (int i = 0; i < noDept; i++) {
			System.out.println(
					"Data kur fillojne dhe mbarojne projektet per departamentin" + " " + (i + 1) + " " + "eshte:");
			for (int j = 0; j < nrProjekteDept[i]; j++) {
				dataP[i][j] = in.nextLine();
				System.out.println(dataP[i][j]);
			}
		}
		return dataP;
	}

	public String[][] getdatast_finProj() {
		afishoDateP(noDept, nrProjekteDept);
		return datast_finProj;
	}

	public void funksionPune() {
		System.out.println("Mbaroni projektin sipas afateve te caktuara!");
	}

}
