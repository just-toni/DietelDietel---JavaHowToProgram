package business.toni.mydiary.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Diary {

    private Diary diary;
    private List<Entry> entries = new ArrayList<>();
}
