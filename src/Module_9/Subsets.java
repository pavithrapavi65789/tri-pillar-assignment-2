package Module_9;

public class Subsets {
    static void subsets(String str, String curr, int index){
        if(index == str.length()){
            System.out.println(curr);
            return;
        }

        subsets(str, curr + str.charAt(index), index+1);
        subsets(str, curr, index+1);
    }

    public static void main(String[] args){
        subsets("ABC","",0);
    }
}
