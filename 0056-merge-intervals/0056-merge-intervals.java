class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparing(o->o[0]));
      ArrayList<int[]> arr = new ArrayList<>();
      if(intervals.length==1||intervals.length==0){
        return intervals;}
         int start = intervals[0][0];
        int end = intervals[0][1];

      for (int i = 1; i < intervals.length; i++) {

            if (end >= intervals[i][0]) {
                end = Math.max(end, intervals[i][1]);
            } 
            else {
                arr.add(new int[]{start, end});

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        arr.add(new int[]{start, end});

        return arr.toArray(new int[arr.size()][]);
              
        
      
    }
    }
