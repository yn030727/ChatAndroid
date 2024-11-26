package com.example.chatandroid.logic.model.debug;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lcom/example/chatandroid/logic/model/debug/NingInnerInterface;", "", "number", "", "getNumber", "()I", "printNum", "", "app_debug"})
public abstract interface NingInnerInterface {
    
    public abstract void printNum();
    
    public abstract int getNumber();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        public static int getNumber(@org.jetbrains.annotations.NotNull
        com.example.chatandroid.logic.model.debug.NingInnerInterface $this) {
            return 0;
        }
    }
}