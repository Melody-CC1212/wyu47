
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class homework_chenyinyu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件路径：");
		String s = sc.nextLine();
		File file = new File(s);
		InputStreamReader in = null;
		BufferedReader br = null;
		StringBuilder content = null;
		try {
			in = new InputStreamReader(new FileInputStream(file), "UTF-8");
			br = new BufferedReader(in);
			content = new StringBuilder();
			while ((s = br.readLine()) != null) {
				content = content.append(s + "\n");
			}
		} catch (IOException e) {
			System.out.println("文件读取失败：");
		} finally {
			try {
				br.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(content.toString());

	}
}