import java.util.function.Function;

class OTP {

  public static void main(String[] args) {
    Function<Integer, Integer> otp =
      digits -> (int) (Math.random() * Math.pow(10, digits));

    System.out.println(otp.apply(4));
  }
}
