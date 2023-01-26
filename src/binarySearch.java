import java.util.Arrays;

public class binarySearch {
    public boolean isUnique(String s){
        if(s.length() > 128)
            return false;

        boolean arr[] = new boolean[128];
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i);
            if(arr[val]) {
                return false;
            }
            arr[val] = true;
        }
        return true;
    }
    public boolean isUnique2(String s){
        char set[] = s.toCharArray();
        Arrays.sort(set);
        System.out.println(set);
        for(int i=0;i<s.length()-1;i++){
            if(set[i] == set[i+1])
                return false;
        }
        return true;
    }
}
