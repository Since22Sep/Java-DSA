public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Dipanshu";
        char target = 'p';
        System.out.println(search(name,target));
    }

    // these are static method so you can call it directly from main without creating an object
    static boolean search(String str, char target){
        if(str.length() == 0) return false;
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)) return true;
        }
        return false;
    }

    static boolean search2(String str,char target){
        if(str.length() == 0) return false;
        // converts the string into char array
        for(char ch: str.toCharArray()){
            if(ch == target) return true;
        }
        return false;
    }
}
