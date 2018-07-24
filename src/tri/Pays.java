package tri;

import formatage.StringUtils;

public class Pays implements Comparable<Pays>{
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
	public int compareTo(Pays o) {
		if(this.PIB<o.getPIB()){
			return -1;
		}
		if(this.PIB>o.getPIB()){
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		String nombreHabitantsFormate = StringUtils.format(nbhabitant, "#,###");
		String pibParHabitantFormate = StringUtils.format(PIB, "#,###.00");
		String pibTotalFormate = StringUtils.format(PibTotal, "#,###.00");
		return nom + " -> " + nombreHabitantsFormate + " habitants -> " + "PIB/habitant = " + pibParHabitantFormate + " $" +
		" -> PIB Total = " + pibTotalFormate + " $\n";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pays other = (Pays) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
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
