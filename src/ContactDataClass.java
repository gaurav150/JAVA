import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactDataClass {
    private static final String phoneData = """
            Charlie Brown, 3334445555
            Maid Marion, 1234567890
            Mickey Mouse, 9998887777
            Mickey Mouse, 1247489758
            Minnie Mouse, 4567805666
            Robin Hood, 5647893000
            Robin Hood, 7899028222
            Lucy Van Pelt, 5642086852
            Mickey Mouse, 9998887777
            """;

    private static final String emailData = """
            Mickey Mouse, mckmouse@gmail.com
            Mickey Mouse, micky1@aws.com
            Minnie Mouse, minnie@verizon.net
            Robin Hood, rhood@gmail.com
            Linus Van Pelt, lvpelt2015@gmail.com
            Daffy Duck, daffy@google.com
            """;

    public static List<ContactClass> getData(String type) {
        List<ContactClass> dataList = new ArrayList<>();
        Scanner scanner = new Scanner(type.equals("phone") ? phoneData : emailData);
        while (scanner.hasNext()) {
            String[] data = scanner.nextLine().split(",");
            if (data.length < 2) continue;
            String name = data[0].trim();
            String value = data[1].trim();
//            Arrays.asList(data).replaceAll(String::trim);
            if (type.equals("phone")) {
                if (value.matches("\\d{10}")) { // ensure exactly 10 digits
                    dataList.add(new ContactClass(name, Long.parseLong(value)));
                } else {
                    System.out.println("⚠ Skipping invalid phone for " + name + ": " + value);
                }
            } else if (type.equals("email")) {
                dataList.add(new ContactClass(name, value));
            }
        }
        return dataList;
    }
}
