public class StrMethod{
    public static void main(String[] args) {
        String text = "We realizes that while our workers were thriving, the " +
                "surrounding villages were still suffering. It became our goal to uplift their " +
                "quality of life as well. I remember seeing a family of 4 on a motorbike in the " +
                "heavy Bombay rain — I knew I wanted to do more for these families who were " +
                "risking their lives for lack of an alternative. The alternative mentioned here " +
                "is the Tata Nano, which soon after came as the world’s cheapest car on retail " +
                "at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a " +
                "recent post by Humans of Bombay which formed the basis of his decision to come " +
                "up with a car like Tata Nano.";

        System.out.println("charAt(10): " + text.charAt(10));
        System.out.println("\ncompareTo(\"Tata Nano\"): " + text.compareTo("Tata Nano"));
	System.out.println("\nconcat(\" - Support the villages.\"): " + text.concat(" - Support the villages."));
        System.out.println("                                         ");
	System.out.println("\ncontains(\"Tata Nano\"): " + text.contains("Tata Nano"));
        System.out.println("\nendsWith(\"alternative.\"): " + text.endsWith("alternative."));
        System.out.println("\nequals(\"Tata Nano\"): " + text.equals("Tata Nano"));
        System.out.println("\nequalsIgnoreCase(\"we realizes\"): " + text.equalsIgnoreCase("we realizes"));
        System.out.println("\nindexOf(\"family\"): " + text.indexOf("family"));
        System.out.println("\nisEmpty(): " + text.isEmpty());
        String[] words = text.split(" ");
        System.out.println("\nsplit(): " + String.join(", ", words));
        System.out.println("\nlastIndexOf(\"the\"): " + text.lastIndexOf("the"));
        System.out.println("\nlength(): " + text.length());
        System.out.println("\nreplace(\"thriving\", \"struggling\"): " + text.replace("thriving", "struggling"));
        System.out.println("\nstartsWith(\"We realizes\"): " + text.startsWith("We realizes"));
        System.out.println("\nsubstring(20, 50): " + text.substring(20, 50));
        System.out.println("\ntoLowerCase(): " + text.toLowerCase());
        System.out.println("\ntoUpperCase(): " + text.toUpperCase());
        System.out.println("\ntrim(): " + text.trim());
        System.out.println("\nvalueOf(123): " + String.valueOf(123));
    }
}
