
public class UseHexaCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCalc calc=new HexaCalc();
		System.out.println(calc.add("ffff","78"));
		System.out.println(calc.subtract("00ff","45"));
		System.out.println(calc.multiply("12ff","12"));
		System.out.println(calc.divide("45ff","11"));
	}

}
