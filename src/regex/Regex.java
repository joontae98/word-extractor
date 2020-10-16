package regex;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) throws IOException {

        // 프로젝트의 진행 순서
        // 1. .txt 파일 불러오기
        // 2. 정규 표현식을 이용하여 한 단어씩 나누기
        // 3. 각 단어를 HashMap에 추가
        // 3. 중복을 제외한 총 단어 수, 단어 수 내림차순 정렬과 빈도수 출력

        File file = new File("D:/workspace/IdeaProjects/word_extractor/little_prince_en.txt");
        try {

            Pattern p = Pattern.compile("\\b\\w+\\b"); // \b 문장에서의 단어의 경계
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = br.readLine();
            HashMap<String, Integer> map = new HashMap<>();

            while (str != null) {
                Matcher m = p.matcher(str);
                while (m.find()) {
                    if (map.containsKey(m.group())) {
                        map.put(m.group(), map.get(m.group())+1);
                    } else {
                        map.put(m.group(), 1);
                    }
                }
                str = br.readLine();
            }

            List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
            Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() { //비교함수 Comparator를 사용
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue()); // A>B 1 리턴, A=B 0 리턴, A<B -1 리턴
                    // -1 리턴 시 앞으로 정렬
                }
            });
            for (Map.Entry<String, Integer> entry : entries) {
                System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
            }

            System.out.println("총 단어 수: "+map.size());

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
