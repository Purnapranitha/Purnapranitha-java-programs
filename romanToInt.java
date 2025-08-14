class solution {
    static int romanToInt(String s) {
        int Int = 0;
        int num = 0;
        for (int i = s.length()-1; i>=0; i--)
        {
            switch (s.charAt(i))
            {
                case 'I': {
                    num = 1;
                    break;
                }
                case 'V': {
                    num = 5;
                    break;
                }
                case 'x': {
                    num = 10;
                    break;
                }
                case 'L': {
                    num = 50;
                    break;
                }
                case 'C': {
                    num = 100;
                    break;
                }
                case 'D': {
                    num = 500;
                    break;
                }
                case 'M': {
                    num = 1000;
                    break;
                }
                default:
                {
                    System.out.println("invalid Roman number:");
                }
           }
        if (num * 4 < Int)
        {
            Int -= num;
        }
        else
        {
            Int += num;
        }
    }
    return Int;
}
public static  void main(String []args) {
    int sum=romanToInt("M");
    System.out.println(sum);
  }
}
