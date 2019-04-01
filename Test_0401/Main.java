package Test_0401;

/*
filename
题目描述
Please create a function to extract the filename extension from the given path,return the extracted filename extension or null if none.
输入描述:
输入数据为一个文件路径
输出描述:
对于每个测试实例，要求输出对应的filename extension
示例1
输入
Abc/file.txt
输出
txt
 */
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int i = s.lastIndexOf(".");
//        if(i == -1 || s.charAt(i+1) == '/'){
//            System.out.println("null");
//        }else{
//            System.out.println(s.substring(i+1));
//        }
//    }
//}

/*
删除公共字符
题目描述
输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
输入描述:
每个测试输入包含2个字符串
输出描述:
输出删除后的字符串
示例1
输入
They are students. aeiou
输出
Thy r stdnts.
 */
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        for(int i=0; i<s2.length(); i++){
//            s1 = s1.replace(String.valueOf(s2.charAt(i)),"");
//        }
//        System.out.println(s1);
//    }
//}

/*
计算糖果
题目描述
A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。
输入描述:
输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开。 范围均在-30到30之间(闭区间)。
输出描述:
输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格。 如果不存在这样的整数A，B，C，则输出No
示例1
输入
1 -2 3 4
输出
2 1 3
 */
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        int num4 = sc.nextInt();
//        int B = (num2 + num4)/2;
//        int A = num1 + B;
//        int C = num4 - B;
//        if(A+B == num3){
//            System.out.println(A+" "+B+" "+C);   
//        }else{
//            System.out.println("No");
//        }
//    }
//}

/*
求数列的和
题目描述
数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
输入描述:
输入数据有多组，每组占一行，由两个整数n（n < 10000）和m(m < 1000)组成，n和m的含义如前所述。
输出描述:
对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
示例1
输入
81 4
2 2
输出
94.73
3.41
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double res = 0;
            double n = sc.nextInt();
            double m = sc.nextInt();
            for(int j=0; j<m; j++){
                res += n;
                n = Math.sqrt(n);
            }
            System.out.printf("%.2f",res);
            System.out.println();
        }
    }
}