package twodarray;

public class Spiralanticlockwise {
public static void main (String[]args ) {
	int [][] arr  = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	int top = 0 , bottom = arr.length-1;
	int left = 0, right = arr.length -1;
	int dir = 0;
	while(top<=bottom && left<=right) {
		if(dir==0) {
			for(int i = top; i<=bottom;i++) {
				System.out.print(arr[i][left]+" ");
				
			}
			left++;
			
		}
		else if(dir==1) {
			for(int i = bottom;i>=top;i--) {
				System.out.print(arr[bottom][i]+ " ");
			}
			bottom--;
		}
		else if(dir==2) {
			for(int i = bottom;i>=top;i--) {
				System.out.print(arr[i][right]+ " ");
			}
			right--;
		}
		else if(dir==3) {
			for(int i = right;i>=left;i--) {
				System.out.print(arr[top][i]+ " ");
			}
			top++;
		}
		dir=(dir+1)%4;
	}
}
}
