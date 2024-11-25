package com.example.account.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND("사용자가 없습니다."),
    MAX_ACCOUNT_PER_USER_10("사용자 계좌는 최대 10개입니다."),
    INVALID_ACCOUNT_ID("유효하지 않은 계좌 ID입니다."),
    ACCOUNT_NOT_FOUND("계좌를 찾을 수 없습니다.");

    private final String description;
}
