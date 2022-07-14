package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int temp;
        temp = number%10;
        System.out.print(temp);
        temp = number/10;
        temp = temp%10;
        System.out.print(temp);
        temp = number/10;
        temp = temp/10;
        System.out.print(temp);
    }
}
