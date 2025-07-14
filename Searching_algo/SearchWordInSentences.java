package BridgeLabz_SIPP_Training.Searching_algo;

public class SearchWordInSentences {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is fun",
            "I love coding",
            "Linear search is simple"
        };
        String word = "coding";
        String result = "Not Found";

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                result = sentences[i];
                break;
            }
        }

        System.out.println(result);
    }
}





// public class SearchWordInSentences {
//     public static void main(String[] args) {
//         String[] sentences = {
//             "Java is fun",
//             "I love coding",
//             "Linear search is simple"
//         };
//         String word = "coding";
//         String result = "Not Found";

//         for (int i = 0; i < sentences.length; i++) {
//             String[] words = sentences[i].split("\\s+");
//             for (int j = 0; j < words.length; j++) {
//                 if (words[j].equals(word)) {
//                     result = sentences[i];
//                     break;
//                 }
//             }
//             if (!result.equals("Not Found"))
//                 break;
//         }

//         System.out.println(result);
//     }
// }
