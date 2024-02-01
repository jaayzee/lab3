import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test 
	public void testFilter() {
    List<String> result1 = new ArrayList<>();
    result1.add("yes");
    result1.add("no");
    result1.add("no");
    result1.add("rando");
    StringCheck check = new StringCheck();
    List<String> answer = new ArrayList<>();
    answer.add("yes");
    answer.add("rando");
    assertEquals(answer, ListExamples.filter(result1, check));
    }

    @Test 
	public void testMerge() {
    List<String> result1 = new ArrayList<>();
    result1.add("a");
    result1.add("b");
    result1.add("bc");
    result1.add("bd");
    result1.add("c");
    List<String> result2 = new ArrayList<>();
    result2.add("ba");
    result2.add("bb");
    List<String> answer = new ArrayList<>();
    answer.add("a");
    answer.add("b");
    answer.add("ba");
    answer.add("bb");
    answer.add("bc");
    answer.add("bd");
    answer.add("c");
    assertEquals(answer, ListExamples.merge(result1, result2));
    }
}
