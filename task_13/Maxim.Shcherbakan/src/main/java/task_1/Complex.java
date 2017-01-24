package task_1;

public class Complex {

  private int varX;
  private int varY;

  public Complex() {
    this.varX = 0;
    this.varY = 0;
  }

  public Complex(int varX, int varY) {
    this.varX = varX;
    this.varY = varY;
  }

  public void additional(Complex number){
    this.varX += number.varX;
    this.varY += number.varY;
  }

  public void subtraction(Complex number){
    this.varX -= number.varX;
    this.varY -= number.varY;
  }

  public void multiplication(Complex number){
    int countX = this.varX * number.varX;
    int countXi = this.varX * number.varY;
    int countY = this.varY * (- number.varY);
    int countYi = this.varY * number.varX;
    this.varX = countX + countY;
    this.varY = countXi + countYi;
  }
  public void division(Complex number){

  }

  public String toString(){
    return this.varX + " + " + this.varY + "i";
  }
}