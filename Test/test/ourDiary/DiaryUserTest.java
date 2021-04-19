package ourDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryUserTest {
    User joy;
    Diary relationshipDiary;

    @BeforeEach
    void startWith(){
        relationshipDiary = new Diary();
        joy = new User("Joy", relationshipDiary);
    }

    @Test
    void userHasADiary(){
        assertNotNull(joy.getDiary());
    }

    @Test
    void userCanWriteInDiary() {
        //given
        joy.createEntry("""
                Today I was sad,
                I bought two pairs of Nike Air Force One's.
                After buying these shoes, I discovered I used the someone else's account.
                """);
    }

}
