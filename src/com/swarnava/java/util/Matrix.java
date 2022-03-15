package com.swarnava.java.util;

public class Matrix {
    private Number[][] matrixData;
    private int rowSize;
    private int colSize;

    public Matrix(Number[][] matrixData) {
        rowSize = matrixData.length;
        colSize = matrixData[0].length;
        this.matrixData = matrixData;
    }

    public Matrix(int rowSize, int colSize) {
        this.rowSize = rowSize;
        this.colSize = colSize;
        matrixData = new Number[rowSize][colSize];
    }

    public Number[][] getMatrix() {
        return matrixData;
    }

    public int getRowSize() {
        return rowSize;
    }

    public int getColSize() {
        return colSize;
    }

    public Number getMatrixValue(int row, int col){
        return this.matrixData[row][col];
    }

    public void setMatrixValue(int row, int col, Number value){
        this.matrixData[row][col] = value.doubleValue();
    }
    
    public Matrix add(Matrix a, Matrix b){
        Double value;
        Matrix result = new Matrix(a.getRowSize(), a.getColSize());
        for (int rowIteration = 0; rowIteration < a.getRowSize(); rowIteration++) {
            for (int colIteration = 0; colIteration < a.getColSize(); colIteration++) {
                value = a.getMatrixValue(rowIteration, colIteration).doubleValue() + b.getMatrixValue(rowIteration, colIteration).doubleValue();
                result.setMatrixValue(rowIteration, colIteration, value);
            }
        }
        this.matrixData = result.matrixData;
        return result;
    }
    
}
