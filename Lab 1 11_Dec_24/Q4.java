import java.util.Scanner;

class Q4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int size = 0;
        int num_cpy = num;
        while(num_cpy!=0){
            size++;
            num_cpy/=10;
        }
        num_cpy=num;
        int new_num = 0;
        for(int i=size-1; i>=0; i--){
            new_num += num_cpy%10 * Math.pow(10, i);
            num_cpy/=10;
        }
        System.out.println("New Number is "+new_num);
        if(new_num==num){
            System.out.println("Number is a Palindrom");
        } else{
            System.out.println("Number is not a Palindrom");
        }
        scanner.close();
    }
}
