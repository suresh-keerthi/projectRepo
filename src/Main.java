public class Main {
    public static void main(String[] args) {


        Rock myRock = new Rock();
        String name = String.valueOf(myRock);

        int[] IntArr = {98, 99, 100};

        System.out.println(name);
        String OtherName = myRock.toString();

        System.out.println(OtherName);


        //character extraction methods


        char[] CharArr = new char[5];
        name.getChars(0, 3, CharArr, 1);
        for (int i = 0; i < 5; i++) {
            System.out.print(CharArr[i]);
        }
        System.out.println();


        byte[] ByteArr = name.getBytes();
        //name.getBytes(0,5,ByteArr,1);   deprecated
        for (int i = 0; i < name.length(); i++) {
            System.out.print(ByteArr[i] + " ");
        }


        CharArr = name.toCharArray();
        System.out.println();
        for (int i = 0; i < name.length(); i++) {
            System.out.print(CharArr[i]);
        }
        System.out.println();

        //comparison methods

        boolean equality = name.equals(OtherName);
        System.out.println(equality);

        String aName = "Suresh";
        String bName = "suREeh";
        equality = aName.equalsIgnoreCase(bName);
        System.out.println(equality);

        equality = aName.regionMatches(0, bName, 0, 3);
        System.out.println(equality);

        equality = aName.regionMatches(true, 0, bName, 0, 3);
        System.out.println(equality);

        equality = "suresh".startsWith("sure");
        System.out.println(equality);

        equality = "suresh".startsWith("ure", 1);
        System.out.println(equality);

        equality = "suresh".endsWith("Esh");
        System.out.println(equality);

        int strCaseCompare="suresh".compareTo("Suresh");
        System.out.println(strCaseCompare);

        int strCompare="suresh".compareToIgnoreCase("Suresh");
        System.out.println(strCompare);



        //initializing  using overloaded constructors

        String hInitial = new String("suresh");
        System.out.println(hInitial);

        hInitial = new String(CharArr);
        System.out.println(hInitial);

        hInitial = new String(CharArr, 0, 3);
        System.out.println(hInitial);

        hInitial = new String(ByteArr);
        System.out.println(hInitial);

        hInitial = new String(ByteArr, 0, 3);
        System.out.println(hInitial);

        hInitial = new String(name);
        System.out.println(hInitial);

        hInitial = new String(IntArr, 0, 3);
        System.out.println(hInitial);


        //searching methods
        int position;

        position="suresh".indexOf('s');
        System.out.println(position);

        position="suresh".indexOf('s',1);
        System.out.println(position);

        position="suresh".indexOf("res");
        System.out.println(position);

        position="essuresh".indexOf("es",1);
        System.out.println(position);

        //modifying a string
        String newString="suresh keerthi".substring(7);
        System.out.println(newString);

        newString="suresh keerhti".substring(0,6);
        System.out.println(newString);

        newString="     suresh  ".trim();
        System.out.println(newString);

        newString="     suresh  ".strip();
        System.out.println(newString);













    }
}

class Rock {

    public String toString() {
        return "Rock you";
    }

    public String toString(String give) {
        return give;
    }


}