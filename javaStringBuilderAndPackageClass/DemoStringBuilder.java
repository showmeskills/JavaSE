public class DemoStringBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder().append("100").append(200).append(true);
        String str = sb.toString();
        System.out.println(str);
        demo();
    }
    public static void demo(){
        int num = 100;
        String str = num +"";
        System.out.println(str+200);//100200

        String str2 = Integer.toString(num);
        System.out.println(str2+300);//100300

        String str3 = String.valueOf(num);
        System.out.println(str3+400);//100400

        String str4 = "1110000";
        int numStr4 = Integer.parseInt(str4);
        System.out.println(numStr4);

    }
}