import java.sql.Array;

public class Solution {
    public String convert(String s, int numRows) {
        int length = s.length();
        int columns = 0;
        while (length > 0) {
            length -= numRows;
            length -= numRows - 2;
            columns += 1 + (numRows - 2);
        }

        String[][] array = new String[columns][numRows];
        System.out.println(columns);
        //System.out.println("The array dimensions are " + s.length() % numRows + s.length() / numRows + " " + numRows);
        return "";
    }
}
