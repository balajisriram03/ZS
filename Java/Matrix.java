import java.util.*;
public class Matrix{
    int [][]matrix;
    int row,column;
    public Matrix(){
        row=3;
        column=3;
        matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }
    public Matrix(int row,int column,int[][] matrix){
        this.row=row;
        this.column=column;
        this.matrix=matrix;
    }
    public String toString(){
        String matrixstr = "";
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrixstr += matrix[i][j] + " ";
            }
            matrixstr = matrixstr.trim() + "\n"; 
        }
        return matrixstr;
    }
    public Matrix addition(Matrix m){
        int[][] arr=new int[m.row][m.column];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=this.matrix[i][j]+m.matrix[i][j];
            }
        }
        return new Matrix(row, column, arr);

    }
    public Matrix subtraction(Matrix m){
        int[][] arr=new int[m.row][m.column];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=this.matrix[i][j]-m.matrix[i][j];
            }
        }
        return new Matrix(row, column, arr);

    }
    public Matrix multiplication(Matrix m){
        int[][] arr = new int[m.row][m.column];
        int val;
        int[] t;
        for(int i=0;i<arr.length;i++){
            t=new int[arr.length];
            for(int j=0;j<arr[i].length;j++){
                val=0;
                for(int k=0;k<arr[i].length;k++){
                    val=val+this.matrix[i][k]*m.matrix[k][j];
                    if (k==arr.length-1){
                        t[j]=val;
                    }
                }
           }
           arr[i]=t;
        }
        return new Matrix(row, column, arr);

    }
    public boolean isSquareMatrix(){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i].length!=matrix.length){
                return false;
            }
        }
        return true;
    }
    public boolean isIdentityMatrix(){
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if(i==j && matrix[i][j]!=1){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isUpperTriangularMatrix(){
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if(i>j && matrix[i][j]!=0){
                    return false;
                }
                else if(i<=j && matrix[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isLowerTriangularMatrix(){
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if(i<j && matrix[i][j]!=0){
                    return false;
                }
                else if(i>=j && matrix[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
}   
class Main {
    public static void main(String[] args){
        Matrix mat1=new Matrix(3,3,new int[][]{{1,2,3},{4,5,6},{7,8,9}} );
        Matrix mat2=new Matrix(3,3,new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        System.out.println("Addition\n"+mat1.addition(mat2));
        System.out.println("Subtraction\n"+mat1.subtraction(mat2));
        System.out.println("Multiplication\n"+mat1.multiplication(mat2));
        System.out.println("Square Matrix = "+mat1.isSquareMatrix());
        System.out.println("Identity Matrix = "+mat1.isIdentityMatrix());
        System.out.println("Upper Triangular Matrix = "+mat1.isUpperTriangularMatrix());
        System.out.println("Lower Triangular Matrix = "+mat1.isLowerTriangularMatrix());
    }
}
