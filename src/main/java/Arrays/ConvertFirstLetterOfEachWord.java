package Arrays;
class ConvertFirstLetterOfEachWord
{
    public static String transform(String s)
    {
        char[] arr = s.toCharArray();
        boolean foundSpace = true;
        for(int i= 0; i<arr.length; i++){
       
        // if there is a character
        if(Character.isLetter(arr[i])){
            if(foundSpace){
                arr[i] = Character.toUpperCase(arr[i]);
                foundSpace = false;
            }
        }
        else{
            // if there is a space
            foundSpace = true;
        }
        }
        // to convert array of character into string
        // str = String.valueOf(arr);
        return String.valueOf(arr);
        
    }
    
    public static void main(String[] arg) {
    	System.out.println(transform("hello kichha rudrapur"));
    }
}