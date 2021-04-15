public class TriangleClassifier {
    public String triangle(int a, int b, int c) {
        if (a + b > c && b + c > a && c + a > b) {
            if (a > 0 && b > 0 && c > 0) {
                if (a == b && b == c) {
                    return "đây là tam giác điều ";
                } else {
                    if (a == b || c == b) {
                        return "đây là tam giác cân ";
                    } else {
                        if (c != a) {
                            return "đây là tam giác thường";
                        }
                    }
                }
            }
        }
        return "không phải là hình tam giác ";
    }
}
