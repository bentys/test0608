package com.CityTest01;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class Common {
    /**
     *   * 解析Json内容
     *
     * @author Findyou
     * @version 1.0 2015/3/23
     * @return JsonValue 返回JsonString中JsonId对应的Value
     *
     *
     * */
    public static String getJsonValue(Map JsonString, String JsonId){
        String JsonValue="";
        if (JsonString.isEmpty()||JsonString==null){
            return "输入参数有无JsonString";

        }else if (JsonId==null||JsonId.isEmpty()){
            return "输入参数有无JsonId";

        }

//        JSONObject obj1=new JSONObject(JsonString);
        JSONObject obj1=new JSONObject(JsonString);

        JsonValue=(String)obj1.getString(JsonId);


        return  JsonValue;

    }

    public static void createJson() {
        JSONObject obj = new JSONObject();
        obj.put("name", "John");
        obj.put("sex", "male");
        obj.put("age", 22);
        obj.put("is_student", true);
        obj.put("hobbies", new String[] {"hiking", "swimming"});
        //调用toString()方法可直接将其内容打印出来

        System.out.println(obj.toString());
    }
}
