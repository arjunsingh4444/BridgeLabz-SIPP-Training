package BridgeLabz_SIPP_Training.Searching_algo;

public class CompareBufferBuilder {
    public static void main(String[] args) {
        long t1 = System.nanoTime();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < 1000000; i++)
            sb1.append("hello");
        System.out.println("StringBuffer: " + (System.nanoTime() - t1) + " ns");

        long t2 = System.nanoTime();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 1000000; i++)
            sb2.append("hello");
        System.out.println("StringBuilder: " + (System.nanoTime() - t2) + " ns");
    }
}
