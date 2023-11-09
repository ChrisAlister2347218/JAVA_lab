public class StrBuffer{
    public static void main(String[] args) {
   
        StringBuffer stringBuffer = new StringBuffer("Christ, ");
    
        stringBuffer.append("Bangalore");
        System.out.println("\nAppend(): " + stringBuffer);

        stringBuffer.insert(7, "University ");
        System.out.println("\ninsert(): " + stringBuffer);

        stringBuffer.replace(7, 11, "Deemed");
        System.out.println("\nreplace(): " + stringBuffer);

        stringBuffer.delete(7, 20);
        System.out.println("\ndelete(): " + stringBuffer);

        char ch = stringBuffer.charAt(0);
        System.out.println("\nCharacter at index 0: " + ch);

        stringBuffer.setCharAt(0, 'C');
        System.out.println("\nsetCharAt(): " + stringBuffer);

        int length = stringBuffer.length();
        System.out.println("\nLength of the StringBuffer: " + length);

        int capacity = stringBuffer.capacity();
        System.out.println("\nCapacity of the StringBuffer: " + capacity);

        stringBuffer.ensureCapacity(50);
        System.out.println("\nCapacity after ensureCapacity(): " + stringBuffer.capacity());

        String str = stringBuffer.toString();
        System.out.println("\nString representation: " + str);

        String subStr1 = stringBuffer.substring(7);
        System.out.println("\nSubstring from index 7: " + subStr1);

        String subStr2 = stringBuffer.substring(0, 5);
        System.out.println("\nSubstring from index 0 to 5: " + subStr2);
    }
}
