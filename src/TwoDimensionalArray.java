
public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int row=3;
		int cols=4;
		
		int table[][]=new int[row][cols];
		
		table [0][0]=10;
		table [0][1]=11;
		table [0][2]=13;
		
		table [1][0]=20;
		table [1][1]=21;
		table [1][2]=23;
		
		table [2][0]=30;
		table [2][1]=31;
		table [2][2]=33;
		
		// to find the total array length of the row
		System.out.println(table.length);
		
		// to find the total array length of the col
		
		System.out.println(table[0].length);

		System.out.println(table[0][2]);
		
		for (int i=0;i<row;i++){
			
			for (int j=0;j<cols;j++){
				System.out.print(" "+table[i][j]);
			}
			
		System.out.println(" ");
			
		}
	}

}
