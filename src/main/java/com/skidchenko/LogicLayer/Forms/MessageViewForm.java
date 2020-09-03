package com.skidchenko.LogicLayer.Forms;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class MessageViewForm {

    private String messageType;
    private Long userId;

//    public void setMessageType(String messageType) throws Exception {
//        switch (messageType) {
//            case ("ALL"):
//            case ("SENT"):
//            case ("RECEIVED"):
//                this.messageType = messageType;
//                break;
//            default:
//                throw new Exception("Unhandled type of message list");
//        }
//        this.messageType = messageType;
//
//    }
}
