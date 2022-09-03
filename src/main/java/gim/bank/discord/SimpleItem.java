package gim.bank.discord;

import lombok.Value;

// Taken and modified from https://github.com/Lazyfaith/runelite-bank-memory-plugin/blob/master/src/main/java/com/bankmemory/data/BankItem.java

@Value
public class SimpleItem {
    int itemId;
    int quantity;
}
