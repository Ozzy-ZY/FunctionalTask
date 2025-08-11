package functional;

import java.util.function.Consumer;

public class FuncAsArgs {
    public void register(String name, Consumer<String> callback){
        // some logic here
        callback.accept(name+ "@gmail.com");
    }
    public Consumer<String> sendWelcomeMail = (mail) -> System.out.println("MAILING: " + mail);

}
