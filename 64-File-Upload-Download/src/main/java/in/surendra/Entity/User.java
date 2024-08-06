package in.surendra.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private Integer id;
	private String name;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
