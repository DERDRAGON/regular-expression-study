- [正则表达式匹配字符](#%e6%ad%a3%e5%88%99%e8%a1%a8%e8%be%be%e5%bc%8f%e5%8c%b9%e9%85%8d%e5%ad%97%e7%ac%a6)
- [预定义字符类](#%e9%a2%84%e5%ae%9a%e4%b9%89%e5%ad%97%e7%ac%a6%e7%b1%bb)
- [匹配POSIX字符类](#%e5%8c%b9%e9%85%8dposix%e5%ad%97%e7%ac%a6%e7%b1%bb)
- [匹配JAVA字符类](#%e5%8c%b9%e9%85%8djava%e5%ad%97%e7%ac%a6%e7%b1%bb)
- [匹配Unicode字符类](#%e5%8c%b9%e9%85%8dunicode%e5%ad%97%e7%ac%a6%e7%b1%bb)
- [边界匹配器示例](#%e8%be%b9%e7%95%8c%e5%8c%b9%e9%85%8d%e5%99%a8%e7%a4%ba%e4%be%8b)
- [Java正则贪婪量词](#java%e6%ad%a3%e5%88%99%e8%b4%aa%e5%a9%aa%e9%87%8f%e8%af%8d)
- [Reluctant量词示例](#reluctant%e9%87%8f%e8%af%8d%e7%a4%ba%e4%be%8b)
- [Java正则Possessive量词](#java%e6%ad%a3%e5%88%99possessive%e9%87%8f%e8%af%8d)
- [Java正则逻辑运算符示例](#java%e6%ad%a3%e5%88%99%e9%80%bb%e8%be%91%e8%bf%90%e7%ae%97%e7%ac%a6%e7%a4%ba%e4%be%8b)

# 正则表达式匹配字符

| 编号  |     字符      |                描述                 |
| :---: | :-----------: | :---------------------------------: |
|   1   |       x       |              匹配字符x              |
|   2   |     \\\\      |            反斜杠(\)字符            |
|   3   |      \0n      |      八进制值为0n的字符(0≤n≤7)      |
|   4   |    \\\\0nn    |     八进制值为0nn的字符(0≤n≤7)      |
|   5   |     \0mnn     |  八进制值为0mnn(0≤m≤3,0≤n≤7)的字符  |
|   6   |     \xhh      |      具有十六进制值0xhh的字符       |
|   7   |    \uhhhh     |      十六进制值为0xhhhh的字符       |
|   8   |      \t       |          制表符('\u0009')           |
|   9   |      \n       |          换行符('\u000A')           |
|  10   |      \r       |          回车符('\u000D')           |
|  11   |      \f       |         换页字符('\u000C')          |
|  12   |     [abc]     |        匹配a，b或c(简单类)。        |
|  13   |    [^abc]     |   除a，b或c之外的任何字符(否定)。   |
|  14   |   [a-zA-Z]    |      a到z或A到Z，包括(范围)。       |
|  15   |  [a-d[m-p]]   |   a到d，或m到p:[a-dm-p]\(联合\)。   |
|  16   | [a-z&&[def]]  |           d，e或F(交集)。           |
|  17   | [a-z&&[^bc]]  |   a到z，b和c除外：[ad-z]\(减法\)    |
|  18   | [a-z&&[^m-p]] | a到z，而不是m到p:[a-lq-z]\(减法\)。 |

![反斜杠部分含义](./images/反斜杠部分含义.png)

eg:com.der.regularexpression.lessonTwo.MetacharacterStudy#testMatchCharacters

# 预定义字符类

| 编号  |   字符   |                    描述                    |
| :---: | :------: | :----------------------------------------: |
|   1   | 点符号 . | 任何字符(可能与行终止符匹配也可能不匹配)。 |
|   2   |    \d    |                数字:[0-9]。                |
|   3   |    \D    |              非数字:[^0-9]。               |
|   4   |    \s    |         空格字符:[\t\n\x0B\f\r\n]          |
|   5   |    \S    |             非空白字符:[^\s]。             |
|   6   |    \w    |          单词字符:[a-zA-Z_0-9]。           |
|   7   |    \W    |              非单词字符:[^\w]              |

eg:com.der.regularexpression.lessonTwo.MetacharacterStudy#testPredefinedCharacter

# 匹配POSIX字符类

| 编号  |    字符    |                        描述                         |
| :---: | :--------: | :-------------------------------------------------: |
|   1   | \p{Lower}  |                小写字母字符:[a-z]。                 |
|   2   | \p{Upper}  |                大写字母字符:[A-Z]。                 |
|   3   | \p{ASCII}  |               所有ASCII:[\x00-\x7F]。               |
|   4   | \p{Alpha}  |           字母字符:[\p{Lower}\p{Upper}]。           |
|   5   | \p{Digit}  |                 十进制数字:[0-9]。                  |
|   6   | \p{Alnum}  |         字母数字字符:[\p{Alpha}\p{Digit}]。         |
|   7   | \p{Punct}  | 标点符号:!”#$%&’()*+,-./:;<=>?@[]^_>{Ι}< 其中一个。 |
|   8   | \p{Graph}  |       一个可视的字符: [\p{Alnum}\p{Punct}]。        |
|   9   | \p{Print}  |            可打印字符:[\p{Graph}\x20]。             |
|  10   | \p{Blank}  |                空格或制表符:[ \t]。                 |
|  11   | \p{XDigit} |             十六进制数字:[0-9a-fA-F]。              |
|  12   | \p{Space}  |              空白字符:[ \t\n\x0B\f\r]               |

eg:com.der.regularexpression.lessonTwo.MetacharacterStudy#testPosixCharacter

# 匹配JAVA字符类

| 编号  |        字符        |                                                                 描述                                                                  |
| :---: | :----------------: | :-----------------------------------------------------------------------------------------------------------------------------------: |
|   1   | \p{javaLowerCase}  |                                             相当于java.lang.Character.isLowerCase()方法。                                             |
|   2   | \p{javaUpperCase}  |                                             相当于java.lang.Character.isLowerCase()方法。                                             |
|   3   | \p{javaWhitespace} |                                            相当于java.lang.Character.isWhitespace()方法。                                             |
|   4   |  \p{javaMirrored}  | 相当于java.lang.Character.isMirrored()方法。方法根据Unicode值检查传递参数是否被镜像。镜像字符应显示在从右到左的文本中时水平镜像的字形 |

eg:com.der.regularexpression.lessonTwo.MetacharacterStudy#testJavaCharacter

# 匹配Unicode字符类

| 编号  |        字符        |           描述           |
| :---: | :----------------: | :----------------------: |
|   1   |    \p{IsLatin}     |       拉丁文字符。       |
|   2   |    \p{InGreek}     |     希腊块中的字符。     |
|   3   |       \p{Lu}       |      一个大写字母。      |
|   4   |  \p{IsAlphabetic}  |   字母字符(二进制属性)   |
|   5   |       p{Sc}        |        货币符号。        |
|   6   |    \P{InGreek}     | 除希腊块之外的任何字母。 |
|   7   | [\p{L}&&[^\p{Lu}]] | 除大写字母外的任何字母。 |

eg:com.der.regularexpression.lessonTwo.MetacharacterStudy#testUnicodeCharacter

# 边界匹配器示例

| 编号  | 字符  |                   描述                   |
| :---: | :---: | :--------------------------------------: |
|   1   |   ^   |                 行的开头                 |
|   2   |   $   |                一行的结尾                |
|   3   |  \b   |               一个单词边界               |
|   4   |  \B   |                非单词边界                |
|   5   |  \A   |                输入的开始                |
|   6   |  \G   |             前一个匹配的结束             |
|   7   |  \Z   | 输入结束但是对于最终终止符，如果有的话。 |
|   8   |  \z   |                输入结束。                |

eg: com.der.regularexpression.lessonTwo.MetacharacterStudy#testJavaRegexBoundaryMatchers

# Java正则贪婪量词

| 编号  |  字符  |          描述           |
| :---: | :----: | :---------------------: |
|   1   |   X?   | X，一个或根本没有匹配。 |
|   2   |   X*   |      X，零次或多次      |
|   3   |   X+   |     X，一次或多次。     |
|   4   |  X{n}  |     X，正好是n次。      |
|   5   | X{n,}  |      X，至少n次。       |
|   6   | X{n,m} |   X，至少n但不超过m次   |

eg:com.der.regularexpression.lessonTwo.MetacharacterStudy#testJavaRegexGreeddyQuantifiers

# Reluctant量词示例

| 编号  |  字符   |         描述          |
| :---: | :-----: | :-------------------: |
|   1   |   X??   |    X，一次或没有。    |
|   2   |   X*?   |     X，零次或多次     |
|   3   |   X+?   |     X，一次或多次     |
|   4   |  X{n}?  |     X，正好是n次      |
|   5   | X{n,}?  |     X，至少n次。      |
|   6   | X{n,m}? | X，至少n次但不超过m次 |

# Java正则Possessive量词

| 编号  |  字符   |        描述         |
| :---: | :-----: | :-----------------: |
|   1   |   X?+   |   X，一次或没有。   |
|   2   |   X*+   |    X，零次或多次    |
|   3   |   X++   |   X，一次或多次。   |
|   4   |  X{n}+  |   X，正好是n次。    |
|   5   | X{n,}+  |    X，至少n次。     |
|   6   | X{n,m}+ | X，至少n但不超过m次 |

# Java正则逻辑运算符示例

| 编号  |  字符  |  描述  |
| :---: | :----: | :----: |
|   1   |   XY   | X后跟Y |
|   2   | X \| Y |  X或Y  |