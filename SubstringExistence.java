public class SubstringExistence {
    public boolean isSubstringPresent(String s) {
        char[] inp = s.toCharArray();

        int i = 0;
        int j = s.length()-1;

        while(i<j){
            char ch = inp[i];
            inp[i] = inp[j];
            inp[j] = ch;
            i++;
            j--;
        }
        String reverse = new String(inp);

        for(int p=0; p<s.length()-1; p++){
            String a = "" + s.charAt(p) + s.charAt(p+1);
            if(reverse.contains(a)){
                return true;
            }
        }
        return false;
    }
}
