for (int i = 0; i < 10; i++) {
    printf("hello world\n");
}

bcbbhcbfd



// далі пітон, бо вивчати нову мову програмування не в моїх планах на цю ніч (P.S. знаю що дефки спочатку, але тут 2 різні мови)

def vivaMechMat():
    print("Viva Mech-mat faculty!!!")




vivaMechMat()

// далі моя шиза на плюсах
#include <iostream>
#include <vector>
#include <cmath>

bool isPrime(int a) {
    if (a < 2) {
        return false;
    }

    for (int i = 2; i <= static_cast<int>(sqrt(a)); ++i) {
        if (a % i == 0) {
            return false;
        }
    }

    return true;
}

std::vector<int> r(int a) {
    std::vector<int> primes;

    if (a == 1) {
        return primes;
    }

    if (isPrime(a)) {
        primes.push_back(a);
        return primes;
    } else {
        for (int i = 2; i <= a; ++i) {
            if (a % i == 0) {
                primes.push_back(i);
                auto result = r(a / i);
                primes.insert(primes.end(), result.begin(), result.end());
                break;
            }
        }
    }

    return primes;
}

int main() {
    int n;
    std::cin >> n;

    std::vector<int> result = r(n);

    for (const auto &prime : result) {
        std::cout << prime << " ";
    }

    return 0;
}