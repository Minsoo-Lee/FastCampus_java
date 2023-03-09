import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<List<String>> forms = new ArrayList<>();
        List<String> s = new ArrayList<>();
        forms.add(Arrays.asList("jm@email.com", "제이엠"));
        forms.add(Arrays.asList("jason@email.com", "제이슨"));
        forms.add(Arrays.asList("woniee@email.com", "워니"));
        forms.add(Arrays.asList("mj@email.com", "엠제이"));
        forms.add(Arrays.asList("nowm@email.com", "이제엠"));

        List<String> answer = new ArrayList<>();
        List<String> names = getName(forms);
        List<List<String>> nameCases = new ArrayList<>();
        for (String name : names) {
            nameCase.add(getCase(name));
        }
        for (List<String> nameCase : nameCases) {

        }
        System.out.println(nameCase);
    }
    public static void subStrName(String name, List<String> cases, int length) {
        for (int i = 0; i <= name.length() - length; i++) {
            cases.add(name.substring(i, i + length));
        }
    }
    public static List<String> getCase(String name) {
        List<String> cases = new ArrayList<>();
        for (int length = 2; length <= name.length(); length++) {
            subStrName(name, cases, length);
        }
        return cases;
    }
    public static List<String> getName(List<List<String>> forms) {
        List<String> name = new ArrayList<>();
        for (List<String> form : forms) {
            name.add(form.get(1));
        }
        return name;
    }
}
