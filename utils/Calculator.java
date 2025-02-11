package utils;

public class Calculator{
    private int currentValue;

    // Default Constructor
    public Calculator(){
        this.currentValue = 0;
    }

    // General Constructor
    public Calculator(int initial){
        this.currentValue = initial;
    }

    public int getCurrentValue(){
        return currentValue;
    }

    // Operations
    public void add(int val){
        this.currentValue += val;
    }

    public void sub(int val){
        this.currentValue -= val;
    }

    public void reset(){
        this.currentValue = 0;
    }

    public void reset(int val){
        this.currentValue = val;
    }

    public void print(){
        System.out.println("Hello world");
    }
}