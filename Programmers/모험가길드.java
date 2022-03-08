//로직 : 오름 차순 정렬 -> 앞에서 부터 하나 씩 확인하며 현재 값과 다음 값을 비교 -> 크거나 같다면 result++ 아니면 계속 루프

int n = sc.nextInt();

Integer []x = new Integer[n];

for (int i = 0; i < n; i++)
{
    x[i] = sc.nextInt();
}

Arrays.sort(x);


int result = 0;
int count = 0;

for (int i = 0; i < x.length; i++)
{
    count++;
    if (count >= x[i])
    {
        result++;
        count = 0;
    }
}
