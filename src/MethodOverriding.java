// class SuperClass {

//   public void method(int a) {
//     System.out.println("Value Of a=" + a);
//   }
// }

// class SubClass extends SuperClass {

//   @Override //Method Overriding
//   public void method(int a) {
//     System.out.println("Value Of a=" + a);
//   }
//   // public void method(int a, int b) {}   Method Overloading
// }

// public class MethodOverriding {

//   public static void main(String[] args) {}
// }

// --------------------------------------------------------------------------
class Bank {

  protected String bankName;
  protected String address;
  protected int pinCode;

  Bank() {}

  Bank(String bankName, String address, int pinCode) {
    this.bankName = bankName;
    this.address = address;
    this.pinCode = pinCode;
  }

  public float getRateOfInterest() {
    return 0f;
  }
}

class HDFC extends Bank {

  HDFC(String bankName, String address, int pinCode) {
    super(bankName, address, pinCode);
  }

  public float getRateOfInterest() {
    return 7.5f;
  }
}

class man {

  public static void main(String[] args) {
    HDFC h = new HDFC("HDFC", "MALLEPALLY", 500028);
    System.out.println(h.bankName + "\t" + h.address + "\t" + h.pinCode);
    System.out.println(h.getRateOfInterest());
  }
}
