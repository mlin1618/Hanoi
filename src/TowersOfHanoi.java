/**
 * Created by ml996 on 1/17/17.
 */
public class TowersOfHanoi {
    public int N;
    public int turn;
    public TowersOfHanoi(int num){
        N = num;
        turn = 1;
    }
    public void solve(int x, int from, int to){
        if(x == N){
            System.out.println("Instructions: ");
        }
        if(x==1) {
            System.out.println(turn + ": Move one disk from " + from + " to " + to);
            turn++;
        }
        else{
            solve(x-1, from, 6-(to+from));
            solve(1, from, to);
            solve(x-1, 6-(to+from), to);
        }
    }
}
