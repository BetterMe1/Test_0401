package Test_0401;

/*
filename
��Ŀ����
Please create a function to extract the filename extension from the given path,return the extracted filename extension or null if none.
��������:
��������Ϊһ���ļ�·��
�������:
����ÿ������ʵ����Ҫ�������Ӧ��filename extension
ʾ��1
����
Abc/file.txt
���
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
ɾ�������ַ�
��Ŀ����
���������ַ������ӵ�һ�ַ�����ɾ���ڶ����ַ��������е��ַ������磬���롱They are students.���͡�aeiou������ɾ��֮��ĵ�һ���ַ�����ɡ�Thy r stdnts.��
��������:
ÿ�������������2���ַ���
�������:
���ɾ������ַ���
ʾ��1
����
They are students. aeiou
���
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
�����ǹ�
��Ŀ����
A,B,C�������Ǻ�����,ÿ�������ﶼ��һЩ�ǹ�,���ǲ�֪������ÿ�������Ͼ����ж��ٸ��ǹ�,��������֪�����µ���Ϣ��
A - B, B - C, A + B, B + C. ���ĸ���ֵ.ÿ����ĸ����ÿ������ӵ�е��ǹ���.
������Ҫͨ�����ĸ���ֵ�����ÿ���������ж��ٸ��ǹ�,��A,B,C�����ﱣ֤���ֻ��һ������A,B,C������������������
��������:
����Ϊһ�У�һ��4���������ֱ�ΪA - B��B - C��A + B��B + C���ÿո������ ��Χ����-30��30֮��(������)��
�������:
���Ϊһ�У�����������������A��B��C��˳�����A��B��C���ÿո��������ĩ�޿ո� �������������������A��B��C�������No
ʾ��1
����
1 -2 3 4
���
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
�����еĺ�
��Ŀ����
���еĵ�һ��Ϊn���Ժ����Ϊǰһ���ƽ�����������е�ǰm��ĺ͡�
��������:
���������ж��飬ÿ��ռһ�У�����������n��n < 10000����m(m < 1000)��ɣ�n��m�ĺ�����ǰ������
�������:
����ÿ���������ݣ���������еĺͣ�ÿ������ʵ��ռһ�У�Ҫ�󾫶ȱ���2λС����
ʾ��1
����
81 4
2 2
���
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