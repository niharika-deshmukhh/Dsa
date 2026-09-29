class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character>map=new HashMap();
        String arr[]=s.split(" ");
        if (pattern.length() != arr.length) {
    return false;
}
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i]) && !map.containsValue(pattern.charAt(i))){
                map.put(arr[i],pattern.charAt(i));
            }
            else{
              if(!map.containsKey(arr[i])||map.get(arr[i])!=pattern.charAt(i)){
                return false;
              }
            }
        }return true;
        
    }
}