package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @author Jiang-gege
 * 2018/3/2910:28
 */
@Getter
public enum PayStatusEnum {

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
