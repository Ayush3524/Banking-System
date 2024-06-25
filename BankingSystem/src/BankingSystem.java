import com.system.services.UserMenu;

import java.io.IOException;

public class BankingSystem {
    public static void main(String[] args) throws IOException, InterruptedException {
        UserMenu menu = new UserMenu();
        menu.userMenu();
    }
}
