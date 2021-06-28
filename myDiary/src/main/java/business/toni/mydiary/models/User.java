package business.toni.mydiary.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private Diary diary;
}
