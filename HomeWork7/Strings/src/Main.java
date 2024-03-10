public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" + ").append(b).append(" = ").append(a+b);
        StringBuilder str = new StringBuilder();
        str.append(a).append(" - ").append(b).append(" = ").append(a-b);
        StringBuilder sbb = new StringBuilder();
        sbb.append(a).append(" * ").append(b).append(" = ").append(a*b);
        sb.replace(7,8,"equals");
        str.replace(7,8,"equals");
        sbb.replace(7,8,"equals");
        System.out.println(sb);
        System.out.println(str);
        System.out.println(sbb);
    }
}
