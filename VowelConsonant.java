class VowelConsonant
{
    public static void main(String args[])
    {
        String s="This is a really simple sentence";
        String s1=s.toLowerCase();
        s1=s.replace(" ", "");
        String s2="aeiou";
        int vowel=0;
        int consonant=0;
        char a[]=s1.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(s2.contains(Character.toString(s1.charAt(i)))==true)
             vowel=vowel+1;
             else
             consonant=consonant+1;

        }
        System.out.println("Vowel=>"+vowel+ " "+"Consonant=>"+consonant);

    }
}