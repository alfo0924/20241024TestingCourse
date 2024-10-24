class PeopleTest {
    @Test
    void test_set_father() {
        People albert = new People(name: "Albert", height: 1.65);
        albert.setFather(jack);
        assertEquals(jack, albert.getFather());
    }

    @Test
    void test_isSibling() {
        People albert = new People(name: "Albert", height: 1.65);
        People jie = new People(name: "Albert", height: 1.65);
        albert.setFather(jack);
        jack.addChild(jie);
        assertAll("",
            ()->assertTrue(albert.isSibling(jie)),
            ()->assertTrue(jie.isSibling(albert))
        );
    }
}
