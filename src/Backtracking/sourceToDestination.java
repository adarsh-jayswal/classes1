package Backtracking;



import java.util.ArrayList;
import java.util.List;

public class sourceToDestination {

    private static boolean isPossible(List<List<Integer>> grid, int x, int y, int n, boolean[][] visited) {
        if (x == n - 1 && y == n - 1 && grid.get(x).get(y) == 0) {
            return true;
        }
        if (x < 0 || y < 0 || x >= n || y >= n || grid.get(x).get(y) == 1 || visited[x][y]) {
            return false;
        }

        visited[x][y] = true;
        boolean right = isPossible(grid, x, y + 1, n, visited);
        boolean down = isPossible(grid, x + 1, y, n, visited);
        visited[x][y] = false;
        return right || down ;
    }

    public static void main(String[] args) {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(List.of(0, 0, 1, 0));
        grid.add(List.of(1, 0, 0, 0));
        grid.add(List.of(1, 1, 0, 1));
        grid.add(List.of(0, 0, 0, 0));

        int n = grid.size();
        boolean[][] visited = new boolean[n][n];

        boolean possible = isPossible(grid, 0, 0, n, visited);
        System.out.println("Path exists from source to destination: " + possible);
    }
}
