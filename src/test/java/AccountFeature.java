import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;


public class AccountFeature {

    @Test
    public void shouldPrintStatementAfterDepositAndWithdraw() throws Exception {
        // given
        Account account = new Account();
        account.deposit(500);
        account.withdraw(100);
        // when
        String statement = account.printStatement();
        // then
        assertThat(statement).isEqualTo(
                "Date        Amount  Balance\n"+
                "24.12.2015   +500      500\n"+
                "23.8.2016    -100      400");

    }
}
