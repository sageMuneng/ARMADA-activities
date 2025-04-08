public class test_buffer{
    public static void main(String[] args) {
        int iterations = 100000;
        String word = "Java";

        // Using String
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += word;
        }
        long endTime = System.nanoTime();
        long stringTime = (endTime - startTime) / 1000000;
        System.out.println("Appending " + iterations + " times using String took: " + stringTime + "ms");

        // Using StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(word);
        }
        endTime = System.nanoTime();
        long stringBuilderTime = (endTime - startTime) / 1000000;
        System.out.println("Appending " + iterations + " times using StringBuilder took: " + stringBuilderTime + "ms");

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(word);
        }
        endTime = System.nanoTime();
        long stringBufferTime = (endTime - startTime) / 1000000;
        System.out.println("Appending " + iterations + " times using StringBuffer took: " + stringBufferTime + "ms");

        // Determine the fastest method
        if (stringTime < stringBuilderTime && stringTime < stringBufferTime) {
            System.out.println("Fastest method: String");
        } else if (stringBuilderTime < stringTime && stringBuilderTime < stringBufferTime) {
            System.out.println("Fastest method: StringBuilder");
        } else {
            System.out.println("Fastest method: StringBuffer");
        }
    }
}