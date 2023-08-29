import java.util.Scanner;

class Matrix{
	Scanner obj = new Scanner(System.in);
	int rows,columns;
	int arr[][];
	
	Matrix(){
		this.rows=3;
		this.columns=3;
		arr= new int[rows][columns];
	}
	
	
	void get_data() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=obj.nextInt();
			}
		}
	}
	
	void display() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
	}
	
	void add(Matrix m) {
		Matrix m3= new Matrix();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				m3.arr[i][j]=arr[i][j] + m.arr[i][j];
			}
		}
		System.out.println("New matrix after addition: ");
		m3.display();
	}
	
	void sub(Matrix m) {
		Matrix m3= new Matrix();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				m3.arr[i][j]=arr[i][j] - m.arr[i][j];
			}
		}
		System.out.println("New matrix after Subtraction: ");
		m3.display();
	}
	
	void mul(Matrix m) {
		Matrix m3= new Matrix();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<m.columns;j++) {
				for(int k=0;k<columns;k++) {
					m3.arr[i][j]+=arr[i][k] * m.arr[k][j];
				}
			}
		}
		System.out.println("New matrix after Multiplication: ");
		m3.display();
	}
	
}
public class exp6 {
	public static void main(String[] args) {
		Matrix m1 = new Matrix();
		Matrix m2 = new Matrix();
		
		System.out.println("Enter the values for first array: ");
		m1.get_data();
		
		System.out.println("Enter the values for second array: ");
		m2.get_data();
		
		System.out.println("First array: ");
		m1.display();
		
		System.out.println("Second array: ");
		m2.display();
		
		m1.add(m2);
		m1.sub(m2);
		m1.mul(m2);

	}
}
