package tests;

import com.ludus.AsciiLogos;

public class ASCIILogosTest {
    public static void main(String[] args) {
        for(AsciiLogos logo : AsciiLogos.values()){
            System.out.println(logo.getVal());
        }
    }
}
