package com.citi.feign;

import com.citi.dto.cards.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
@FeignClient(value = "cards", url = "https://sandbox.apihub.citi.com/gcb/api")
public interface CardsService {

    @PutMapping("/v1/cards/{cardId}/activations/{cardActivationCode}")
    Activation activateCard(@PathVariable("cardId") String cardId, @PathVariable("cardActivationCode") String cardActivationCode);

    @PutMapping("/v1/cards/{cardId}/overseasUsage")
    OverseasActivation activeOverseasCard(@PathVariable("cardId") String cardId);

    @GetMapping("/v1/cards")
    List<CardDetail> retrieveCards();

    @GetMapping("/v1/creditCards/{cardId}/transactions/eligibility/easyPaymentPlan")
    EasyPaymentPlan checkEligibilityEasyPaymentPlan(@PathVariable("cardId") String cardId);

    @PostMapping("/v1/creditCards/{cardId}/easyPaymentPlans/bookings")
    EasyPaymentPlanAcknowledgement bookEasyPaymentPlan(@PathVariable("cardId") String cardId);

    @GetMapping("/v1/creditCards/{cardId}/easyPaymentPlans/repaymentSchedules")
    RepaymentSchedules viewRepaymentSchedules(@PathVariable("cardId") String cardId);



}
