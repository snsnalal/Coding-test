# Coding-test
[소수인지 판별](./1.java) <br><br>
[DFS](./dfs.java) : 깊이 우선 탐색, 최대한 멀리있는 노드부터 탐색 <br>

[BFS](./bfs.java) : 너비 우선 탐색, 바로 가까이 있는 노드부터 탐색<br>

[선택 정렬](./Select_sort.java) : 매번 가장 작은 것을 선택, 시간복잡도 : O(N<sup>2</sup>)<br>

[삽입 정렬](./Insert_sort.java) : 가장 느린 편, 데이터가 정렬되어 있는 상태라면 매우 빠르다.적절한 위치에 데이터를 삽입<br> 첫 번째 데이터는 정렬되어 있다고 판단, 시간복잡도 : O(N<sup>2</sup>) 최선의 경우 시간복잡도 : O(N)

[퀵 정렬](./Quick_sort.java) : 기준(피벗)을 설정한 후 큰 수와 작은 수를 교환하고 리스트를 반으로 나눈다. 데이터가 무작위로 되어있을 경우 매우 빠르다. 평균 시간복잡도 : O(NlogN) 최악의 시간복잡도 : O(N<sup>2</sup>)

[계수 정렬](./Count_sort.java) : 데이터의 크기 범위가 제한되어 정수 형태로 표한할 수 있을 때만 사용할 수 있다. 시간복잡도 : O(N + K) (N : 개수, K : 최댓값)

[이진 탐색](./Binary_search.java) : 찾으려는 데이터와 중간점 위치에 있는 데이터를 반복적으로 비교하여 원하는 데이터를 찾는다. 시간복잡도 : O(logN)

[다이나믹 프로그래밍 Top_Down](./Dinamic_ttb.java) : 큰 문제를 작게 나누고, 같은 문제라면 한 번씩만 풀어 문제를 해결하는 방식. 시간복잡도 : O(N) <br>
[다이나믹 프로그래밍 Bottom_Up](./Dinamic_btt.java) : 반복문을 이용, 작은 문제부터 차근차근 답을 도출한다. 시간복잡도 : O(N)

[다익스트라 알고리즘](./Dijkstra.java) : 우선순위 큐를 사용, 한 지점에서 다른 특정 지점까지의 최단 경로 방문하지 않은 노드 중 최단거리가 가장 짧은 노드를 선택. 시간복잡도 : O(ElogV) (E : 원소 개수, V : 노드 개수)
