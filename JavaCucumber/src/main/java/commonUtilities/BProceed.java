package commonUtilities;


public class BProceed {


	public static boolean bProceedFlag = true;

	public static void setbProceedFlag(boolean value) throws Exception{

		bProceedFlag = value;
	}

	public static boolean getbProceedFlag() throws Exception{

		return (bProceedFlag)? true : false;
	}

	public static void checkStatus(String methodName) throws Exception{
		
		String methodResult = (getbProceedFlag())? methodName + ": PASS" : methodName + ": FAIL";
		System.out.println(methodResult);
	}
}
