package lk.ijse.gdse.aad68.introwithsprinweb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item implements Serializable {
    private List<String> [] id;
    private List<String> [] desc;
}
