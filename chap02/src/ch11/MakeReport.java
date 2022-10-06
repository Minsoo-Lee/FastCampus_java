package ch11;

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line = "====================================================\n";
    private String title = "\t이름\t\t\t\t주소\t\t\t\t전화번호\n";
    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody() {
        buffer.append("\tJames\t\t");
        buffer.append("Seoul Korea\t\t");
        buffer.append("010-2222-3333\n");

        buffer.append("\tThomas\t\t");
        buffer.append("NewYork US\t\t");
        buffer.append("010-7777-8888\n");
    }

    private void makeFooter() {
        buffer.append(line);
    }

    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}
