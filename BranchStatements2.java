package Day17_While_DoWhile_LoopPractice;

public class BranchStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E' ; i++) {
            
            if (i=='C'){
                continue;//when it is continue it doesnt print continue condition and keep
                //continue; eger break varsa orada durur ve break olan condition yazmaya dahil etmez
            }System.out.println(i);

        }

        System.out.println("============================================");

        for (int i = 0; i <=100 ; i++) {
            if(i%2==1){
                continue;
            }
            System.out.print(i+" ");
            
        }
    }

}
