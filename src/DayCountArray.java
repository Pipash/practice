import java.util.Arrays;

public class DayCountArray {
    public Integer numberOfDays (int[][] arr) {
        int days = 0;
        if(arr.length == 0) {
            return 0;
        }
        //System.out.println(Arrays.toString(arr));

        int numberOfRows = arr.length;
        int numberOfColumns = arr[0].length;
        int n = numberOfRows * numberOfColumns;
        //System.out.println(n);
        int[][] newArr = new int[numberOfRows][numberOfColumns];
        boolean found = true;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                newArr[i][j] = arr[i][j];
                if (arr[i][j] == 0) {
                    found = false;
                }

                //System.out.print(i+" "+j);
                //System.out.print(arr[i][j]+" ");
            }
            //System.out.println('\n');
        }

        while (!found) {
            days++;
            found = true;
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    if (arr[i][j] == 1) {
                        if (i -1 >= 0) {
                            newArr[i-1][j] = 1;
                        }
                        if (i+1 < numberOfRows) {
                            newArr[i+1][j] = 1;
                        }
                        if (j-1 >= 0) {
                            newArr[i][j-1] = 1;
                        }
                        if (j+1 < numberOfColumns) {
                            newArr[i][j+1] = 1;
                        }
                    }
                }
            }

            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    if (newArr[i][j] == 0) {
                        found = false;
                    }
                    arr[i][j] = newArr[i][j];
                }
            }
        }


        return days;
    }
}
