package com.citi.feign;

import com.citi.dto.moneymovement.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
@FeignClient(value = "money-movement", url = "https://sandbox.apihub.citi.com/gcb/api")
public interface MoneyMovementService {
    @GetMapping("/v1/moneyMovement/payees/sourceAccounts")
    SourceAccounts getSourceAccounts();

    @GetMapping("/v1/moneyMovement/payees")
    List<Payee> getPayeeList();

    @GetMapping("/v1/moneyMovement/personalDomesticTransfers/destinationAccounts/sourceAccounts")
    PersonalSourceAccounts getPersonalSourceAccounts();

    @PostMapping("/v1/moneyMovement/personalDomesticTransfers/preprocess")
    TransactionReview createPersonalTransfer(@RequestBody PersonalDomesticTransfer personalDomesticTransfer);

    @PostMapping("/v1/moneyMovement/personalDomesticTransfers")
    ConfirmationNumber confirmPersonalTransfer(@RequestParam(value = "controlFlowId") String controlFlowId);

    @GetMapping("/v1/moneyMovement/internalDomesticTransfers/payees/sourceAccounts")
    InternalDomesticTransfer getInternalDomesticTransfer();

    @PostMapping("/v1/moneyMovement/internalDomesticTransfers/preprocess")
    TransactionPreConfirmation createInternalTransfer(@RequestBody InternalTransferVO internalTransferVO);

    @PostMapping("/v1/moneyMovement/internalDomesticTransfers")
    ConfirmationNumber confirmInternalTransfer(@RequestParam("controlFlowId") String controlFlowId);
}
