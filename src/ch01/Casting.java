package ch01;

public class Casting {
    public static void main(String[] args) {
        // 형변환(형식 변환, Casting, Conversion)
        // 변수나 값의 자료형을 다른 자료형으로 변환하는 과정

        // 1.묵시적 형변환(자동 형변환, implicit conversion) > 내부적으로 알아서 해주는 것
        // 웬만하면 잘 안쓰는게 좋음 (알수 없는 오류 가능성, side-effect, smell)
        int x = 10;
        System.out.println(x);
        double y = x; // 정수형 변수를 실수형 변수로 할당.
        System.out.println(y);

        double xx = 10.5;
        // int aa = xx > 오류
        // 묵시적 변환의 원리는 더 좁은 값을 저장할 수 이는 변수를 더 넓을 값을 저장할 수 있는 변수에 대입

        // 명시적 형변환(explicit conversion)
        int aa = (int) xx;  // 소숫점 절사
        System.out.println("double "+xx+"를 명시적 형변환(explicit conversion) 후 결과 :  "+aa);

        double data1 = 3.14;
        int iData1 = (int) data1; // 오류 발생
        System.out.println("double "+data1+"를 int 형변환 후 결과 :  "+iData1);

        int data2 = 10;
        String sData2 = data2+""; // 또는 Integer.toString(x)
        System.out.println("int "+data2+"를 String 형변환 후 결과 :  "+sData2);

        // 문자열 <-> 숫자
        String data3 = "10";
        int iData3 = Integer.parseInt(data3);
        System.out.println("String "+data3+"를(을) int 형변환 후 결과 :  "+iData3);

//        char c = '더';   // 2byte 문자값
//        int num = c;    // 한글은 완성형으로 아스키 값으로 저장 (현재는 한글은 완성형으로 사용)
//        System.out.println("char \""+c+"\" 값의 아스키 값  :  "+num);

//        char cArray[] = {'더','A'};   // 2byte 문자값
//        System.out.println(cArray[0]+" "+cArray[1]);

        int number = 10;
        String str = Integer.toString(number);
        System.out.println(str);

        String strValue = String.valueOf(number);
        System.out.println(strValue);

        // 소숫점이 있는 10진수 : decimal
        System.out.println("--// 소숫점이 있는 10진수 : decimal-------");
        double decimal = 10.5;
        String strDecimal = Double.toString(decimal);
        System.out.println("double형을 String으로 변환 : "+strDecimal);

        // 숫자 => 문자열 : String.valueOf()
        String strDecimalValue = String.valueOf(decimal);
        System.out.println("decimal을 string 으로 변환 : "+strDecimalValue);

        // 문자열 => 숫자 (valueOf, parseInt 둘다 사용 가능)
        String strData4 = "100";
        int iData4 = Integer.parseInt(strData4);
        System.out.println("parseInt 문자열 => 숫자 : "+iData4);

        int iData5 = Integer.valueOf(strData4);
        System.out.println("valueOf 문자열 => 숫자 : "+iData5);

        System.out.println(Double.toString(iData5));

        //문제 1:
        //정수를 문자열로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 정수 123을 문자열로 변환하면 "123"이 출력되어야 합니다.
        int num1 = 123;
        String sNum1 = Integer.toString(num1);

        // 문제 2:
        //실수를 문자열로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 실수 3.14를 문자열로 변환하면 "3.14"가 출력되어야 합니다.
        double num2 = 3.14;
        String sNum2 = Double.toString(num2);
        System.out.println("sNum2 : "+sNum2);

        // 문제 3:
        //문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 문자열 "456"을 정수로 변환하면 숫자 456이 출력되어야 합니다.
        String str1 = "456";
        int iStr1 = Integer.parseInt(str1);
        System.out.println("iStr1 : "+iStr1);

        // 문제 4:
        //문자열을 실수로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 문자열 "2.718"을 실수로 변환하면 숫자 2.718이 출력되어야 합니다.
        String str2 = "2.718";
        Double dStr2 = Double.valueOf(str2);
        System.out.println("dStr2 : "+dStr2);

        //문제 5:
        //문자열에서 숫자를 추출하여 출력하는 프로그램을 작성하세요. 예를 들어, 문자열 "Hello123"에서 숫자를 추출하면 123이 출력되어야 합니다.
        String str3 = "Hello123";
        int iSubStr3 = Integer.valueOf(str3.substring(5));
        System.out.println(iSubStr3);

        // 정리...
        // 자바에서 숫자를 저장할때
        // 소숫점 X : int
        // 소숫점 X, 20억이 넘을 것 같으면 : long
        // 소숫점 O : double
        // 문자열 저장 : string

        // String.valueOf(숫자자료형) : 숫자 -> 문자열
        // Integer.valueOf(문자열) : 문자열 -> 정수
        // Double.valueOf(문자열) : 문자열 -> 실수
        // 데이터타입.valueOf(입력값) : 입력값을 데이터타입의 값으로 변환한다.

    }
}
