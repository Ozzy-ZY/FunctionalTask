package functional;

public class Main {
    public static void main(String[] args) {
        // Assigning functions to variables
        FuncAsVar funcAsVar = new FuncAsVar();
        var add = funcAsVar.add;
        System.out.println(add.apply(10, 20));

        // Function As Arguments
        FuncAsArgs funcAsArgs = new FuncAsArgs();
        funcAsArgs.register("John", funcAsArgs.sendWelcomeMail);

        // Function as a return type
        FuncAsReturnType funcAsReturnType = new FuncAsReturnType();
        System.out.println(funcAsReturnType.multiplyBy
                .apply(10)
                .apply(20));
    }
}
