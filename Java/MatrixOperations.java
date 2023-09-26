class MatrixOperations {
    int[][] matrix;
    int row, column;


public MatrixOperations(){
    matrix = new int [][] {{1,0,0},{1,1,0},{1,1,1}};
}
public MatrixOperations(int [][] matrix){
    this.matrix=matrix;
}
public MatrixOperations(int row , int column, int [][] matrix){
    this.row = row;
    this.column = column;
    this.matrix = matrix;

}
public int[][] getMatrix(){
    return this.matrix;


}
public int getRow(){
    return this.row;

}
public int getColumn(){
    return  this.column ;
}
public void setMatrix (int [][] matrix){
    this.matrix = matrix;}
}
public void setRow(int row){
    this.row = row; }
public void setColumn(int column){
        this.column = column;
    }
public MatrixOperations

}


