import utils.Calculator;

class Main{
    public static void main(String[] args){
        Calculator calc = new Calculator();

        calc.add(5);
        System.out.println(calc.getCurrentValue());
        calc.sub(2);
        System.out.println(calc.getCurrentValue());
    }
}