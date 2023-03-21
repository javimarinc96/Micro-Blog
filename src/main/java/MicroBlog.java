class MicroBlog {
    public String truncate(String input) {
        if(input.codePointCount(0,input.length()) > 5){
            int[] array = input.codePoints().limit(5).toArray();
            return new String(array,0,array.length);
        }
        return input;
    }
}
