package Lecture37Graph1;

public class AssignmentCodingNinjasHM24 {
	
	boolean solve(Character[][] characters, int x, int y, String s, boolean[][] visited) {
		if (s.length() == 0)
			return true;
		if (x - 1 >= 0 && y - 1 >= 0 && characters[x - 1][y - 1] == s.charAt(0) && !visited[x - 1][y - 1]) {
			visited[x - 1][y - 1] = true;
			if (solve(characters, x - 1, y - 1, s.substring(1), visited))
				return true;
			visited[x - 1][y - 1] = false;
		}
		if (y - 1 >= 0 && characters[x][y - 1] == s.charAt(0) && !visited[x][y - 1]) {
			visited[x][y - 1] = true;
			if (solve(characters, x, y - 1, s.substring(1), visited))
				return true;
			visited[x][y - 1] = false;
		}
		if (x - 1 >= 0 && characters[x - 1][y] == s.charAt(0) && !visited[x - 1][y]) {
			visited[x - 1][y] = true;
			if (solve(characters, x - 1, y, s.substring(1), visited))
				return true;
			visited[x - 1][y] = false;
		}
		if (x - 1 >= 0 && y + 1 < characters[0].length && characters[x - 1][y + 1] == s.charAt(0)
				&& !visited[x - 1][y + 1]) {
			visited[x - 1][y + 1] = true;
			if (solve(characters, x - 1, y + 1, s.substring(1), visited))
				return true;
			visited[x - 1][y + 1] = false;
		}
		if (y - 1 >= 0 && x + 1 < characters.length && characters[x + 1][y - 1] == s.charAt(0)
				&& !visited[x + 1][y - 1]) {
			visited[x + 1][y - 1] = true;
			if (solve(characters, x + 1, y - 1, s.substring(1), visited))
				return true;
			visited[x + 1][y - 1] = false;
		}
		if (x + 1 < characters.length && y + 1 < characters[0].length && characters[x + 1][y + 1] == s.charAt(0)
				&& !visited[x + 1][y + 1]) {
			visited[x + 1][y + 1] = true;
			if (solve(characters, x + 1, y + 1, s.substring(1), visited))
				return true;
			visited[x + 1][y + 1] = false;
		}
		if (x + 1 < characters.length && characters[x + 1][y] == s.charAt(0) && !visited[x + 1][y]) {
			visited[x + 1][y] = true;
			if (solve(characters, x + 1, y, s.substring(1), visited))
				return true;
			visited[x + 1][y] = false;
		}
		if (y + 1 < characters[0].length && characters[x][y + 1] == s.charAt(0) && !visited[x][y + 1]) {
			visited[x][y + 1] = true;
			if (solve(characters, x, y + 1, s.substring(1), visited))
				return true;
			visited[x][y + 1] = false;
		}
		return false;
	}

	int solve(String[] Graph, int N, int M) {
		Character[][] characters = new Character[N][M];
		int x = -1, y = -1;
		boolean[][] visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				characters[i][j] = Graph[i].charAt(j);
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (characters[i][j] == 'C') {
					x = i;
					y = j;
					visited[i][j] = true;
					if (solve(characters, x, y, "ODINGNINJA", visited))
						return 1;
					visited[i][j] = false;
				}
			}
		}
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
