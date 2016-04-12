/**
 * Die Klasse Bruch stellt einfache Operationen zur Arbeit mit Bruechen zur
 * Verfuegung.
 * 
 * @author elexx
 *
 */
public class Bruch {

	private double zaehler;
	private double nenner;
	private double ggt;

	/**
	 * Standard-Konstruktor der Klasse Bruch.
	 */
	public Bruch() {
		this(1.0, 1.0);

	}

	/**
	 * Konstruktor der Klasse Bruch.
	 * 
	 * @param zaehler
	 *            Zaehler vom Typ double
	 * @param nenner
	 *            Nenner vom Typ double
	 */
	public Bruch(double zaehler, double nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	/**
	 * Nimmt den gegebenen Zaehler und Nenner und gibt ein String zurück.
	 * 
	 * @return den Zaehler und Nenner als String
	 */
	public String bruchErzeugen() {
		return zaehler + " / " + nenner;
	}

	/**
	 * Getter-Methode fuer den Zaehler.
	 * 
	 * @return zaehler als double
	 */
	public double getZaehler() {
		return zaehler;
	}

	/**
	 * Setter-Methode fuer den Zaehler.
	 * 
	 * @param zaehler
	 *            vom Typ double
	 */
	public void setZaehler(double zaehler) {
		this.zaehler = zaehler;
	}

	/**
	 * Getter-Methode fuer den Nenner.
	 * 
	 * @return nenner als double
	 */
	public double getNenner() {
		return nenner;
	}

	/**
	 * Setter-Methode fuer den Nenner.
	 * 
	 * @param nenner
	 *            vom Typ double
	 */
	public void setNenner(double nenner) {
		this.nenner = nenner;
	}

	/**
	 * Addiert zwei Brueche zu einem Bruch zusammen.
	 * 
	 * @param br
	 *            vom Typ Bruch
	 */
	public void addiere(Bruch br) {
		zaehler = zaehler * br.nenner + nenner * br.zaehler;
		nenner *= br.nenner;
		kuerzen();

	}

	/**
	 * Subtrahiert zwei Brueche zu einem Bruch.
	 * 
	 * @param br
	 *            vom typ Bruch
	 */
	public void subtrahiere(Bruch br) {
		zaehler = zaehler * br.nenner - nenner * br.zaehler;
		nenner *= br.nenner;
		kuerzen();

	}

	/**
	 * Multipliziert zwei Brueche.
	 * 
	 * @param br
	 *            vom typ Bruch
	 */
	public void multipliziere(Bruch br) {
		zaehler = (zaehler * br.zaehler);
		nenner = (nenner * br.nenner);
		kuerzen();

	}

	/**
	 * Dividiert zwei Brueche.
	 * 
	 * @param br
	 *            vom Typ Bruch
	 */
	public void dividiere(Bruch br) {
		zaehler = zaehler * br.nenner;
		nenner = nenner * br.zaehler;
		kuerzen();

	}

	/**
	 * Kuerzt Brueche sofort nachdem sich seine Werte geaendert haben mit Hilfe
	 * des groessten gemeinsamen Teilers.
	 */
	private void kuerzen() {
		double a = Math.abs(this.zaehler);
		double b = this.nenner;
		while (a != b) {
			if (a > b) {
				a = a - b;
			} 
			else {
				b = b - a;
			}
		}
		this.ggt = a;
		zaehler = zaehler / ggt;
		nenner = nenner / ggt;
	}
}
