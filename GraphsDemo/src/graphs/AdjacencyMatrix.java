package graphs;

import javax.sound.midi.Soundbank;

public class AdjacencyMatrix {

	public static void main(String[] args) {
		int v = 6;
		int [][] adjMat = new int [v][v];
		adjMat[0][4] = 1;
		adjMat[1][2] = 1;
		adjMat[1][4] = 1;
		adjMat[1][5] = 1;
		adjMat[2][1] = 1;
		adjMat[2][3] = 1;
		adjMat[2][5] = 1;
		adjMat[3][2] = 1;
		adjMat[3][4] = 1;
		adjMat[4][0] = 1;
		adjMat[4][1] = 1;
		adjMat[4][3] = 1;
		adjMat[5][1] = 1;
		adjMat[5][2] = 1;
		for(int i = 0; i < adjMat.length; i++) {
			System.out.print(i + " -> ");
			for(int j = 0; j < adjMat[i].length; j++) {
				if(adjMat[i][j] == 1)
				System.out.print(j + ", ");
			}
			System.out.println();
		}





		

	}

}
