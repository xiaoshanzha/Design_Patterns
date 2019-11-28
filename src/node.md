### java笔记
#####  String与byte数组的相互转换

String转byte数组：
```
String str = "abcd";
byte[] bs = str.getBytes();
System.out.println(Arrays.toString(bs));    // 输出：[97, 98, 99, 100]
```
byte数组转String
```
String str = "abcd";
byte[] bs = str.getBytes();
System.out.println(new String(bs));       // 输出：abcd
```
char[] 数组转字符串
```
char[] c = {'a','b','c','d','e'};
System.out.println(String.valueOf(c));    //输出：abcde
```