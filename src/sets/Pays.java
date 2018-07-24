package sets;

import formatage.StringUtils;

public class Pays {
	/** Attributs */
	private String nom;
	private double nbhabitant;
	private double PIB;
	private double PibTotal;

	/** Constructeur avec paramétres */
	public Pays(String nom, int nbhabitant, double pIB) {
		this.nom = nom;
		this.nbhabitant = nbhabitant;
		PIB = pIB;
		PibTotal = nbhabitant * pIB;
	}

	@Override
	public String toString() {
		String nombreHabitantsFormate = StringUtils.format(nbhabitant, "#,###");
		String pibParHabitantFormate = StringUtils.format(PIB, "#,###.00");
		String pibTotalFormate = StringUtils.format(PibTotal, "#,###.00");
		return nom + " -> " + nombreHabitantsFormate + " habitants -> " + "PIB/habitant = " + pibParHabitantFormate + " $" +
		" -> PIB Total = " + pibTotalFormate + " $";
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNbhabitant() {
		return nbhabitant;
	}

	public double getPibTotal() {
		return PibTotal;
	}

	public void setPibTotal(double pibTotal) {
		PibTotal = pibTotal;
	}

	public void setNbhabitant(double nbhabitant) {
		this.nbhabitant = nbhabitant;
	}

	public double getPIB() {
		return PIB;
	}

	public void setPIB(double pIB) {
		PIB = pIB;
	}
}
