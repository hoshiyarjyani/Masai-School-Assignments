import java.util.*;

class Main {
    public static void myFun(int row, int col, int[][] arr) {
        Map<Integer, List<int[]>> obj = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int color = arr[i][j];
                if (!obj.containsKey(color)) {
                    obj.put(color, new ArrayList<int[]>());
                }
                obj.get(color).add(new int[] { i + 1, j + 1 });
            }
        }
        int sum = 0;

        for (Map.Entry<Integer, List<int[]>> entry : obj.entrySet()) {
            List<int[]> coords = entry.getValue();
            for (int i = 0; i < coords.size(); i++) {
                for (int j = i + 1; j < coords.size(); j++) {
                    int[] coord1 = coords.get(i);
                    int[] coord2 = coords.get(j);
                    sum += Math.abs(coord1[0] - coord2[0]) + Math.abs(coord1[1] - coord2[1]);
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().trim().split(" ");
        int row = Integer.parseInt(firstLine[0]);
        int col = Integer.parseInt(firstLine[1]);
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            String[] line = scanner.nextLine().trim().split(" ");
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
        myFun(row, col, arr);
    }
}
