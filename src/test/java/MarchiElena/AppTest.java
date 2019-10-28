package MarchiElena;


import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    /*
    private static void testing(String s, String expect) {
        System.out.println("Testing: " + s);
        String actual = App.hist(s);
        System.out.println("Actual\n" + actual);
        System.out.println("Expect\n" + expect);
        System.out.println("-");
        assertEquals(expect, actual);
    }
    */
    @Test
    public void Test1() {
        /*
        testing("tpwaemuqxdmwqbqrjbeosjnejqorxdozsxnrgpgqkeihqwybzyymqeazfkyiucesxwutgszbenzvgxibxrlvmzihcb",
                "u  3     ***\rw  4     ****\rx  6     ******\rz  6     ******");
        testing("aaifzlnderpeurcuqjqeywdq", "u  2     **\rw  1     *\rz  1     *");
        testing("sjeneccyhrcpfvpujfaoaykqllteovskclebmzjeqepilxygdmzvdfmxbqdzubkzturnuqxsewrwgmdfwgdx",
                "u  4     ****\rw  3     ***\rx  4     ****\rz  4     ****");
        testing("bnxyytdtqrkeaswymiwbxnuydwthweyzny", "u  1     *\rw  4     ****\rx  2     **\rz  1     *");
        testing("ttopvdaxgwfpzjmomkwssytktaizqtsekfmfhrabidwaugioqyyzrxbugsusxkfdevmijqyprcoxfyjqwsutoutjgozyhsoytg",
                "u  5     *****\rw  4     ****\rx  4     ****\rz  4     ****");
        */
        assertEquals("u  3     ***\rw  4     ****\rx  6     ******\rz  6     ******", App.hist("tpwaemuqxdmwqbqrjbeosjnejqorxdozsxnrgpgqkeihqwybzyymqeazfkyiucesxwutgszbenzvgxibxrlvmzihcb"));
    }

    @Test
    public void Test2(){
        assertEquals("u  2     **\rw  1     *\rz  1     *", App.hist("aaifzlnderpeurcuqjqeywdq"));
    }

    @Test
    public void Test3(){
        assertEquals("u  4     ****\rw  3     ***\rx  4     ****\rz  4     ****", App.hist("sjeneccyhrcpfvpujfaoaykqllteovskclebmzjeqepilxygdmzvdfmxbqdzubkzturnuqxsewrwgmdfwgdx"));
    }

    @Test
    public void Test4(){
        assertEquals("u  1     *\rw  4     ****\rx  2     **\rz  1     *", App.hist("bnxyytdtqrkeaswymiwbxnuydwthweyzny"));
    }

    @Test
    public void Test5(){
        assertEquals("u  5     *****\rw  4     ****\rx  4     ****\rz  4     ****", App.hist("ttopvdaxgwfpzjmomkwssytktaizqtsekfmfhrabidwaugioqyyzrxbugsusxkfdevmijqyprcoxfyjqwsutoutjgozyhsoytg"));
    }
}
