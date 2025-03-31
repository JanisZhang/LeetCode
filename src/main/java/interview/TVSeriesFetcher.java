package interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;

public class TVSeriesFetcher {

    private static final String BASE_URL = "https://jsonmock.hackerrank.com/api/tvseries";

        // 这个方法将获取所有页面的数据并返回符合条件的节目名称
    public static List<String> showsInProduction(int startYear, int endYear) {
        List<String> resultNames = new ArrayList<>();
        int currentPage = 1;
        int totalPages = 1;  // 初始页数为 1

        try {
            // 循环获取所有页面的数据
            while (currentPage <= totalPages) {
                // 拼接请求 URL
                String urlString = BASE_URL + "?page=" + currentPage;
                URL url = new URL(urlString);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("GET");

                // 获取响应内容
                InputStreamReader in = new InputStreamReader(httpURLConnection.getInputStream());
                BufferedReader bufferedReader = new BufferedReader(in);
                StringBuilder sb = new StringBuilder();
                String tempString;
                while ((tempString = bufferedReader.readLine()) != null) {
                    sb.append(tempString);
                }
                bufferedReader.close();

                // 将响应的 JSON 字符串转换为 JsonObject
                String jsonString = sb.toString();
                JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();

                // 获取 total_pages
                totalPages = jsonObject.get("total_pages").getAsInt();

                // 获取 "data" 数组
                JsonArray dataArray = jsonObject.getAsJsonArray("data");

                // 遍历每一条节目数据
                for (int i = 0; i < dataArray.size(); i++) {
                    JsonObject series = dataArray.get(i).getAsJsonObject();
                    String name = series.get("name").getAsString();  // 获取节目名称
                    String runtime = series.get("runtime").getAsString();  // 获取节目 runtime

                    // 解析 runtime 字段，拆分开始和结束年份
                    String[] years = runtime.split("-");

                    // 获取开始年份
                    int start = Integer.parseInt(years[0]);
                    // 如果有结束年份，获取结束年份；如果没有结束年份（即节目还在制作中），将 end 设置为 -1
                    int end = years.length > 1 && !years[1].isEmpty() ? Integer.parseInt(years[1]) : -1;

                    // 判断节目是否符合年份范围
                    if (startYear <= start && (endYear >= (end != -1 ? end : start) || end == -1)) {
                        resultNames.add(name);  // 如果符合条件，加入到结果列表中
                    }
                }

                // 移动到下一页
                currentPage++;
            }

        } catch (Exception e) {
            System.out.println("Exception is: " + e);
        }

        return resultNames;  // 返回符合条件的节目名称列表
    }

    public static void main(String[] args) {
            int startYear = 2000;
            int endYear = 2010;

            try {
                // 获取符合条件的节目名称列表
                List<String> seriesNames = showsInProduction(startYear, endYear);
                System.out.println("符合条件的节目名称:");
                for (String name : seriesNames) {
                    System.out.println(name);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


}
