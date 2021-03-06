package programmers_stack_queue;
import java.util.*;
public class prgmers_42583 {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<int[]> bridge = new LinkedList<>(); // 다리에 올라가있는 트럭들을 저장할 큐
        int idx = 0;
        int wSum = 0; // 다리에 올라져있는 트럭들 무게 합
        while(idx < truck_weights.length) { // 대기중인 트럭이 모두 다리에 올라갈 때 까지
        	if(wSum + truck_weights[idx] <= weight) { // 다리의 무게가 버틸 수 있다면
        		wSum += truck_weights[idx]; // 현재 무게 합에 트럭의 무게를 더해주고
        		bridge.add(new int [] {truck_weights[idx++], 0}); // 큐에 트럭을 추가해준다.
        	}
        	bridge.stream().forEach(arr -> arr[1]++); // 올라가있는 트럭들의 시간을 1초 증가
        	if(bridge.peek()[1] == bridge_length) { // 맨 앞의 트럭이 다리를 다 건넜을 경우
        		wSum -= bridge.poll()[0]; // 큐에서 해당 트럭을 빼면서, 트럭이 가진 무게만큼 다리 무게 합에서 빼준다.
        	}
        	answer++; // 1초 증가했다는 의미의 ++
        }
        return answer + bridge_length; // 현재까지 소요 된 시간 + 제일 마지막 트럭은 오르자 마자 반복문을 끝냈으므로 다리 길이 만큼의 시간이 더 필요함. 따라서 다리 길이 만큼 시간을 더해줌.
    }
	public static void main(String[] args) {
		System.out.println(solution(2, 10, new int [] {7, 4, 5, 6}));
		System.out.println(solution(100, 100, new int [] {10}));
		System.out.println(solution(100, 100, new int [] {10,10,10,10,10,10,10,10,10,10}));
		
	}
}
/*
다리를 지나는 트럭
문제 설명
트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.

예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.

경과 시간	다리를 지난 트럭	다리를 건너는 트럭	대기 트럭
0	[]	[]	[7,4,5,6]
1~2	[]	[7]	[4,5,6]
3	[7]	[4]	[5,6]
4	[7]	[4,5]	[6]
5	[7,4]	[5]	[6]
6~7	[7,4,5]	[6]	[]
8	[7,4,5,6]	[]	[]
따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.

solution 함수의 매개변수로 다리 길이 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.

제한 조건
bridge_length는 1 이상 10,000 이하입니다.
weight는 1 이상 10,000 이하입니다.
truck_weights의 길이는 1 이상 10,000 이하입니다.
모든 트럭의 무게는 1 이상 weight 이하입니다.
입출력 예
bridge_length	weight	truck_weights	return
2	10	[7,4,5,6]	8
100	100	[10]	101
100	100	[10,10,10,10,10,10,10,10,10,10]	110
*/