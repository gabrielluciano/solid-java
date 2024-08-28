package com.gabrielluciano.solid.srp.refactor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ItemTest {

    @Test
    void testCriarItem() {
        Item item = new Item("nome", 10.0);
        assertEquals("nome", item.getDescricao());
        assertEquals(10.0, item.getValor());
    }

    @Test
    void testDescricaoInvalida() {
        assertThrows(IllegalArgumentException.class, () -> new Item(null, 10.0));
        assertThrows(IllegalArgumentException.class, () -> new Item("", 10.0));
    }

    @Test
    void testValorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Item("descricao", null));
        assertThrows(IllegalArgumentException.class, () -> new Item("descricao", -1.0));
    }

    @Test
    void testEqualsAndHashCode() {
        Item item1 = new Item("geladeira", 10.0);
        Item item2 = new Item("geladeira", 11.0);
        Item item3 = new Item("tv", 11.0);

        assertEquals(item1, item2); // mesma descricao
        assertEquals(item1.hashCode(), item2.hashCode());

        assertNotEquals(item1, item3); // descricao diferente
        assertNotEquals(item1.hashCode(), item3.hashCode());
    }
}
