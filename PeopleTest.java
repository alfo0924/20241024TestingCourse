class PeopleTest {
    // 測試設定父親關係的方法
    @Test
    void test_set_father() {
        // 建立一個名為 Albert 的人物物件，身高 1.65
        People albert = new People(name: "Albert", height: 1.65);
        // 設定 jack 為 albert 的父親
        albert.setFather(jack);
        // 驗證 albert 的父親是否確實為 jack
        assertEquals(jack, albert.getFather());
    }

    // 測試兄弟姊妹關係判斷的方法
    @Test
    void test_isSibling() {
        // 建立兩個人物物件：albert 和 jie，都是身高 1.65
        People albert = new People(name: "Albert", height: 1.65);
        People jie = new People(name: "Albert", height: 1.65);
        // 設定 jack 為 albert 的父親
        albert.setFather(jack);
        // 將 jie 新增為 jack 的子女
        jack.addChild(jie);
        
        // 使用 assertAll 進行多項斷言測試
        assertAll("",
            // 驗證 albert 和 jie 互為兄弟姊妹關係
            ()->assertTrue(albert.isSibling(jie)),    // 檢查 albert 認為 jie 是兄弟姊妹
            ()->assertTrue(jie.isSibling(albert))     // 檢查 jie 認為 albert 是兄弟姊妹
        );
    }
}
