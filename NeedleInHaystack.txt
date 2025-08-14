public class NeedleInHaystack {
    public static void main(String []args){
        String haystack="This is an example of needle haystack";
        String needle="needle";
        int index=haystack.indexOf(needle);
        if(index!=-1){
            System.out.println("Found'"+needle+"'at position:"+index);
        }else {
            System.out.println("'"+needle+"'not found");
        }
    }
}