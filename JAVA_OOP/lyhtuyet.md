```java
package v1study;

import java.io.IOException;
import java.util.Scanner;

public class Bai5 {
  public static void main(String[] args) throws IOException {
    //Sử dụng lớp Scanner để nhập liệu cho các loại dữ liệu khác nhau.
    //Trước tiên cần tạo 1 đối tượng Scanner:
    Scanner input = new Scanner(System.in);
    int i;
    short s;
    byte b;
    long l;
    float f;
    double d;
    boolean bo;
    String str;
    char c;


    System.out.print("Nhập 1 số nguyên: ");
    i = input.nextInt();
    System.out.println("Sau khi nhập, i = " + i);
    System.out.print("Nhập 1 số nguyên short: ");
    s = input.nextShort();
    System.out.println("Sau khi nhập, s = " + s);
    System.out.print("Nhập 1 số nguyên byte: ");
    b = input.nextByte();
    System.out.println("Sau khi nhập, b = " + b);
    System.out.print("Nhập 1 số nguyên long: ");
    l = input.nextLong();
    System.out.println("Sau khi nhập, l = " + l);
    System.out.println("Nhập 1 số thực float: ");
    f = input.nextFloat();
    System.out.println("Sau khi nhập, f = " + f);
    System.out.print("Nhập 1 số thực double: ");
    d = input.nextDouble();
    System.out.println("Sau khi nhập, d = " + d);
    System.out.print("Nhập 1 giá trị boolean: ");
    bo = input.nextBoolean();
    System.out.println("Sau khi nhập, bo = " + bo);
    System.out.print("Nhập 1 chuỗi: ");
    input.nextLine();
    str = input.nextLine();
    System.out.println("Sau khi nhập, str = " + str);
    System.out.print("Nhập 1 ký tự: ");
    c = (char) System.in.read();
    System.out.println("Sau khi nhập, c = " + c);

    System.out.printf("%.2f %10f\n",số1, số2) // in ra 2 số sau dấu phẩy
  }
}
``` 


NHẬP DỮ LIỆU TỪ BÀN PHÍM:
```java
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int a;
        a = sc.nextInt();
        float b = sc.nextFloat();
        System.out.println(a);
        char kiTu = sc.nextLine().charAt(0);// nhập một kí tự
        int a= sc.nextInt(), b= sc.nextint(), c= sc.nextInt(); nhập liên tiếp 


    }
}


```

TOÁN TỬ:
```java
import java.util.Scanner;
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    // một lỗi tiêu biểu do tràn bộ nhớ int
    // nhập a , b= 1000000
    int tich = a*b;
    System.out.println(tich)// kết quả: -727379968... không ra 10^12 do int chỉ lưu dc -2.10^9 -> 2.10^9
    ==>> phâir sửa thành :
    long tich= (long)a*b; ép kiểu cho một trong hai a or b thành long

    //cộng gộp

    a +=b // bằng a = a+b

    //abs gtỉ tuyệt đối
    //sqrt căn bậc 2
    // pow lũy thừa : trả về doulbe
    //min, max
    //PI
    Sout(Math.sqrt(a));
    
    //làm tròn số ceil floor round - lên - xuống - số gnueyen
    float a= 2.67F;
    sout(math.ceil(a));

    // toán tử logic
    
    and &&
    or ||
    not !

   // toán tử tăng giảm 

   ++a -a //tăng-giảm trước 1 đơn vị
   a++  a- //  tăng-giảm sau 1 đơn vị

   // ví dụ điển hình
   int a = 100;
   int m = a++;
   sout(a); // 101
   sout(m); // 100

// vì : chạy từ trên xuống thì bước 1 : nó khai báo a
// bước 2 : gán m = a= 100 rồi mới a++ nên a = 101 (do là tăng 'sau' 1 đơn vị)
// bước 3 4 : in ra như trênn


  // TOÁN TỬ BA NGÔI
  biểu thức so sánh ? giá trị chả về khi đúng : gtri chả vè khi sai
  VD
  int x = 10<20 ? 10:20; // x= 10
  int y = (10<20) && (20>20) ? 5 : 10;// y = 10

  // CÂU ĐIỀU KIỆN 
  if(điều kiện){
    Code chỗ này sẽ được thực hiện nếu đkien trên đúng
  }
  else{
    code này dc thực hiện nêu sdkien sai
  }
//else không bắt buộc có trong if
// else if(dkien){
    code
}// có thể thêm vào sau if
  
  vdu
  if ((dkien 1) &&(dkien 2) ){
    codeeeeeeeeeee
  }

// 
}

```



chiều dài mảng :
int[] data = new int[10];
System.out.println(int[10])

cấc phuoeng pháp khai báo mảng 

type[] name = { .., . .. , . . ,  .., .., .., .., ..,};

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10]; // Khởi tạo mảng với kích thước 10

        // Nhập giá trị cho các phần tử của mảng
        System.out.println("Nhập 10 số nguyên:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt(); // Đọc số nguyên từ bàn phím và gán vào mảng
        }

        // In mảng ra để kiểm tra
        System.out.println("Các số trong mảng là:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        
        scanner.close(); // Đóng Scanner để giải phóng tài nguyên
    }
}


import java.util.Arrays; 

public class thuchanhngay {
    public static void main(String[] args) {
        int[] mang1 = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 1; i < mang1.length; i++) {
            mang1[i] += mang1[i - 1];
        }
        System.out.println("mang1 la " + Arrays.toString(mang1));
    }
}



ENUM là một kiểu dữ iệu đb cho phép một biến có thể là một tập hợp các hằng số định sẵn

public ENUM DAY {sunday,monday,tuesday,wednesday,thursday,fri,saturday,sunday}................


text processing : ktea , chỉnh sửa , formatting

hai kiểu dữ liệu

char 
String

string method

the charat method

sử dụng phương thức chuỗi kí tự :
String a ;
a.<method>(<args>)

 String a = "Cola" ;
 int len = s.length();  // len == 4
 char firstLetter = s.charAt(0);  // 'C'
 int index = s.indexOf("ol"); // index == 1
 String sub = s.substring(1,3);  // "ol"
 String up = s.toUpperCase();  // "COLA"
 String dowm = s.toLowerCase(); // "cola"


 so sánh chuỗi 

 nhập vào 2 tên và so sánh xem 2 tên có trùng nhau không
 // nhập vào 2 tên và so sánh xem 2 tên có trùng nhau không
```java
    
public class thuchanhngay{
    public static void main(String[] args) {
        String ten1 = "Doan";
        int ten2 = 10000;
    System.err.println(ten1 + ten2);
    }

}

biến đổi chuoix kí tự sang dạng dữ liệu khác

chuyenr string sang số nghuyên :
integer.parseInt(x)

chuyển string sang số thực :
Double.parseDouble(x) ...

đọc vào chuỗ kí tự 
sử dụng scanner để đôvj 
phâỉ import java.util.scanner;


stringbuilder class là một sự bổ sung co string class

java.lang.StringBuilder
StringBuilder()

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("Hello...");
        System.out.println(sb.toString());
        sb.append("!");
        System.out.println(sb.toString());
        sb.insert(7,"Java");
        System.out.println(sb); // Output: Hello...Java!
    }
}

```

Stringtokenizer

package

sử dụng một kiểu iếm thông thường để thộng biến

Day m = Day.sunday;



bài tập tìm phàn tử lớn nhất mảng
-tạo mảng A ngẫu nhiên 10 phần tử từ 0-100
- in ra mảng a
- tìn gtln
- sắp xếp lại A theo thư stự tăng dần
```java
import java.util.Arrays;
import java.util.Random;

public class thuchanh {
    public static void main(String[] args) {
        // Tạo mảng ngẫu nhiên 10 phần tử từ 0-100
        int[] A = new int[10];
        Random rand = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(101); // Random từ 0 đến 100
        }

        // In ra mảng A
        System.out.println("Mảng A: " + Arrays.toString(A));

        // Tìm phần tử lớn nhất trong mảng A
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng A: " + max);

        // Sắp xếp mảng A theo thứ tự tăng dần
        Arrays.sort(A);
        System.out.println("Mảng A sau khi sắp xếp tăng dần: " + Arrays.toString(A));
    }
}
```



bài tập mã hóa


```java
public class thuchanh {
    public static void main(String[] args) {
        String a = "AAECCCCGGGD";

        // Đếm các ký tự giống nhau liền kề và viết số lượng sau ký tự
        for (int i = 0; i < a.length(); i++) {  // Vòng lặp duyệt hết chuỗi
            int count = 1;
            while (i + 1 < a.length() && a.charAt(i) == a.charAt(i + 1)) {  // Đếm ký tự lặp lại
                count++;
                i++;
            }
            if (count > 1) {  // Nếu có lặp lại, in ký tự kèm số lượng
                System.out.print(a.charAt(i) + "" + count);
            } else {  // Nếu không lặp lại, in ký tự bình thường
                System.out.print(a.charAt(i));
            }
        }
        System.out.println();  // In dòng mới sau khi kết thúc
    }
}
```


 bài tập ktra số đẹp



ngày 20/9 
ĐỐI TƯỢNG (OBJECTS)
• Variables: biểu diễn dữ liệu và thuộc tính của dữ liệu
• Methods: biểu diễn hành vi và chức năng
• Đối tượng:
• Variables: một đối tượng có thể bao gồm nhiều biến số, biểu diễn dữ liệu và thuộc tinh của đối tượng
• Method/ Phương thức: Một đối tượng có thể bao gồm nhiều phương thức biểu diễn hành vi và chức năng của đối tượng

CLASS
• Class là một kiểu dữ liệu của đối tượng
• Class String biểu diến đối tượng chuỗi ký tự.
• Class Scanner biểu diễn đối tượng có thể
• Các thành phần của class
• Các thuộc tính (các fields/ biến instance): chứa trạng thái của các đổi tượng (object) được tạo ra
• Các method - phương thức: mô tả các hành vi của đối tượng được tạo
• Hàm khởi tạo (hành động thực thi bản thiết kế để tạo ra đối tượng)
• Các block code: các đoạn code được thực thi ngay khi đối tượng được khởi tạo


Khổi tạo đối tượng 
• Khỏi tạo: Sử dụng từ khóa new để khởi tạo một đối tượng
• Khai báo:
‹class> ‹name> = new ‹class> (<arguments>) ;
Point p = new Point (7, -4) ;
Scanner console = new Scanner (System. in) ;
• String:
String s = new String ("hi") ;
String s - "hi";

object equality

POP VS. OOP
• Procedure-Oriented Program
Program= data + algorithms.
• Mỗi thuật toán được thực thi như là một hàm, bao gồm một nhóm các câu lệnh. Data chính là các tham số của hàm đó.
• Object-oriented
• Programs = actions of some objects
•Object bao gồm data và hành vi được thực thi như là các phương thức của đối tượng

TINH DONG GOI (ENCAPSULATION)
• Tinh dong goi ta ky thuat an giau thong tin khong lien quan va
hiện thị ra thông liên quan
• Khai báo các biến của một lớp là private.
• Cung cấp phương thức setter và getter là public để có thể sửa đối và xem các giá trị biến
• Gefter bat dau bang chir get + viet hoa chi dau tien
tat ca cac ti (viet hoa chi diu tien cia ten bien).
• Setter, bắt đầu bằng chữ set + viết hoa chữ đầu tiên tất cả các từ (viết hoa chữ đầu tiên của tên biến)

```java
public class Student { 
    private String name; 
    public String getName(){
       return name
    };
public void setName(String name) (
this.name = name;
```

TÍNH KẾ THỪA: INHERITANCE
• Kế thừa (nheritance) trong Java là một tính năng của lập trình hướng đối tượng,
 cho phép một lớp (class) mới tiếp nhận các thuộc tính và phương thức của một lớp khắc.
• Lớp mới được gọi là lớp con (subclass), và lớp mà nó kế thừa được gọi là lớp cha (superclass).
 Kế thừa giúp tái sử dụng mã nguồn, giảm độ lặp lại và tăng tính mô-đun của chương trình
• Lớp cha (Superclass): Lớp mà các thuộc tính và phương thức được kế thừa bởi lớp con.
• Lớp con (Suclass): Lớp kế thừa các thuộc tính và phương thức từ lớp cha.
• extends: Từ khóa dùng để chỉ rõ lớp con kế thừa từ lớp cha.
• super. Từ khóa dùng để truy cập các thuộc tính và phương thức của lớp cha từ lớp con.

VD img ben canh

```java
   
```
TÍNH ĐA HÌNH - POLYMORPHISM
• Cho phép đối tượng có thể thực hiện tác vụ theo nhiều cách
• Nap chồng (Overriding): Cùng tên hàm nhưng khác nhau về tham
so daน vao
• Ghi Đè (Overriding): Cùng tên hàm, cùng tham số đầu vào nhưng khác nhau về phương thức thự hiện. Khi gọi, nếu lớp con không có phương thức riêng phương thức của lớp cha sẽ được gọi. Ngược lại nếu có, phương thức của lớp con sẽ được gọi




getter

package: dc sd để nhóm các lớp liên quan , java có nhiêiu package có sẵn

acces modifier trong java:
ACCESS MODIFIER TRONG JAVA
• Có hai loại Modiffer trong Java, đó là: Access Modifier và Non-access Modifier.
• Access Modifer trong Java xác định phạm vi có thể truy cập của thành viên dữ liệu, phương thức, constructor hoặc lớp.
• Có 4 loại Access Modifier là: private, default, protected, và public.
•Default: Truy cập trong nội bộ package
•Private: Truy cập trong nội bộ lớp
•Publi: Thành phần công khai, truy cập tự do từ bên ngoài
• Protected: Thành phần được bảo vệ, bị hạn chế truy nhập từ bên ngoài
• Access modifiers định các mức đô truy cáp dữ liệu
•Class: có thể sử dụng hay không
• Hàm/Thương thức: có thể gọi hay không fields / thuộc tính có thể đọc hoặc ghi đươc hay không

ACCESS MODIFIER/ access level

```java
import java.util.Scanner;
public class Bai1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            tinhtong();
        }
    }
    public static void tinhtong(){
       long a = sc.nextLong();
       long tong = a * (a + 1) / 2;
       System.out.println(tong);
    }
}
```


CODE SỐ NGUYÊN TỐ
```java
 public static Scanner ip = new Scanner(System.in);

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }//boolean là một kiểu dữ liệu có thể nhận một trong hai giá trị: true hoặc false.
// Khi một phương thức được khai báo với kiểu trả về là boolean, nó sẽ trả về kết quả là true hoặc false (thường dùng để kiểm tra điều kiện nào đó).

    public static void testCase() {
        int n = ip.nextInt();
        if (isPrime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int T = ip.nextInt();
        while (T-- > 0) {
            testCase();
        }
    }
```

này la fbài checkk fibonaccci
```java
import java.util.Scanner;

public class Bai1 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            Tong();
        }
    }
    public static boolean isPerfectSquare(long x) {
        long s = (long) Math.sqrt(x);
        return (s * s == x);
    }

    public static boolean isFibonacci(long n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }
    
    public static void Tong() {
        long num = sc.nextLong(); 

        if (isFibonacci(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}















    // public static void Tong(){
    //     int n = sc.nextInt();
    //     long f0=0, f1=1, fn=0;
    //     if ((n==0)&&(n==1)){
    //         System.out.println("YES");
    //     }
        
        
          
    // }

    // public static boolean check(int n ){
    //     Tong();
        // if (n == a)
        //   return true;
        // return false;

    // }

    // public static void kq(){
    //     if (check(n)){
    //         System.out.println("YES");
    //     }
    //     System.out.println("NO");
    // }
    ```




CODE PTIT CHUẨN HÓA XÂU KÍ TỰ -1
```JAVA
import java.util.Scanner;
import java.util.Vector;

public class Lazygarde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Vector<String> a = new Vector<String>();
            String x = "";
            s = s.toLowerCase() + " ";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (x != "") {
                        a.add(x);
                        x = "";
                    }
                } else {
                    x += s.charAt(i);
                }
            }
            for (int i = 0; i < a.size(); i++) {
                String k = a.get(i);
                System.out.print(k.substring(0, 1).toUpperCase() + k.substring(1) + " ");
            }
            System.out.println();
        }
    }
}
```

Đoạn mã Java này thực hiện việc chuyển đổi chuỗi đầu vào thành chuỗi chữ cái đầu của mỗi từ viết hoa, tương tự cách định dạng chữ cái đầu của mỗi từ trong tiêu đề. Sau đây là giải thích chi tiết:

Giải thích từng phần của đoạn mã:
Nhập số lượng trường hợp t:

java
```java
int t = sc.nextInt();
sc.nextLine();
```
Đọc số t là số lượng bộ test mà người dùng sẽ nhập vào.
Sử dụng sc.nextLine() ngay sau đó để loại bỏ dòng trống sau khi nhập t, vì khi bạn nhập t bằng sc.nextInt(), dấu \n vẫn còn trong bộ đệm đầu vào và cần được xử lý để không ảnh hưởng đến lần đọc tiếp theo.
Vòng lặp chạy qua t trường hợp:


```java
while (t-- > 0) {
    String s = sc.nextLine();
```
Với mỗi lần lặp, chương trình đọc một chuỗi đầu vào s.
Chuẩn bị dữ liệu đầu vào:


```java
Vector<String> a = new Vector<String>();
String x = "";
s = s.toLowerCase() + " ";
```
Vector<String> a là một danh sách để lưu các từ đã tách ra từ chuỗi.
String x = "" để tạm thời lưu từng từ khi duyệt qua chuỗi.
s = s.toLowerCase() + " ": chuyển toàn bộ chuỗi sang chữ thường và thêm một dấu cách cuối cùng để đảm bảo rằng từ cuối cùng cũng được xử lý khi duyệt chuỗi.
Tách chuỗi thành các từ:

java
```java
for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == ' ') {
        if (x != "") {
            a.add(x);
            x = "";
        }
    } else {
        x += s.charAt(i);
    }
}
```
Duyệt qua từng ký tự của chuỗi. Nếu gặp dấu cách ' ', nó kiểm tra xem chuỗi x có rỗng không.
Nếu không rỗng, chuỗi này là một từ và sẽ được thêm vào danh sách Vector<String> a.
Sau đó, biến x được đặt lại thành rỗng để tiếp tục nhận từ tiếp theo.
Nếu ký tự không phải là dấu cách, nó sẽ được thêm vào chuỗi x.
Viết hoa chữ cái đầu của mỗi từ:



```java
for (int i = 0; i < a.size(); i++) {
    String k = a.get(i);
    System.out.print(k.substring(0, 1).toUpperCase() + k.substring(1) + " ");
}```
System.out.println();
Sau khi tách xong các từ, chương trình duyệt qua từng từ trong danh sách a.
Nó lấy từ đầu tiên k, viết hoa chữ cái đầu tiên bằng cách dùng k.substring(0, 1).toUpperCase(), sau đó ghép với phần còn lại của từ k.substring(1).
Các từ được in ra, mỗi từ cách nhau một dấu cách.
In ra kết quả cho mỗi bộ test:

Sau khi hoàn thành vòng lặp in từng từ của một chuỗi, chương trình sẽ in xuống dòng mới bằng System.out.println(); để chuyển sang bộ test tiếp theo.
Ví dụ chạy chương trình:
Giả sử người dùng nhập vào:

Sao chép mã
2
hello world
java programming
Kết quả sẽ là:

Sao chép mã
Hello World 
Java Programming 
Tóm tắt:
Chương trình nhận nhiều chuỗi đầu vào (theo số lượng bộ test t).
Chuyển mỗi chuỗi thành chữ thường, tách các từ và viết hoa chữ cái đầu của mỗi từ.
In kết quả cho mỗi chuỗi đã định dạng.


CODE PTIT BAI DIA CHI EMAIL
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Lazygarde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> m = new HashMap<String, Integer>();
        while (t-- > 0) {
            String s = sc.nextLine();
            Vector<String> a = new Vector<String>();
            String x = "";
            s = s.toLowerCase() + " ";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (x != "") {
                        a.add(x);
                        x = "";
                    }
                } else {
                    x += s.charAt(i);
                }
            }
            s = a.get(a.size() - 1);
            for (int i = 0; i < a.size() - 1; i++)
                s += a.get(i).substring(0, 1);
            if (m.get(s) == null) {
                m.put(s, 1);
                x = "";
            } else {
                x = Integer.toString(m.get(s) + 1);
                m.put(s, m.get(s) + 1);
            }
            System.out.println(s + x + "@ptit.edu.vn");
        }
    }
}
```


CODE PTIT BAI BIEN SO DEP
```java
import java.util.Scanner;

public class biensodep {

    public static int Check(String s) {
        if (s.charAt(1) > s.charAt(0) && s.charAt(2) > s.charAt(1) && s.charAt(3) > s.charAt(2) && s.charAt(4) > s.charAt(3))
            return 1;
        if (s.charAt(1) == s.charAt(0) && s.charAt(2) == s.charAt(1) && s.charAt(4) == s.charAt(3))
            return 1;
        for (int i = 0; i < 5; i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8')
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().substring(5).replace(".", "");
            if (Check(s) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}```




ngày 4/10/2024

inheritance
lop doi tuong

Tính đa hình polymorphism
• Cho phép đối tượng có thể thực hin tc vụ theo nhiều cách
• Nạp chồng (Overriding): Cùng tên hàm nhưng khác nhau về tham số đầu vào
• Ghi Đè (Overriding): Cùng tên hàm, cùng tham số đầu vào nhưng khác nhau về phương thức thự hiện. Khi gọi, nếu lớp con không có phương thức riêng phương thức của lớp cha sẽ được gọi. Ngược lại nếu có, phương thức của lớp con sẽ được gọi

class design

hÀM KHỞI TẠO - CONSTRUCTORS
```java
class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    // Hàm khởi tạo 1: Không có tham số, mặc định chiều dài và chiều rộng là 1
    public HinhChuNhat() {
        this.chieuDai = 1.0;
        this.chieuRong = 1.0;
    }

    // Hàm khởi tạo 2: Truyền một giá trị và sử dụng nó cho cả chiều dài và chiều rộng (hình vuông)
    public HinhChuNhat(double canh) {
        this.chieuDai = canh;
        this.chieuRong = canh;
    }

    // Hàm khởi tạo 3: Truyền cả chiều dài và chiều rộng
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Phương thức tính diện tích
    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    // Phương thức in thông tin về hình chữ nhật
    public void hienThiThongTin() {
        System.out.println("Chiều dài: " + this.chieuDai);
        System.out.println("Chiều rộng: " + this.chieuRong);
        System.out.println("Diện tích: " + this.tinhDienTich());
    }

    public static void main(String[] args) {
        // Tạo đối tượng HinhChuNhat với hàm khởi tạo không tham số
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.hienThiThongTin();

        // Tạo đối tượng HinhChuNhat với hàm khởi tạo hình vuông (chiều dài = chiều rộng)
        HinhChuNhat hcn2 = new HinhChuNhat(5);
        hcn2.hienThiThongTin();

        // Tạo đối tượng HinhChuNhat với hàm khởi tạo có cả chiều dài và chiều rộng
        HinhChuNhat hcn3 = new HinhChuNhat(4, 6);
        hcn3.hienThiThongTin();
    }
}

```


member funcion

```java
ACCESS MODIFIER TRONG JAVA
• Có hai loại Modilir trong Java, đó là: Access Modifier và Non-access Modifier.
Mach thot trạng bra xắc định phẩm vi có thể try cập của thành viên đỡ liệu, phương thức,
• CCó 4 oại Access Modifer là: private, default, protected, và public.
Delauit: Truy cáp trong nội bộ package
Privat: Truy cập trong nội bộ lớp
Public: Thành phần công khai, truy cập tự do từ bên ngoài
Protected: Thành phần được bảo vệ, bị hạn chế truy nhập từ bên ngoài
• Access modifiers định các mức độ truy cập dữ liệu
Class: có thể sử dụng hay không
Hàm/Thương thức: có thể gọi hay không felds / thuộc tinh có thể đọc hoặc ghi được hay không

OVERRIDDEN TRONG JAVA
• Cho phép một lớp con cung cấp một định nghĩa mới cho một phương
 thức đã được định nghĩa trong lớp cha của nó. Quá trình này giúp lớp
  con mở rộng hoặc thay đổi hành vi của lớp cha mà không làm thay đổi mã nguồn của lớp cha
• Khi một lớp con ghi đẻ một phương thức của lớp cha, phương thức của
 lớp con sẽ được gọi thay vì phương thức của lớp cha khi đối tượng 
 lớp con được sử dụng. Điều này cho phép lớp con thay đổi hành vi của 
 lớp cha mà không ảnh hưởng đến các lớp khác kế thừa từ lớp cha

 BIEN STATIC(STATIC VARIABLES)
• Biến static có thể được sử dụng làm thuộc tính chung, để dùng chung dữ liệu cho tất cả objecls
(hoic instances) cia lop do va
điều đó giúp cho chương trình tiết kiệm bộ nhớ hơn

NESTED CLASSES: LỚP LỒNG NHAU
• Lớp lòng nhau (inner class) trong java là một lớp được khai báo trong lớp (class) hoặc interface khác.
• Nhóm các lớp và các interface một cách logic lại với nhau ở một nơi để giúp cho code dễ đọc và dễ bảo trì hơn. Code được tối ưu hóa, tiết kiệm code hơn
• Có thể truy cập tất cả các thành viên của lớp bên ngoài (outer class) bao gồm các thành viên dữ liệu private và phương thức.

```java
class Java_Outer_class {
// code
class Java_Inner_class {
// code
}
}
```
wrapper classes
WRARPER OBJECT
• Ct tạp, Traper đươg sử dụng để cung cấp c chế "bpe" hoặc nàng buớc cức giả trị của kiếu di liệu nguyên thùy vào một đối lượng. Điều này giúp các kiểu nguyên thùy noại đơng đương tự mi các tui tượng và thực hiện các hoạt động dành riêng cho các đổi
• Các lin Vranger cùng được sử dụng để cụng cấp nhiều chức năng tiện ích cho các kiêu đt liệu nguyên thùy như chuyền đời các kiều nguyên thùy thành các đối tượng chuỗi và ngược lại, chuyến đội sang các ca sở khác nhau như nhí phân, bất phân hoặc thập lục phần haặc se sảnh các đối lượng khác nhau.
• Chùng ta không thể cung cấp các giá trị mul cho các kiều d liệu nguyên thùy nhưng các
RO WIanner Co uhe là mill. vi ve y các lớn wiepper có thể cược sử cụng vong nhưng trường đơn nhuvậi chin tà sẽ cài n găn gia ui null cho c.
ác kiều dất liệu nguyên thưy

autobõing - unboxing

return primitive types

đọc file ngẫu nhiên với randomaccessfile

binary stream

object file 

student<code, name>

viet mot chuong trinh javva vs chuwc nang sau:
    hien thi danh sach student trong file student.dat
    them dsach svien vafo cuooi file 
    doc/ghi student nhu la binary object tu file


ke thua va da hinh
