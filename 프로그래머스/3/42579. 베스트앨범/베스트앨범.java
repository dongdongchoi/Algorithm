import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer>answer1 = new ArrayList<>();
        
        // 장르별 재생횟수 해시만들기
        HashMap<String, List<int[]>> ha = new HashMap<>();
        for(int i=0; i<genres.length;i++){
            List<int[]> pl = ha.getOrDefault(genres[i], new ArrayList<>());
            pl.add(new int[]{plays[i],i});
            ha.put(genres[i],pl);
        }
       
        
        // 해시 안에 있는 재생횟수 내림차수 만들기
       for(List<int[]>pl : ha.values()){
           Collections.sort(pl,(a,b) ->{
               if (a[0]==b[0]) return a[1]-b[1];
               return b[0]-a[0];
           });
       }
        
        
        // 장르별 총 재생횟수 
        HashMap<String, Integer> ha1 = new HashMap<>();
        for(int i=0; i<genres.length;i++){
            if(ha1.containsKey(genres[i])){
                ha1.put(genres[i],ha1.get(genres[i])+plays[i]);
            }
            else{
                ha1.put(genres[i],plays[i]);
            }
        }
       
        
        //가장 큰녀석 이름별로 List에 넣기
        
        List<Map.Entry<String, Integer>> el =  new ArrayList<>(ha1.entrySet());
        Collections.sort(el,new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2){
                return entry2.getValue() - entry1.getValue();
            }
        });
        
        List<String>li = new ArrayList<>();
        for(Map.Entry<String, Integer>e : el){
            li.add(e.getKey());
        }
        
       
        // 큰녀석에 해당하는 (정렬된)플레이횟수를 리스트에 차례로 넣기
        
        for(String genre : li){
            List<int[]> playsWithIndex = ha.get(genre);
            if(playsWithIndex != null && !playsWithIndex.isEmpty()){
                for(int i = 0; i < Math.min(playsWithIndex.size(), 2); i++){
                    answer1.add(playsWithIndex.get(i)[1]); // int[] 쌍에서 인덱스(두 번째 요소)만 추가
                }
            }
        }
        
        
        int[]answer = answer1.stream().mapToInt(Integer :: intValue).toArray();
        return answer;
    }
}