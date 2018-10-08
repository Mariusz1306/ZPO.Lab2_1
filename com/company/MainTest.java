package com.company;

import org.junit.jupiter.api.Assertions;

import static com.company.Main.LevQWERTY;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void levQWERTY() {
        Assertions.assertEquals(1.5, LevQWERTY("kot", "kita"));
        Assertions.assertEquals(0.5, LevQWERTY("kwiat", "kwist"));
        Assertions.assertEquals(2.0, LevQWERTY("drab", "dal"));
        Lev one = new Lev("kot", "kita");
        Lev two = new Lev("kwiat", "kwist");
        Lev three = new Lev("drab", "dal");
        Assertions.assertEquals(1.5, one.LevQWERTY());
        Assertions.assertEquals(0.5, two.LevQWERTY());
        Assertions.assertEquals(2.0, three.LevQWERTY());
    }
}