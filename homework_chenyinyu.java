
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class homework_chenyinyu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ļ�·����");
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
			System.out.println("�ļ���ȡʧ�ܣ�");
		} finally {
			try {
				br.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// ��Сдת��Ϊ��д
		String res = content.toString().toUpperCase();
		System.out.println("������Ҫָ�����ļ�·����");
		String p = sc.nextLine();
		FileOutputStream outputStream = null;
		try {
			File nfile = new File(p);
			// 创建文件
			nfile.createNewFile();
			outputStream = new FileOutputStream(nfile);
			outputStream.write(res.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}