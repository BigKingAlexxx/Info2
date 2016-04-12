package de.hska.iwii.i2.gol;

/**
 * Die eigentliche Spielelogik. Das Spielfeld wird hier nicht als zyklisch
 * geschlossen betrachtet wird.
 *
 * @author Holger Vogelsang
 */
public class GameOfLifeLogic {
	private boolean[][] currentGen;

	/**
	 * Durch den Aufruf dieser Methode durch die Visualisierung bekommen Sie die
	 * im Menue ausgewaehlte Startsituation als zweidimensionales Array
	 * uebergeben.
	 * 
	 * @param generation
	 *            Übergabeparameter vom Typ boolean
	 */
	public void setStartGeneration(boolean[][] generation) {
		currentGen = generation;

	}

	/**
	 * Berechnet die Folgegeneration der aktuellen und traegt sie in das Array
	 * ein.
	 */
	public void nextGeneration() {
		boolean[][] nextGen = new boolean[currentGen.length][currentGen[0].length];
		for (int i = 0; i < currentGen.length; i++) {
			for (int j = 0; j < currentGen[0].length; j++) {
				int fieldOccupied = 0;
				for (int k = -1; k <= 1; k++) {
					for (int l = -1; l <= 1; l++) {
						if ((i + k >= 0) && (j + l >= 0) && (i + k < currentGen.length)
								&& (j + l < currentGen[0].length)) {
							if (currentGen[i + k][j + l]) {
								fieldOccupied++;
							}
						}

					}
				}
				if (currentGen[i][j]) {
					fieldOccupied--;
				}
				if (fieldOccupied < 4 && currentGen[i][j]) {
					nextGen[i][j] = true;
				}

				if (fieldOccupied < 2 && currentGen[i][j]) {
					nextGen[i][j] = false;
				}

				if (fieldOccupied >= 4 && currentGen[i][j]) {
					nextGen[i][j] = false;
				}

				if (fieldOccupied == 3 && !(currentGen[i][j])) {
					nextGen[i][j] = true;
				}
			}
		}
		currentGen = nextGen;
	}

	/**
	 * Testet, ob die Zelle an der Position (x, y) in der aktuellen Generation
	 * lebt. Dann ist der Rueckgabewert true, ansonsten false.
	 * 
	 * @param x-Position
	 * @param y-Position
	 * @return true oder false
	 */
	public boolean isCellAlive(int x, int y) {
		return currentGen[x][y];

	}
}