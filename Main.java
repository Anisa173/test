package organizata.OOP;

public class Main {
	/**
	 * Zgjidhni 5 objekte të botës reale dhe për secilën prej tyre modeloni klasën
	 * përkatëse. Aplikoni njohuritë e marra në seancën e datës 21/03/2023. 1.
	 * Deklaroni të paktën 2 atribute për çdo objekt që ju keni përzgjedhur 2.
	 * Deklaroni të paktën 2 veprime që mund të kryejmë me këto objekte 3. Deklaroni
	 * konstruktor no args dhe konstruktor me parametër brenda klasave të ndryshme
	 * që do krijoni 4. Aplikoni 'constructor chaining' për konstruktorët e krijuar.
	 * 5.Krijoni metodat lexuese dhe shkruese për state-in e objekteve të krijuara
	 * 6.Thërrisni në main nga 5 objekte për çdo klasë që do krijoni (me
	 * konstruktorë me parametra të ndryshëm).
	 **/

	static Departamenti dept = new Departamenti();
	static Punonjesi p = new Punonjesi();
	static Projekt proj = new Projekt();
	static Supervizor superV = new Supervizor();
	static PunKontratë pK = new PunKontratë();

	public static void main(String[] args) {
		// Punonjes me kontrate
		System.out.println("Te dhenat e punonjesit me kontrate:");
		pK.getNId();
		pK.getEmerP();
		pK.getMbiemerP();
		pK.getAdresë();
		pK.getStatus();
		pK.getOrëPditore_fikse();
		pK.getPagaFikse();
		pK.getdataSt_fin();
		pK.getEksperiencePune();
//Punonjes
		p.getGradeProfesioni();
		p.getIdPunonjesi();
		p.getOrePunshtese();
		p.getRritjepgOreshtese();
		p.getPaga();
//Supervizor		
		superV.getSpId();
		superV.getNr_punSup();
//Projekti		
		proj.getNrProjekteDept();
		proj.geIdProjekti();
		proj.getEmerProjekti();
		proj.getKostoP();
		proj.getKohezgjatjePr();
		proj.getdatast_finProj();

// Departamenti

		dept.getNoDept();
		dept.getIdDept();
		dept.getEmerDept();
		dept.getDeptVendodhje();
		dept.getNrProjekteDept();
		dept.getPunKontrat();
		dept.getPn();
		dept.getSp();
	}
}
