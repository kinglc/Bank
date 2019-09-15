package com.citi.feign;

import com.citi.dto.account.AccountDetail;
import com.citi.dto.account.Transactions;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
@FeignClient(value = "account", url = "https://sandbox.apihub.citi.com/gcb/api")
public interface AccountService {

    @GetMapping("/accounts")
    AccountService getAccounts();

    @GetMapping("/accounts/{accountId}")
    AccountDetail getAccountDetail(@PathVariable("accountId") String accountId);

    @GetMapping("/accounts/{accountId}/transactions")
    Transactions getTransactions(@PathVariable("accountId") String accountId);

}
