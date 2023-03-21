public class Tests {
    /*public String str(){
        return new String[]{"Dog", "Cat", "Wolf"}[2];
    }

    public String str2(){
        return new String[]{"Dog", "Cat", "Wolf"}[2];
    }*/
    static {
        System.out.println("p static");
    }

    public Tests() {
        System.out.println("p constructor");
    }

    public Tests(int a1, String b1) {
        this.a=a1;
        this.b=b1;
    }



    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    private int a;
    private String b;
}


