package insper.store.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class AccountResource implements AccountController {

    @GetMapping("/accounts/info")
    public String info() {
        return "Account service";
    }

    @Override
    public ResponseEntity<AccountOut> create(AccountIn in) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public ResponseEntity<AccountOut> update(String id, AccountIn in) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
