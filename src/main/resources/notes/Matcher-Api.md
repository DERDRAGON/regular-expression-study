- [Matcher类的方法](#matcher类的方法)
- [PatternSyntaxException类的方法](#patternsyntaxexception类的方法)

# Matcher类的方法

| 序号 |                                 方法                                  |                                                            说明                                                             |
| :--- | :-------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------: |
| 1    |                          public int start()                           |                                                  返回以前匹配的初始索引。                                                   |
| 2    |                      public int start(int group)                      |                                 返回在以前的匹配操作期间，由给定组所捕获的子序列的初始索引                                  |
| 3    |                           public int end()                            |                                               返回最后匹配字符之后的偏移量。                                                |
| 4    |                       public int end(int group)                       |                           返回在以前的匹配操作期间，由给定组所捕获子序列的最后字符之后的偏移量。                            |
| 5    |                      public boolean lookingAt()                       |                                        尝试将从区域开头开始的输入序列与该模式匹配。                                         |
| 6    |                         public boolean find()                         |                                       尝试查找与该模式匹配的输入序列的下一个子序列。                                        |
| 7    |                    public boolean find(int start)                     |                       重置此匹配器，然后尝试查找匹配该模式、从指定索引开始的输入序列的下一个子序列。                        |
| 8    |                       public boolean matches()                        |                                                 尝试将整个区域与模式匹配。                                                  |
| 9    | public Matcher appendReplacement(StringBuffer sb, String replacement) |                                                 实现非终端添加和替换步骤。                                                  |
| 10   |            public StringBuffer appendTail(StringBuffer sb)            |                                                  实现终端添加和替换步骤。                                                   |
| 11   |             public String replaceAll(String replacement)              |                                   替换模式与给定替换字符串相匹配的输入序列的每个子序列。                                    |
| 12   |            public String replaceFirst(String replacement)             |                                   替换模式与给定替换字符串匹配的输入序列的第一个子序列。                                    |
| 13   |            public static String quoteReplacement(String s)            | 返回指定字符串的字面替换字符串。这个方法返回一个字符串，就像传递给Matcher类的appendReplacement 方法一个字面字符串一样工作。 |

eg:com.der.regularexpression.lessonOne.GettingStarted

# PatternSyntaxException类的方法

| 序号 |              方法              |                                              说明                                              |
| :--- | :----------------------------: | :--------------------------------------------------------------------------------------------: |
| 1    | public String getDescription() |                                        获取错误的描述。                                        |
| 2    |     public int getIndex()      |                                        获取错误的索引。                                        |
| 3    |   public String getPattern()   |                                   获取错误的正则表达式模式。                                   |
| 4    |   public String getMessage()   | 返回多行字符串，包含语法错误及其索引的描述、错误的正则表达式模式和模式中错误索引的可视化指示。 |