//프로그래머스 레벨 1
//로직 : 중복 제거 후 map에 저장 -> split을 이용해서 신고자와 피신고자를 분류 -> 신고된 횟수를 카운트 -> 신고된 횟수가 k를 넘어가면 신고자 알람 수 1증가 -> 알람 수 리턴
//그리드 

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // key: 신고당한놈, value: 몇명한테 당했는지
        Map<String, Set<String>> map = new HashMap<>();

        for (String rep : report) {
            String[] arr = rep.split(" ");
            Set<String> set = map.getOrDefault(arr[1], new HashSet<>());
            set.add(arr[0]);
            map.put(arr[1], set);
        }

        // key: 알림받을 놈, value: 몇번 알림받을지
        Map<String, Integer> countMap = new LinkedHashMap<>();

        for (String id : id_list) {
            countMap.put(id, 0);
        }

        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().size() >= k) { // 정지당할놈
                for (String value : entry.getValue()) {
                    countMap.put(value, countMap.getOrDefault(value, 0) + 1);
                }
            }
        }

        return countMap.values().stream().mapToInt(Integer::intValue).toArray();
    }
}
