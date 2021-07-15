参照：フリーランスエンジニア じゃけえさんブログ
【Java】値(プリミティブ)型と参照(オブジェクト)型の違いをコードと図で解説

1 値(プリミティブ)型とは
値型は以下８つ
boolean	1bit
byte	8bit
char	16bit
short	16bit
int	32bit
float	32bit
long	64bit
double	64bit
・特徴としては、全て変数のサイズ(bit)が決まっているということ
・規定のサイズを超える値を格納することはできません。逆に言うと適切な型を使わないと無駄にメモリを使うことになる

2 参照(オブジェクト)型とは
参照型はそれ以外の変数たちで、よく使うとこだと
String
配列
List系
DtoやFormなどのクラス etc…
など
・参照(オブジェクト)型の特徴は、変数に格納されているのは「値」そのものではなく、値がメモリのどこに格納されているかを示す「参照値」ということ
（例：ロッカーの鍵）
実際に値が格納されているのはロッカーの中で、変数はロッカーの番号が書いた鍵のイメージ
オブジェクトは場合によってはけっこうサイズが大きくなります。
ロッカーを持ち運ぶのは大変ですけど鍵なら簡単に持ち運べます