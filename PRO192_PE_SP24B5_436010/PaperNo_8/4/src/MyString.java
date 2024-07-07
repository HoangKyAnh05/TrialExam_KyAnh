
public class MyString implements IString {

    @Override
    public int f1(String str) {
        if(str == null || str.isEmpty()){
            return 0;
        }
        String[] words = str.split("\\s+");
        int count = 0;
        for (String word : words){
            if(word.matches(".*[a-zA=Z].*")){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
       if(str == null || str.isEmpty()){
            return str;
    }
       String[] words = str.split("\\s+");
        if(words.length == 0){
            return str;
        }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length - 1; i++){
        sb.append(words[i]);
        if (i < words.length - 2){
            sb.append(" ");
            }
        }
        return sb.toString();
    }
    
}
