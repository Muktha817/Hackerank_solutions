#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int divide(int dividend, int divisor) {

        if (dividend == INT_MIN && divisor == -1)
            return INT_MAX;

        long long a = abs((long long)dividend);
        long long b = abs((long long)divisor);

        long long low = 0;
        long long high = a;
        long long ans = 0;

        while (low <= high) {

            long long mid = low + (high - low) / 2;

            if (mid * b <= a) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if ((dividend < 0) != (divisor < 0))
            ans = -ans;

        return (int)ans;
    }
};

int main() {

    Solution obj;

    int dividend, divisor;

    cin >> dividend >> divisor;

    cout << obj.divide(dividend, divisor);

    return 0;
}