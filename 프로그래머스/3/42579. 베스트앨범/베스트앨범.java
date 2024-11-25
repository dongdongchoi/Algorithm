import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genrePlayCount = new HashMap<>();
        HashMap<String, List<int[]>> genreSongs = new HashMap<>();
        
        // 장르별 총 재생 수 계산 및 곡 정보 저장
        for (int i = 0; i < genres.length; i++) {
            genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);
            genreSongs.putIfAbsent(genres[i], new ArrayList<>());
            genreSongs.get(genres[i]).add(new int[]{i, plays[i]}); // {곡 인덱스, 재생 수}
        }
        
        // 장르별 재생 수를 기준으로 정렬
        List<Map.Entry<String, Integer>> sortedGenres = new ArrayList<>(genrePlayCount.entrySet());
        sortedGenres.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        List<Integer> answerList = new ArrayList<>();
        
        // 각 장르에서 가장 많이 재생된 곡 2개 선택
        for (Map.Entry<String, Integer> entry : sortedGenres) {
            String genre = entry.getKey();
            List<int[]> songs = genreSongs.get(genre);
            songs.sort((a, b) -> b[1] - a[1]); // 재생 수 기준으로 정렬
            
            // 최대 2개 곡 추가
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                answerList.add(songs.get(i)[0]); // 곡 인덱스 추가
            }
        }
        
        // List를 int[]로 변환
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}