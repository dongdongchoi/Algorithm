import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        // int[]answer = {};
        HashMap<String, Integer> totgen = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> eacpl = new HashMap<>();
        
        for(int i =0; i< genres.length;i++){
            if(totgen.containsKey(genres[i])){
                totgen.put(genres[i],totgen.get(genres[i])+plays[i]);
            }
            else{
                totgen.put(genres[i],plays[i]);
            }
        }
        
        for(int i =0; i<genres.length;i++){
            HashMap<Integer,Integer>ha = new HashMap<>();
            if(eacpl.containsKey(genres[i])){
                eacpl.get(genres[i]).put(i,plays[i]);
            }
            else{
                ha.put(i,plays[i]);
                eacpl.put(genres[i], ha);
            }
        }
        
        System.out.println(totgen);
        System.out.println(eacpl);
        
        List<String> gen = new ArrayList<>(totgen.keySet());
        Collections.sort(gen,(s1,s2) -> totgen.get(s2) - totgen.get(s1));    
        
        for(String str : gen){
            HashMap<Integer, Integer> ha2 = eacpl.get(str);
            List<Integer> li = new ArrayList<>(ha2.keySet());
            Collections.sort(li,(s1,s2) -> ha2.get(s2) - ha2.get(s1));
            
            answer.add(li.get(0));
            if(li.size() > 1)
                answer.add(li.get(1));
            
        }
        
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}