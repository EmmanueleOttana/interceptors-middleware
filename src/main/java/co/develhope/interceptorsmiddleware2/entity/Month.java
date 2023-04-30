package co.develhope.interceptorsmiddleware2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Month {

    private int monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;

}
