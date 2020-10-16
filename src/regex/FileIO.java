package regex;

import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws IOException {

        //파일 출력
//        try {
//
//            OutputStream output = new FileOutputStream("D:/workspace/IdeaProjects/word_extractor/Output.txt");
//            String str = "Hello World!";
//            byte[] by = str.getBytes();
//            output.write(by); //.write() 메소드는 byte형으로만 넣을 수 있다.
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //파일 입력
//        try {
//
//            File file = new File("D:/workspace/IdeaProjects/word_extractor/Output.txt");
//            FileReader file_reader = new FileReader(file);
//            int cur = file_reader.read();    //.read() 메소드의 리턴이 int형이기 때문에 cur를 int형으로 선언해주어야 한다.
//            while (cur != -1) {  //-1을 EOP 라고 부르며 파일의 끝을 나타낸다.
//                System.out.print((char) cur);
//            }
//            file_reader.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //메모리 버퍼를 사용하는 이유
        // 1. 프로그램은 직접 하드디스크에서 데이터를 가져오지 않고 메모리 버퍼로 데이터를 가져오는 방식으로 읽는 속도를 향상할 수 있다.
        // 2.메모리 버퍼는 데이터가 쌓이기를 기다렸다가 꽉 차게 되면 한 번에 읽는 방식으로 입력 횟수를 줄인다.

        //메모리 버퍼를 이용한 파일 출력
//        BufferedOutputStream bos = null;
//        try {
//
//            bos = new BufferedOutputStream(new FileOutputStream("D:/workspace/IdeaProjects/word_extractor/Output.txt"));
//            String str = "Hello World! with BufferOutputStream.";
//            bs.write(str.getBytes());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            bos.close();
//        }

        //메모리 버퍼를 이용한 파일 입력
//        File file = new File("D:/workspace/IdeaProjects/word_extractor/Output.txt");
//        try {
//
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String str = br.readLine();
//
//            while (str != null) {
//                System.out.print(str);
//                str = br.readLine();
//            }
//            br.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
