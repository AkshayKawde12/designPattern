import bridegelabz.util;

public class Flipc {
	// INITIALIZATION
	int  h_cnt = 0, t_cnt = 0;
	double heads,tails;
             public void flip(int n) {
// COMPUTATION
for (int j = 0; j < n; j++) {
	double random = Math.random();
	if (random < 0.5)
		t_cnt++;
	else
		h_cnt++;
}

heads = h_cnt / (double) n * 100;
tails = t_cnt / (double) n * 100;
System.out.println("Percentage of heads: " + heads + "%");
System.out.println("Percentage of tails: " + tails + "%");
}

}
