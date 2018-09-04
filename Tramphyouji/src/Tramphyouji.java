import java.util.Random;

import Tramp.Tramp;

class Tramphyouji {
public static void main(String[] args) {
String yaku[] = {"ハート", "クラブ", "スペード", "ダイヤ"};
Tramp[] toranpu = new Tramp[13 * yaku.length];
int cnt = 0;

for (String str : yaku) {
for (int i = 1; i <= 13; i++) {
toranpu[cnt++] = new Tramp(str, i);
}
}

// シャッフル
Random rnd = new Random(System.currentTimeMillis());
for (int i = 0; i < toranpu.length; i++) {
int j = rnd.nextInt(toranpu.length);
Tramp tmp = toranpu[i];
toranpu[i] = toranpu[j];
toranpu[j] = tmp;
}

for (Tramp tramp : toranpu) {
System.out.println(tramp.getGara() + "の" + tramp.getKazu());
}
}
}