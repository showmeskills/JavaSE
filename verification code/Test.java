public class Test {
    public static void main(String[] args){
        VerificationCode verificationCode = new VerificationCode();
        String code = verificationCode.getCode();
        verificationCode.typeCode(code);
        
    }
}
