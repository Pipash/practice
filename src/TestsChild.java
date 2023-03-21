public class TestsChild extends Tests{
    /*public String str() {
        return new String[]{"Dog","Cat", "Wolf"}[1];
    }*/

    static {
        System.out.println("Ch static");
    }

    public TestsChild() {
        System.out.println("ch constructor");
    }
}
