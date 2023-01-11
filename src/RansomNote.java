public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
//        if (ransomNote.length() > magazine.length()) return false;
//        int[] counter = new int[26];
//
//        for (char i : magazine.toCharArray())
//            counter[i - 'a']++;
//
//        for (char i : ransomNote.toCharArray()){
//            if (counter[i-'a']==0)return false;
//            counter[i-'a']--;
//    }return true;
//
//}
        StringBuilder newMagazine =new StringBuilder(magazine);
        StringBuilder newRansomNote =new StringBuilder(ransomNote);
        for (int i=0; i<ransomNote.length();i++){
            if (newMagazine.indexOf(ransomNote.substring(i,i+1))!=-1){
                newMagazine.deleteCharAt(newMagazine.indexOf(ransomNote.substring(i,i+1)));
                newRansomNote.deleteCharAt(newRansomNote.indexOf(ransomNote.substring(i,i+1)));
            }
        }
       return newRansomNote.length()==0;
    }



        public static void main(String[] args) {


    }
}

