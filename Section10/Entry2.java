package Section10;

public class Entry2{
    public static void main(String[] args) {
        int data = 0x11223344;
        System.out.printf("%d\n",data);
        System.out.printf("%08x\n",data & 0xffff0000);
    }
}
