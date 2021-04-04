import java.*;
import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        double num = sc.nextDouble();
        double[] arr = {0, 0, 0};
        double temp = 100d;
        for (int i = 0; i < 3; i++) {
            arr[i] = (num - num % temp) / temp;
            num -= arr[i] * temp;
            temp /= 10;
        }
        String str = "";
        if (num < 1000) {
            for (int i = 0; i < arr.length; i++) {

                if(i!=1){
                    switch ((int) arr[i]) {
                    case 1: {
                        str += "one";
                        break;
                    }
                    case 2: {
                        str += "two";
                        break;
                    }
                    case 3: {
                        str += "three";
                        break;
                    }
                    case 4: {
                        str += "four";
                        break;
                    }
                    case 5: {
                        str += "five";
                        break;
                    }
                    case 6: {
                        str += "six";
                        break;
                    }
                    case 7: {
                        str += "seven";
                        break;
                    }
                    case 8: {
                        str += "eight";
                        break;
                    }
                    case 9: {
                        str += "nine";
                        break;
                    }

                }
                }else {
                    if(arr[1]>=1){
                        switch ((int) arr[1]) {
                            case 1: {
                                switch ((int) arr[2]) {
                                    case 1: {
                                        str += "eleven ";
                                        break;
                                    }
                                    case 2: {
                                        str += "twelve ";
                                        break;
                                    }
                                    case 3: {
                                        str += "thirteen ";
                                        break;
                                    }
                                    case 4: {
                                        str += "fourteen ";
                                        break;
                                    }
                                    case 5: {
                                        str += "fifteen";
                                        break;
                                    }
                                    case 6: {
                                        str += "sixteen ";
                                        break;
                                    }
                                    case 7: {
                                        str += "seventeen ";
                                        break;
                                    }
                                    case 8: {
                                        str += "eighteen ";
                                        break;
                                    }
                                    case 9: {
                                        str += "nineteen ";
                                        break;
                                    }
                                    case 0: {
                                        str += "teen ";
                                        break;
                                    }

                                }
                                break;
                            }
                            case 2: {
                                str += "twenty ";
                                break;
                            }
                            case 3: {
                                str += "thirty ";
                                break;
                            }
                            case 4: {
                                str += "forty ";
                                break;
                            }
                            case 5: {
                                str += "fifty ";
                                break;
                            }
                            case 6: {
                                str += "sixty ";
                                break;
                            }
                            case 7: {
                                str += "seventy ";
                                break;
                            }
                            case 8: {
                                str += "eighty ";
                                break;
                            }
                            case 9: {
                                str += "ninety ";
                                break;
                            }

                        }

                    }
                }
                if(i==1&&arr[1]==1){
                    break;
                }
                if (i == 0) {
                    if (arr[0] > 0) {
                        str += " hundred and ";
                    }
                }
            }
        } else {
            str = "out of ability";
        }

        System.out.println(str);

    }
}
