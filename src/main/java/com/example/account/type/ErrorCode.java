package com.example.account.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND("사용자가 없습니다."),
    ACCOUNT_NOT_FOUND("계좌를 찾을 수 없습니다."),
    AMOUNT_EXCEED_BALANCE("거래 금액이 계좌 잔액보다 큽니다."),
    USER_ACCOUNT_UN_MATCH("사용자와 계좌의 소유주가 다릅니다."),
    ACCOUNT_ALREADY_UNREGISTERED("계좌가 이미 해지되었습니다."),
    BALANCE_NOT_EMPTY("잔액이 있는 계좌는 해지할 수 없습니다."),
    MAX_ACCOUNT_PER_USER_10("사용자 계좌는 최대 10개입니다."),
    INVALID_ACCOUNT_ID("유효하지 않은 계좌 ID입니다.");

    private final String description;
}
